package br.com.maps;

import java.util.stream.IntStream;

public class MapMain {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
