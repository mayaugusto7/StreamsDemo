package br.com.stream.functions;

import java.util.stream.Stream;

public class StreamGenerateUnordered {
    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
