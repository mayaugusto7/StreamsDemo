package br.com.stream.create;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamRange {
    public static void main(String[] args) {
        IntStream oneToFive = IntStream.range(1, 6);
        oneToFive.forEach(System.out::println);

        LongStream sixToTen = LongStream.range(6, 11);
        sixToTen.forEach(System.out::println);
    }
}
