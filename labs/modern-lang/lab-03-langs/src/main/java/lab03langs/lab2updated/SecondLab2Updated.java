package lab03langs.lab2updated;

import java.util.Scanner;

public class SecondLab2Updated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Расчет суммы последовательности 1.1 - 1.2 + 1.3 -... длины N (без условных операторов)' ===");
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
                    System.out.println("Программа выводит сумму последовательности 1.1 - 1.2 + 1.3 -... длины N");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    long n = input("N");
                    System.out.printf("sum: %.1f%n", calculateSum(n));
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }


    public static long input(String title) {
        Scanner scanner = new Scanner(System.in);
        long value = 0;
        while (true) {
            System.out.printf("Введите %s:%n", title);
            if (scanner.hasNextLong()) {
                value = scanner.nextLong();
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: N должно быть больше 0.");
                }
            } else {
                System.out.println("Ошибка: введите число, а не текст!");
                scanner.next();
            }
        }
        return value;
    }

    public static double calculateSum(long n) {
        double sum = 1.1;
        for (int i = 1; i < n; i++) {
            sum += Math.pow(-1, i) * (1.1 + i * 0.1);
        }
        return sum;
    }

}
