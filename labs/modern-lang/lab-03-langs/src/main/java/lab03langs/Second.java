package lab03langs;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Поиск количества участков, на которых элементы массива монотонно убывают' ===");
        System.out.println("Доступные команды: info, do, exit");
        runMenu(scanner);
    }

    public static void runMenu(Scanner scanner) {
        while (true) {
            System.out.print("\nВведите команду: ");
            String command = scanner.next().trim().toLowerCase();

            switch (command) {
                case "info" -> {
                    System.out.println("\n--- Информация о программе ---");
                    System.out.println("Программа находит количество участков, на которых элементы массива монотонно убывают");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    int[] arr = input_arr(scanner);
                    System.out.println("Количество участков убывания: " + findCount(arr));
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }

    public static int[] input_arr(Scanner scanner) {
        System.out.print("Введите длину: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        System.out.println("Введите числа (по 1 в строке):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findCount(int[] arr) {
        int count = 0;
        boolean end = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] >= arr[i]) {
                if (end) {
                    count += 1;
                    end = false;
                }
            } else {
                end = true;
            }
        }
        return count;
    }
}
