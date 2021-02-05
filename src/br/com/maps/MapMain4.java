package br.com.maps;

import java.util.stream.Stream;

public class MapMain4 {
    public static void main(String[] args) {
        Stream.of("XML", "Java", "CSS")
                .map(name -> name.chars())
                .flatMap(intStream -> intStream.mapToObj(n -> (char)n))
                .forEach(System.out::println);
    }
}
