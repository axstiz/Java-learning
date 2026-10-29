package lab02algs;

import java.util.Arrays;

public class Second {

    private static final int CODE_COUNT = 4;

    public static void main(String[] args) {
        int[][] tests = {
                {3, 0, 2, 3, 1},
                {1, 1, 0, 2},
                {3, 3, 3},
                {0, 0, 0, 0},
                {2}
        };
        for (int[] test : tests) {
            int[] arr = Arrays.copyOf(test, test.length);
            sort(arr);
            System.out.println(Arrays.toString(test) + " -> " + Arrays.toString(arr));
        }
    }

    public static void sort(int[] arr) {
        if (arr.length == 0) return;

        int[] count = new int[CODE_COUNT];
        for (int val : arr) {
            if (val < 0 || val >= CODE_COUNT) {
                throw new IllegalArgumentException("код " + val + " вне диапазона [0; 3]");
            }
            count[val]++;
        }

        for (int d = 1; d < CODE_COUNT; d++) {
            count[d] += count[d - 1];
        }

        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }

        System.arraycopy(result, 0, arr, 0, result.length);
    }

}
