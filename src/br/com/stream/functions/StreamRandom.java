package br.com.stream.functions;

import java.util.Random;

public class StreamRandom {
    public static void main(String[] args) {
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
