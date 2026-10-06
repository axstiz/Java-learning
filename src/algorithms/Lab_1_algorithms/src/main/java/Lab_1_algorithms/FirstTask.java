package algorithms.Lab_1_algorithms.src.main.java.Lab_1_algorithms;
import java.util.List;

public class FirstTask {

    public static void main(String[] args) {
        // Пример для проверки: массив {4, 7, 2}
        List<Integer> list = List.of(4, 7, 2);

        // Тест 1: массив {4, 7, 2} с индекса 0 -> Ожидается: 3
        System.out.println("Элементов с индекса 0: " + countElements(0, list));

        // Тест 2: массив {4, 7, 2} с индекса 1 -> Ожидается: 2
        System.out.println("Элементов с индекса 1: " + countElements(1, list));

        // Тест 3: пустой массив с индекса 0 -> Ожидается: 0
        List<Integer> emptyList = List.of();
        System.out.println("Элементов в пустом массиве: " + countElements(0, emptyList));
    }

    public static int countElements(int index, List<Integer> list) {
        if (index < 0 || index >= list.size()) {
            return 0;
        }
        return 1 + countElements(index + 1, list);
    }
}
