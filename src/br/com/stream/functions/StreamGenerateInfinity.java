package br.com.stream.functions;

import java.util.stream.IntStream;

public class StreamGenerateInfinity {
    public static void main(String[] args) {
        IntStream.generate(() -> 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
