package algorithms.Lab_1_algorithms.src.test.java.Lab_1_algorithms.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import algorithms.Lab_1_algorithms.FirstTask;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTaskTest {

    private static List<Integer> listOf(Integer... values) {
        return List.of(values);
    }

    @Test
    @DisplayName("Считает все элементы с индекса 0")
    void countsAllElementsFromIndexZero() {
        assertEquals(3, FirstTask.countElements(0, listOf(4, 7, 2)));
    }

    @Test
    @DisplayName("Считает элементы с индекса 1")
    void countsElementsFromIndexOne() {
        assertEquals(2, FirstTask.countElements(1, listOf(4, 7, 2)));
    }

    @Test
    @DisplayName("Пустой список дает 0")
    void emptyListGivesZero() {
        assertEquals(0, FirstTask.countElements(0, List.of()));
    }

    @Test
    @DisplayName("Индекс, равный размеру списка, дает 0")
    void indexEqualToSizeGivesZero() {
        assertEquals(0, FirstTask.countElements(3, listOf(4, 7, 2)));
    }

    @Test
    @DisplayName("Индекс больше размера списка дает 0")
    void indexGreaterThanSizeGivesZero() {
        assertEquals(0, FirstTask.countElements(100, listOf(4, 7, 2)));
    }

    @Test
    @DisplayName("Отрицательный индекс дает 0")
    void negativeIndexGivesZero() {
        assertEquals(0, FirstTask.countElements(-1, listOf(4, 7, 2)));
        assertEquals(0, FirstTask.countElements(-100, listOf(4, 7, 2)));
    }
}
