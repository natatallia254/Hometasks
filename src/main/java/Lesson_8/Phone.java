package Lesson_8;

import java.util.stream.Stream;

public class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 s", 54000), new Phone("Lumia 950", 45000), new Phone("Samsung Galaxy s 6", 40000));
        //phoneStream.map(p -> p.getName()).forEach(p -> System.out.println(p));
        //phoneStream.filter(p -> p.getPrice() < 50000).forEach(p -> System.out.println(p.getName()));
        phoneStream.map(p -> "Название: " + p.getName() + ". Цена: " + p.getPrice()).forEach(p -> System.out.println(p));

    }

}
