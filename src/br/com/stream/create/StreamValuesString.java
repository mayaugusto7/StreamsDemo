package br.com.stream.create;

import java.util.stream.Stream;

public class StreamValuesString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("XML", "Java", "CSS", "SQL");
        stream.forEach(System.out::println);
    }
}
