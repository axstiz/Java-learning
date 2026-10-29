package lab01.tests;

import org.junit.jupiter.api.DisplayName;

import lab01.FactorialTask;

@DisplayName("Факториал с результатом типа long")
class FactorialTaskLongTest extends FactorialTaskContractTest {

    @Override
    long factorial(long n) {
        return FactorialTask.f(n);
    }
}
