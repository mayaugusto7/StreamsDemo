package br.com.stream.strings;

import java.util.regex.Pattern;

public class StreamRegex {
    public static void main(String[] args) {
        String str = "XML,CSS,HTML";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);
    }
}
