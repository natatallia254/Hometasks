package Lesson_4;

public class Animals {
    protected String name;
    protected String color;
    static int animalCount;

    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
        animalCount++;
    }

    public void NameAnimal() {
        System.out.println("Кличка домашнего друга: " + name);
    }

    public void ColorAnimal() {
        System.out.println("Цвет домашнего друга: " + color);
    }

    public void SoundsAnimal() {
        System.out.println("Питомец издает звуки");
    }

    public void RunAnimal(int n) {
        System.out.println(color + " " + name + " пробежал " + n + " метров");
    }

    public void SwimAnimal(int n) {
        System.out.println(color + " " + name + " проплыл " + n + " метров");
    }

    public void countAnimals(){
        System.out.println("Количество созданных животных: "+animalCount);
    }
}
