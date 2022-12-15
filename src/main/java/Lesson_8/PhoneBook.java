package Lesson_8;
/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add()
можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.*/

import java.util.*;
import java.util.stream.Stream;

public class PhoneBook {
    HashMap <String, String> guide = new HashMap<>();

    public void add(String phone, String name) {
        guide.put(phone, name);
        //System.out.println(guide);
    }

    public void get(String name) {
        //получить номера из HashMap с помощью stream():
        //guide.entrySet().stream().filter(s -> name.equals(s.getValue())).map(Map.Entry::getKey).forEach(System.out::println);

        //получить номера из HashMap с помощью занесения ключей (т.е. номеров телефонов) в HashSet:
        Set keys = new HashSet();
        for (Map.Entry entry : guide.entrySet()) {
            if (entry.getValue().equals(name)) {
                keys.add(entry.getKey());
            }
        }
        System.out.print(name + " / Номер(а) телефона(ов): " + keys);
    }
}
