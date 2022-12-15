package Lesson_5;

public class Orange <T, V extends Number, K extends Number> extends Fruit {
    public Orange(T country, T sort, T name, V weight, K quantity) {
        super(country, sort, name, weight, quantity);
    }

    public void About() {
        System.out.println("Название фрукта: " + name + ". Сорт: " + sort + ". Страна-производитель: " + country + ". Вес одного апельсина: "
                + weight + ". Количество в коробке: " + quantity + ".");

    }

    /*public float getWeightOranges() {
        float m = weight.floatValue() * quantity.floatValue();
        return m;
    }*/
}
