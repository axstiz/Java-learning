package algorithms.Lab_1_algorithms.src.test.java.Lab_1_algorithms.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Общий контракт факториала. Проверки базового и рекурсивного случаев
 * объявлены один раз и выполняются для каждой реализации — см.
 * FactorialTaskLongTest и FactorialTaskBigIntegerTest.
 *
 * Диапазон ограничен n <= 20: дальше long уже переполняется, и сравнение
 * точности вынесено в FactorialTaskOverflowTest.
 */
abstract class FactorialTaskContractTest {

    /** Реализация факториала под тестом. */
    abstract long factorial(long n);

    @Test
    @DisplayName("Базовый случай: 0! = 1")
    void zeroFactorialIsOne() {
        assertEquals(1L, factorial(0));
    }

    @Test
    @DisplayName("Базовый случай: 1! = 1")
    void oneFactorialIsOne() {
        assertEquals(1L, factorial(1));
    }

    @Test
    @DisplayName("Рекурсивный случай: 2! = 2, 3! = 6, 5! = 120")
    void smallValuesAreExact() {
        assertEquals(2L, factorial(2));
        assertEquals(6L, factorial(3));
        assertEquals(120L, factorial(5));
    }

    @Test
    @DisplayName("Рекурсивный случай: 10! = 3628800")
    void tenFactorialIsExact() {
        assertEquals(3628800L, factorial(10));
    }

    @Test
    @DisplayName("Рекурсивный случай: 20! = 2432902008176640000 — последнее точное значение в long")
    void twentyFactorialIsExact() {
        assertEquals(2432902008176640000L, factorial(20));
    }
}
