package Lab_1_algorithms;
import java.math.BigInteger;

public class FactorialTask {

    public static void main(String[] args) {

        // Тест 1: n = 2 -> Ожидается: 2
        System.out.println("F: " + f(2));
        System.out.println("F: " + f(BigInteger.valueOf(2)));

        // Тест 2: n = 5 -> Ожидается: 120
        System.out.println("F: " + f(5));
        System.out.println("F: " + f(BigInteger.valueOf(5)));
    }

    /**
     * Факториал в long. Переполняется начиная с n = 21.
     */
    public static long f(long n) {
        if (n <= 1) {
            return 1;
        }
        return f(n - 1) * n;
    }

    /**
     * Факториал в BigInteger. Переполнения не бывает.
     */
    public static BigInteger f(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        }
        return f(n.subtract(BigInteger.ONE)).multiply(n);
    }
}
