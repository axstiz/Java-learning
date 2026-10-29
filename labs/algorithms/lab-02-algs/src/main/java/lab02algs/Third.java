package lab02algs;

import java.util.Arrays;

public class Third {

    public static void main(String[] args) {
        int[][] tests = {
                {9999, 12, 100, 12},
                {7, 70, 700},
                {0, 9999, 0},
                {5}
        };
        for (int[] test : tests) {
            int[] arr = Arrays.copyOf(test, test.length);
            sort(arr);
            System.out.println(Arrays.toString(test) + " -> " + Arrays.toString(arr));
        }
    }

    public static void sort(int[] arr) {
        if (arr.length == 0) return;

        int max = arr[0];
        for (int val : arr) {
            if (val < 0) {
                throw new IllegalArgumentException("номер " + val + " отрицательный");
            }
            max = Math.max(max, val);
        }

        for (int place = 1; max / place > 0; place *= 10) {
            countingSortByDigit(arr, place);
        }
    }

    private static void countingSortByDigit(int[] arr, int place) {
        int[] count = new int[10];
        for (int val : arr) {
            count[(val / place) % 10]++;
        }

        for (int digit = 1; digit < 10; digit++) {
            count[digit] += count[digit - 1];
        }

        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[(arr[i] / place) % 10]] = arr[i];
        }

        System.arraycopy(result, 0, arr, 0, result.length);
    }

}
