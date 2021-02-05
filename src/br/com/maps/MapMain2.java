package br.com.maps;

import java.util.stream.IntStream;

public class MapMain2 {
    public static void main(String[] args) {
       Employee.persons()
               .stream()
               .map(Employee::getName)
               .forEach(System.out::println);

       Employee.persons()
               .stream()
               .map(p -> p.getName() + " - " + p.getIncome())
               .forEach(System.out::println);
    }
}
