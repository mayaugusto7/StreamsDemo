package br.com.maps;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapMain5 {
    public static void main(String[] args) {
        Stream.of("XML", "Java", "CSS")
                .flatMap(name -> IntStream.range(0, name.length())
                .mapToObj(name::charAt))
                .forEach(System.out::println);
    }
}
