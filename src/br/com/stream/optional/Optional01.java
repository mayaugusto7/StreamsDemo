package br.com.stream.optional;

import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> str = Optional.of("java2s.com");
        System.out.println(str);

        String nullableString = "";
        Optional<String> str2 = Optional.of(nullableString);
        System.out.println(str2);
    }
}
