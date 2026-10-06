package algorithms.Lab_1_algorithms.src.test.java.Lab_1_algorithms.tests;

import org.junit.jupiter.api.DisplayName;

import algorithms.Lab_1_algorithms.FactorialTask;

import java.math.BigInteger;

@DisplayName("Факториал с результатом типа BigInteger")
class FactorialTaskBigIntegerTest extends FactorialTaskContractTest {

    @Override
    long factorial(long n) {
        return FactorialTask.f(BigInteger.valueOf(n)).longValueExact();
    }
}
