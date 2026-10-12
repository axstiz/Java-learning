package lab03langs;

import java.util.Scanner;
import java.util.Arrays;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Создание массива С, где C_i = max(A_i, B_i)' ===");
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
                    System.out.println("Программа собирает массив С, где C_i = max(A_i, B_i)");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    int len = input_len(scanner);
                    System.out.println("Arr A");
                    int[] a = input_arr(scanner, len);
                    System.out.println("Arr B");
                    int[] b = input_arr(scanner, len);

                    int[] c = generateC(a, b);
                    System.out.println("arr C: " + Arrays.toString(c));
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
        System.out.print("Введите длину: ");
        int len = scanner.nextInt();
        return len;
    }

    public static int[] input_arr(Scanner scanner, int len) {
        int[] arr = new int[len];
        System.out.println("Введите числа (по 1 в строке):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] generateC(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = (a[i] > b[i] ? a[i] : b[i]);
        }
        return c;
    }
}
