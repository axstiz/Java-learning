package Lab_1_algorithms.tests;

import Lab_1_algorithms.FactorialTask;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Факториал с результатом типа long")
class FactorialTaskLongTest extends FactorialTaskContractTest {

    @Override
    long factorial(long n) {
        return FactorialTask.f(n);
    }
}