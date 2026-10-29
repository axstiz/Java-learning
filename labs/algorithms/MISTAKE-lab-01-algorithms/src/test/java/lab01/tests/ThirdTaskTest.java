package lab01.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lab01.ThirdTask;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThirdTaskTest {

    @Test
    @DisplayName("n = 2 дает единственную расстановку '()'")
    void twoPairsGiveSingleSequence() {
        assertEquals(List.of("()"), ThirdTask.parentheses(2));
    }

    @Test
    @DisplayName("n = 4 дает две расстановки")
    void fourPairsGiveTwoSequences() {
        assertEquals(List.of("(())", "()()"), ThirdTask.parentheses(4));
    }

    @Test
    @DisplayName("n = 6 дает пять расстановок")
    void sixPairsGiveFiveSequences() {
        assertEquals(
                List.of("((()))", "(()())", "(())()", "()(())", "()()()"),
                ThirdTask.parentheses(6)
        );
    }

    @Test
    @DisplayName("n = 0 дает одну пустую расстановку")
    void zeroGivesSingleEmptySequence() {
        assertEquals(List.of(""), ThirdTask.parentheses(0));
    }

    @Test
    @DisplayName("Нечетное n не дает расстановок")
    void oddNGivesNoSequences() {
        assertTrue(ThirdTask.parentheses(3).isEmpty());
        assertTrue(ThirdTask.parentheses(7).isEmpty());
    }

    @Test
    @DisplayName("Отрицательное n не дает расстановок")
    void negativeNGivesNoSequences() {
        assertTrue(ThirdTask.parentheses(-4).isEmpty());
    }
}
