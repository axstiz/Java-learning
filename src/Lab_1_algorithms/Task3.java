package Lab_1_algorithms;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scannerN = new Scanner(System.in);
        System.out.println("Введите количество скобочек:");
        double n = scannerN.nextDouble();
        parentheses(n);
    }

    public static void parentheses(double n) {
        if (n < 0 || n % 2 != 0) {
            System.out.println("Число должно быть четным и положительным!");
            return;
        }
        double opened = n / 2;
        double closed = n / 2;
        String s = "";
        generate(opened, closed, s);
    }

    public static void generate(double opened, double closed, String s) {
        if (closed == 0 && opened == 0) {
            System.out.println(s);
            return;
        };
        if (opened > 0) {
            generate(opened-1, closed, s + "(");
        };
        if (opened < closed) {
            generate(opened, closed-1, s + ")");
        }
    }
}
