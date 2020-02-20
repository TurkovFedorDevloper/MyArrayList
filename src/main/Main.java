package main;

public class Main {
    public static void main(String[] args) {

        MyArrayList employees = new MyArrayList();
        employees.add("Федор");
        employees.add("Василиса");
        employees.add("Дима");
        employees.add("Гоша");
        employees.add("Юрчик");
        employees.add("Саня");
        employees.add("Оля");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
