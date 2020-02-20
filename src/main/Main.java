package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //My ArrayList

        System.out.println("My ArrayList :");
        MyArrayList employees = new MyArrayList();
        employees.add("Федор");
        employees.add("Василиса");
        employees.add("Дима");
        employees.add("Гоша");
        employees.add("Юрчик");
        employees.add("Саня");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

        //Collections ArrayList, HashSet(Не хранит несколько одинаковых значений, нет порядка и обращения к элементам через get)
        //TreeSet(Сортировка по алфавиту или по порядку возрастания)

        System.out.println("\nArrayList :");
        ArrayList<String> employeesAL = new ArrayList<>();
        employeesAL.add("Fedor");
        employeesAL.add("Vasilisa");
        employeesAL.add("Dima");
        employeesAL.add("Gosha");
        employeesAL.add("Yurchick");
        employeesAL.add("Sanya");

        for (String name : employeesAL) {
            System.out.println(name);
        }


        System.out.println("\nArrayListIntSum :");
        ArrayList<Integer> nambers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            nambers.add(i);
        }
        int sum = 0;

        for (int i : nambers) {
            sum += i;
        }
        System.out.println(sum + "\n");


        System.out.println("HashSet :");
        HashSet<String> names = new HashSet<>();
        names.add("Denis");
        names.add("Olga");
        names.add("Darya");
        names.add("Aleksey");
        names.add("Olga");
        names.add("Olga");
        for (String name : names) {
            System.out.println(name);
        }


        System.out.println("\nTreeSet :");
        TreeSet<String> names1 = new TreeSet<>();
        names1.add("Denis");
        names1.add("Olga");
        names1.add("Darya");
        names1.add("Aleksey");
        names1.add("Olga");
        names1.add("Olga");
        for (String name : names1) {
            System.out.println(name);
        }
    }
}
