package br.com.operations;

public class PersonsStreamForEach {
    public static void main(String[] args) {
        Employee.persons().stream().filter(Employee::isFemale).forEach(System.out::println);
    }
}
