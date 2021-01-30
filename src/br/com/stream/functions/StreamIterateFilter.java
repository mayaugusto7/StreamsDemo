package br.com.stream.functions;

import java.util.stream.Stream;

public class StreamIterateFilter {
    public static void main(String[] args) {
        Stream.iterate(2L, n -> n + 1)
                .filter(StreamIterateFilter::isOdd)
                .limit(5)
                .forEach(System.out::println);
    }

    private static boolean isOdd(Long number) {
        return number % 2 != 0;
    }
}
