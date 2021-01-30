package br.com.stream.create;

import java.util.stream.Stream;

public class StreamValues {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java2s.com");
        stream.forEach(System.out::println);
    }
}
