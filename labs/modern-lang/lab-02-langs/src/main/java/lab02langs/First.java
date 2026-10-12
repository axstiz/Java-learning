package lab02langs;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Расчет функции tg(x)' ===");
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
                    System.out.println("Программа выводит значения tg(x), 0 <= x <= 90");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    printTg();
                }
                case "exit" -> {
                    System.out.println("Выход из программы. Пока!");
                    return;
                }
                default -> System.out.println("Ошибка: неизвестная команда! Используйте: info, do или exit.");
            }
        }
    }

    public static void printTg() {
        for (double degrees = 0; degrees <= 90; degrees += 5 ) {
            if (degrees == 90.0) {
                System.out.printf("tg(%.0f) не существует (не определён)%n", degrees);
            } else {
                double radians = Math.toRadians(degrees);
                double result = Math.tan(radians);
                System.out.printf("tg(%.0f) = %.5f%n", degrees, result);
            }
        }
    }

}
