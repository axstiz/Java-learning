package algorithms.Lab_1_algorithms.src.test.java.Lab_1_algorithms.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import algorithms.Lab_1_algorithms.FactorialTask;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Сравнивает две реализации факториала и находит границу, на которой
 * версия с типом long перестаёт давать верный результат.
 */
class FactorialTaskOverflowTest {

    private static final int LAST_EXACT_N = 20;

    @Test
    @DisplayName("До n = 20 включительно обе реализации дают одинаковый результат")
    void versionsAgreeUpToTwenty() {
        for (int n = 0; n <= LAST_EXACT_N; n++) {
            assertEquals(FactorialTask.f(BigInteger.valueOf(n)), BigInteger.valueOf(FactorialTask.f(n)),
                    "Расхождение на n = " + n);
        }
    }

    @Test
    @DisplayName("Первое n, на котором long дает неверный результат — 21")
    void longVersionBreaksAtTwentyOne() {
        assertEquals(LAST_EXACT_N + 1, firstIncorrectN());
    }

    @Test
    @DisplayName("На n = 21 long переполняется и дает отрицательное число")
    void longOverflowsIntoNegative() {
        assertEquals(-4249290049419214848L, FactorialTask.f(21));
        assertTrue(FactorialTask.f(21) < 0, "После переполнения long ожидается отрицательное число");
    }

    @Test
    @DisplayName("BigInteger остается точным там, где long уже переполнен")
    void bigIntegerStaysExactBeyondLongRange() {
        assertEquals(new BigInteger("51090942171709440000"), FactorialTask.f(BigInteger.valueOf(21)));
        assertEquals(new BigInteger("25852016738884976640000"), FactorialTask.f(BigInteger.valueOf(23)));
        assertEquals(new BigInteger("265252859812191058636308480000000"), FactorialTask.f(BigInteger.valueOf(30)));
    }

    /** Первое n, на котором long-версия расходится с точной BigInteger-версией. */
    private static int firstIncorrectN() {
        for (int n = 0; n <= 100; n++) {
            BigInteger exact = FactorialTask.f(BigInteger.valueOf(n));
            if (!exact.equals(BigInteger.valueOf(FactorialTask.f(n)))) {
                return n;
            }
        }
        return -1;
    }
}
