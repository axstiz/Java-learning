package Lab_1_algorithms;

public class Task2 {

    public static void main(String[] args) {

        // Тест 1: -> Ожидается: 0
        System.out.println("signalPower: " + signalPower(12, -3, 4));

        // Тест 2:  -> Ожидается: 11
        System.out.println("signalPower: " + signalPower(5, 2, 3));

        // Тест 3: -> Ожидается: 13
        System.out.println("signalPower: " + signalPower(13, 1, 0));
    }

    public static int signalPower(int signal, int n, int difference) {
        if (n == 0) {
            return signal;
        }
        return signalPower(signal, difference, n - 1) + difference;
    }
}
