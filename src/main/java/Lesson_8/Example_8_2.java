package Lesson_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Example_8_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "яблоко", "банан", "слива", "персик", "груша", "лимон", "малина", "клубника");
        Stream<String> streamList = list.stream();
        //streamList.skip(list.size() - 1).findFirst().orElse("1");
        //streamList.map((s) -> s + "_1").collect(Collectors.toList()).forEach(System.out::println);
        //streamList.map(String::toUpperCase).peek((e) -> System.out.print("," + e)).collect(Collectors.toList()).forEach(System.out::println);


        //Stream<String> streamFromValues = Stream.of("яблоко", "банан", "слива", "яблоко");
        //streamFromValues.distinct().forEach(System.out::println);

        //IntStream.of(50,60,70,80,90,100,110,120).filter(x -> x < 90).map(x -> x - 10).limit(3).forEach(System.out::println);

        //Stream.of("яблоко", "банан", "слива", "яблоко").distinct().forEach(System.out::println);

        //Stream.of("one", "two", "three").filter(p -> p.length() == 3).forEach(System.out::println);

        //Stream.of("one", "two", "three").filter(p -> p.length() == 3).forEach(s -> System.out.println(s));


    }
}
