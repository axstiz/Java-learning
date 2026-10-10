package lab02langs;
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = 0;
        while (true) {
            System.out.println("Введите n:");
            if (scanner.hasNextLong()) {
                n = scanner.nextLong();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: N должно быть больше 0.");
                }
            } else {
                System.out.println("Ошибка: введите целое число, а не текст!");
                scanner.next();
            }
        }
        System.out.printf("Digits:%n-------%n");
        printDigits(n);
    }

    public static void printDigits(long n) {
        while (n > 0) {
            System.out.println(n%10);
            n /= 10;
        }
    }

}
