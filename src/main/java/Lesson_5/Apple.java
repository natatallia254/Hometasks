package Lesson_5;

import Lesson_4.Plate;

public class Apple <T, V extends Number, K extends Number> extends Fruit {
    private T color;

    public Apple(T country, T sort, T name, T color, V weight, K quantity) {
        super(country, sort, name, weight, quantity);
        this.color = color;
    }

    public void About() {
        System.out.println("Название фрукта: " + name + ". Цвет: " + color + ". Сорт: " + sort + ". Страна-производитель: "
                + country + ". Вес одного яблока: " + weight + ". Количество в коробке: " + quantity + ".");
    }

    /*public float getWeightApples() {
        float m = weight.floatValue() * quantity.floatValue();
        return m;
    }*/

}
