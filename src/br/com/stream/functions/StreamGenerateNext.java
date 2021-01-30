package br.com.stream.functions;

import java.util.stream.Stream;

public class StreamGenerateNext {
    public static void main(String[] args) {
        Stream.generate(StreamGenerateNext::next)
                .limit(5)
                .forEach(System.out::println);
    }

    static int i = 0;
    private static int next() {
        i++;
        return i;
    }
}
