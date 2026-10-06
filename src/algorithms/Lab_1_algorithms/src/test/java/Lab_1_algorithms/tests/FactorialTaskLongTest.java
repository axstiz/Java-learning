package algorithms.Lab_1_algorithms.src.test.java.Lab_1_algorithms.tests;

import org.junit.jupiter.api.DisplayName;

import algorithms.Lab_1_algorithms.FactorialTask;

@DisplayName("Факториал с результатом типа long")
class FactorialTaskLongTest extends FactorialTaskContractTest {

    @Override
    long factorial(long n) {
        return FactorialTask.f(n);
    }
}
