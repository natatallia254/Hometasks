package Lesson_8;

/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.*/

import java.util.*;

public class Task_8_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();    //создаем ArrayList
        Collections.addAll(list, "яблоко", "банан", "слива", "персик", "груша", "лимон", "малина", "клубника", "банан", "слива", "персик", "яблоко", "апельсин", "голубика", "черника", "яблоко", "дыня", "арбуз", "лимон", "яблоко");

        /*Различные способы вывода элементов ArrayList:*/

        /*for (int i = 0; i < Integer.valueOf(list.size()); i++) {
             System.out.println(list.get(i));
        }*/

        System.out.print("Исходный массив:\n");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        //list.forEach(System.out::println);

        //System.out.println("Исходный массив:\n" + list);


        HashSet<String> uniqueFruits = new HashSet<String>();                       //Создаем HashSet, тк в него попадут только уникальные элементы
        uniqueFruits.addAll(list);                                             //Добавляем в HashSet элементы из ArrayList
        System.out.println("Уникальные элементы массива:\n" + uniqueFruits);   //Выводим эти элементы. Они уникальны

        HashMap<String, Integer> counts = new HashMap<>();                     //С помощью HashMap считаем количество
        /*for (int i = 0; i < list.size(); ++i) {                              //повторов каждого элемента в списке
            Integer x = counts.get(list.get(i));
            if (x == null) counts.put(list.get(i), 1);
            else counts.put(list.get(i), x + 1);
        }*/

        Integer counter = null;
        for (String i:list) {
            counter = counts.get(i);
            counts.put(i, counter == null ? 1: counter + 1);
        }

        System.out.println("Какое количество раз встречается каждый элемент в списке:\n" + counts);

    }
}
