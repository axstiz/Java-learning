package algorithms.Lab_1_algorithms.src.test.java.Lab_1_algorithms.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import algorithms.Lab_1_algorithms.SecondTask;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondTaskTest {

    @Test
    @DisplayName("Проверка из условия: first = 12, difference = -3, n = 4 дает 0")
    void assignmentCheckNegativeDifference() {
        assertEquals(0, SecondTask.signalPower(12, -3, 4));
    }

    @Test
    @DisplayName("Проверка из условия: first = 5, difference = 2, n = 3 дает 11")
    void assignmentCheckPositiveDifference() {
        assertEquals(11, SecondTask.signalPower(5, 2, 3));
    }

    @Test
    @DisplayName("Проверка из условия: n = 0 дает first")
    void assignmentCheckZeroNGivesFirst() {
        assertEquals(42, SecondTask.signalPower(42, 7, 0));
    }

    @Test
    @DisplayName("Результат равен first + n * difference на всем диапазоне")
    void matchesClosedFormAcrossRange() {
        for (int first = 0; first <= 20; first++) {
            for (int difference = -10; difference <= 10; difference++) {
                for (int n = 0; n <= 20; n++) {
                    assertEquals(first + n * difference,
                            SecondTask.signalPower(first, difference, n),
                            "Расхождение: first=" + first
                                    + ", difference=" + difference
                                    + ", n=" + n);
                }
            }
        }
    }

    @Test
    @DisplayName("difference = 0 оставляет сигнал неизменным на любом участке")
    void zeroDifferenceKeepsSignal() {
        for (int n = 0; n <= 10; n++) {
            assertEquals(13, SecondTask.signalPower(13, 0, n), "Расхождение на n = " + n);
        }
    }

    @Test
    @DisplayName("Отрицательный difference уменьшает сигнал на каждом участке")
    void negativeDifferenceDecreasesSignal() {
        assertEquals(9, SecondTask.signalPower(12, -1, 3));
        assertEquals(6, SecondTask.signalPower(12, -2, 3));
    }
}
