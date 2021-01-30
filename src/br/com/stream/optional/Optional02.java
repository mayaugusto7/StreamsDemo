package br.com.stream.optional;

import java.util.Optional;

public class Optional02 {
    public static void main(String[] args) {
        Optional<String> str = Optional.of("java2s.com");

        if (str.isPresent()) {
            String value = str.get();
            System.out.println("Optional contains " + value);
        } else {
            System.out.println("Optional is empty");
        }
    }
}
