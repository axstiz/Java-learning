package lab02langs;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Введите n:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
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
        System.out.printf("sum: %.1f%n", calculateSum(n));
    }
    public static double calculateSum(int n) {
        double sum = 1.1;
        for (int i = 1; i < n; i++) {
            sum += Math.pow(-1, i) * (1.1 + i * 0.1);
        }
        return sum;
    }

}
