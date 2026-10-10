package lab02langs.lab1updated;
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Сравнение чисел X и Y' ===");
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
                    System.out.println("Программа сравнивает два числа и возвращает номер меньшего");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск расчета ---");
                    double x = input(scanner, "x");
                    double y = input(scanner, "y");

                    System.out.println("Результат сравнения: " + comparison(x, y));
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

    public static int comparison(double x, double y) {
        return x > y ? 2 : 1;
    }
}
