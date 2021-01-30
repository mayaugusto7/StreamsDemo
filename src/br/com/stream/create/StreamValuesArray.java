package br.com.stream.create;

import java.util.stream.Stream;

public class StreamValuesArray {
    public static void main(String[] args) {
        String[] names = { "XML", "Java", "SQL", "CSS" };
        Stream<String> stream = Stream.of(names);
        stream.forEach(System.out::println);
    }
}
