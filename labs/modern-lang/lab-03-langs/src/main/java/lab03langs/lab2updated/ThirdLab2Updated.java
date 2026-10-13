package lab03langs.lab2updated;

import java.util.Scanner;
import java.util.Arrays;

public class ThirdLab2Updated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольное приложение 'Вывод всех цифр числа начиная с разряда единиц' ===");
        System.out.println("Доступные команды: info, do, check, exit");
        runMenu(scanner);
    }

    public static void runMenu(Scanner scanner) {
        while (true) {
            System.out.print("\nВведите команду: ");
            String command = scanner.next().trim().toLowerCase();

            switch (command) {
                case "info" -> {
                    System.out.println("\n--- Информация о программе ---");
                    System.out.println("Программа выводит цифрыы числа по порядку в столбик, начиная с разряда единиц");
                    System.out.println("Разработчик: Вахрушев Матвей Евгеньевич [РИ-250912]");
                    System.out.println("---------------------------------------------------");
                }
                case "do" -> {
                    System.out.println("\n--- Запуск программы ---");
                    long n = input("N");
                    int[] result = genDigits(n);
                    System.out.print("Digits: " + java.util.Arrays.toString(result));
                }
                case "check" -> {
                    System.out.println("\n--- Запуск проверки ---");
                    for (long n = 1; n < 1000000000; n = n * 11 + 2) {
                        System.out.printf("n = %d%n", n);
                        int[] result = genDigits(n);
                        System.out.print("Digits: " + java.util.Arrays.toString(result));
                        System.out.println("\n------------------------------------");
                    }
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

    public static int[] genDigits(long n) {
        int len = (n == 0) ? 1 : 1 + (int)Math.log10(n);
        int[] digits = new int[len];
        int i = 0;
        while (n > 0) {
            digits[i] = (int)n%10;
            n /= 10;
            i++;
        }
        return digits;
    }

}
