package lab03langs;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Вывод элементов с нечентными номерами (в порядке возрастания номера), затем с четными (в порядке убывания номера)' ===");
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
                    System.out.println("Программа выводит элементы с нечетными номерами, затем с четными");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    int[] arr = input_arr(scanner);
                    printOdd(arr);
                    printEven(arr);
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

    public static void printOdd(int[] arr) {
        System.out.print("Odd (ASC): ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printEven(int[] arr) {
        System.out.printf("%nEven (DESC): ");
        for (int i = arr.length - (arr.length % 2 == 0 ? 1 : 2); i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
