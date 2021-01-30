package br.com.stream.operation;

import java.util.Arrays;
import java.util.List;

public class WithoutStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 1) {
                int square = n * n;
                sum += square;
            }
        }

        System.out.printf("sum=%d", sum);
    }
}
