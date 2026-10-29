package lab01.tests;

import org.junit.jupiter.api.DisplayName;

import lab01.FactorialTask;

import java.math.BigInteger;

@DisplayName("Факториал с результатом типа BigInteger")
class FactorialTaskBigIntegerTest extends FactorialTaskContractTest {

    @Override
    long factorial(long n) {
        return FactorialTask.f(BigInteger.valueOf(n)).longValueExact();
    }
}
