package Lesson_8;

import java.util.ArrayList;

public class Example_8_1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("школа");
        list.add("сад");
        list.add("ясли");
        list.add("университет");
        list.add("техникум");
        list.add("ПТУ");
        list.add("колледж");
        System.out.println("Элемент массива: " + list.get(5));
        System.out.println("Размер массива: " + Integer.valueOf(list.size()));
        list.set(2, "ясли-сад");
        list.remove(5);
        list.remove("сад ");
        System.out.println("Элемент массива после удаления другого элемента: " + list.get(0));
        System.out.println("Элемент массива после удаления другого элемента: " + list.get(1));
        System.out.println("Элемент массива после удаления другого элемента: " + list.get(2));
        System.out.println("Элемент массива после удаления другого элемента: " + list.get(3));
        System.out.println("Элемент массива после удаления другого элемента: " + list.get(4));
        System.out.println("Размер массива после удаления другого элемента: " + Integer.valueOf(list.size()));
        list.clear();
        System.out.println("Размер массива после удаления: " + Integer.valueOf(list.size()));

    }
}

