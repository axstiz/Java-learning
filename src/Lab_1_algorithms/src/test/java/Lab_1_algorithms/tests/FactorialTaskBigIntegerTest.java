package Lab_1_algorithms.tests;

import Lab_1_algorithms.FactorialTask;
import org.junit.jupiter.api.DisplayName;

import java.math.BigInteger;

@DisplayName("Факториал с результатом типа BigInteger")
class FactorialTaskBigIntegerTest extends FactorialTaskContractTest {

    @Override
    long factorial(long n) {
        return FactorialTask.f(BigInteger.valueOf(n)).longValueExact();
    }
}