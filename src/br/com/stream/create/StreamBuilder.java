package br.com.stream.create;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        Stream<String> stream = Stream.<String>builder()
                .add("XML")
                .add("Java")
                .add("CSS")
                .add("SQL")
                .build();

        stream.forEach(System.out::println);
    }
}
