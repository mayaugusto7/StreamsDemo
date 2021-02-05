package br.com.filters;

public class FilterMain2 {
    public static void main(String[] args) {
        Employee.persons()
                .stream()
                .filter(Employee::isMale)
                .filter(p -> p.getIncome() > 5000.0)
                .map(Employee::getName)
                .forEach(System.out::println);

        // or

        Employee.persons()
                .stream()
                .filter(p -> p.isMale() && p.getIncome() > 5000.0)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
