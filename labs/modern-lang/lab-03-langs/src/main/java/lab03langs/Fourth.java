package lab03langs;

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Исправили текст приветствия
        System.out.println("=== Консольное приложение 'Вывод квадратной матрицы уголками' ===");
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
                    System.out.println("Программа выводит элементы квадратной матрицы 'уголками'");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    int len = input_len(scanner);

                    System.out.println("Ввод матрицы:");
                    int[][] matrix = input_matrix(scanner, len);

                    System.out.print("Результат обхода:");
                    printCorners(matrix);
                    System.out.println();
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }

    public static int input_len(Scanner scanner) {
        System.out.print("Введите размер квадратной матрицы (N): ");
        int len = scanner.nextInt();
        return len;
    }

    public static int[] input_arr(Scanner scanner, int len, int line) {
        int[] arr = new int[len];
        System.out.printf("Строка %d. ", line);
        System.out.println("Введите числа через пробел или Enter:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[][] input_matrix(Scanner scanner, int len) {
        int[][] matrix = new int[len][len];
        for (int i = 0; i < len; i++) {
            matrix[i] = input_arr(scanner, len, i);
        }
        return matrix;
    }

    public static void printCorners(int[][] matrix) {
        int n = matrix.length;
        for (int k = 0; k < n; k++) {
            for (int row = 0; row < n - k - 1; row++) {
                System.out.print("\n" + matrix[row][k]);
            }
            System.out.println();
            for (int col = k; col < n; col++) {
                System.out.print(matrix[n - k - 1][col] + " ");
            }
            System.out.println();
        }
    }
}
