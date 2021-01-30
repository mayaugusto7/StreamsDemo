package br.com.stream.create;

import java.util.stream.Stream;

public class StreamEmpty {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}
