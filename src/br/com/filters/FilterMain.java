package br.com.filters;

public class FilterMain {
    public static void main(String[] args) {
        Employee.persons()
                .stream()
                .filter(Employee::isFemale)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
