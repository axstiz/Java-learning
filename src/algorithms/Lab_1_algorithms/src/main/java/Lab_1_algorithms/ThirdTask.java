package algorithms.Lab_1_algorithms.src.main.java.Lab_1_algorithms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество скобочек:");
        double n = scanner.nextDouble();

        List<String> sequences = parentheses(n);
        if (sequences.isEmpty()) {
            System.out.println("Число должно быть четным и положительным!");
            return;
        }
        for (String sequence : sequences) {
            System.out.println(sequence);
        }
    }

    /**
     * Возвращает все корректные расстановки n пар скобок.
     * Для нечетного или отрицательного n возвращает пустой список.
     */
    public static List<String> parentheses(double n) {
        List<String> result = new ArrayList<>();
        if (n < 0 || n % 2 != 0) {
            return result;
        }
        generate(n / 2, n / 2, "", result);
        return result;
    }

    public static void generate(double opened, double closed, String s, List<String> result) {
        if (closed == 0 && opened == 0) {
            result.add(s);
            return;
        };
        if (opened > 0) {
            generate(opened-1, closed, s + "(", result);
        };
        if (opened < closed) {
            generate(opened, closed-1, s + ")", result);
        }
    }
}
