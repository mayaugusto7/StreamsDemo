package br.com.stream.functions;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerateRandomInt {
    public static void main(String[] args) {
        IntStream.generate(new Random()::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
