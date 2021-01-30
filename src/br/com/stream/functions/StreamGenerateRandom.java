package br.com.stream.functions;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerateRandom {
    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
