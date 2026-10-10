package lab02langs.lab1updated;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Расчет функции Y' ===");
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
                    System.out.println("Программа вычисляет значение функции: y = 4*x^3 + 23*x - 55");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск расчета ---");
                    double x = input(scanner, "x");
                    System.out.printf("Результат -> y = %.4f%n", calculateY(x));
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }

    public static double input(Scanner scanner, String title) {
        double value = 0;
        while (true) {
            System.out.printf("Введите значение (%s): ", title);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ошибка: введите число, а не текст!");
                scanner.next();
            }
        }
        return value;
    }

    public static double calculateY(double x) {
        return 4 * Math.pow(x, 3) + 23 * x - 55;
    }
}
