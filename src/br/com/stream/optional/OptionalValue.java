package br.com.stream.optional;

import java.util.OptionalInt;

public class OptionalValue {
    public static void main(String[] args) {
        OptionalInt number = OptionalInt.of(2);

        if (number.isPresent()) {
            int value = number.getAsInt();
            System.out.println("Number is " + value);
        } else {
            System.out.println("Number is absent.");
        }
    }
}
