package br.com.operations;

import java.util.List;

public class PersonsStreamForEach2 {
    public static void main(String[] args) {
        List<Employee> persons = Employee.persons();
        System.out.println("Before increasing the income: " + persons);

        persons.stream()
                .filter(Employee::isFemale)
                .forEach(p -> p.setIncome(p.getIncome() * 1.10));

        System.out.println("After increasing the income: " + persons);
    }
}
