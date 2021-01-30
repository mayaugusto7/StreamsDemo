package br.com.stream.strings;

public class StreamCharacters {
    public static void main(String[] args) {
        String str = "5 123,123,qwe,1,123, 25";
        str
                .chars()
                .filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
        .forEach(n -> System.out.print((char) n));
    }
}
