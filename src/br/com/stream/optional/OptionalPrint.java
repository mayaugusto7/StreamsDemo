package br.com.stream.optional;

import java.util.Optional;

public class OptionalPrint {
    public static void main(String[] args) {
        Optional<String> str = Optional.of("java2s.com");

        str.ifPresent(value -> System.out.println("Optional contains " + value));
    }
}
