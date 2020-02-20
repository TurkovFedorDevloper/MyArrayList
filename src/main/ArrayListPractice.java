package main;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num.add(i + 1);
        }

        ArrayList<String> name = new ArrayList<>();
        name.add("Ivan");
        name.add("Dima");
        name.add("Gleb");
        name.add("Misha");
        name.add("Fedor");
        name.add("Vasya");
        name.add("Denis");
        name.add("Petya");
        name.add("Anton");
        name.add("Kirill");

        ArrayList<String> numName = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numName.add(num.get(i).toString() + " " + name.get(i));
        }

        for (String go : numName) {
            System.out.println(go);
        }
    }
}
