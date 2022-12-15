package Lesson_4;

public class Dog extends Animals {
    static int dogCount;

    public Dog(String name, String color) {
        super(name, color);
        dogCount++;
    }

    public void SoundsAnimal() {
        System.out.println("Собака лает");
    }

    public void RunAnimal(int n) {
        if (n > 0 && n <= 500) {
            System.out.println("Собака " + color + " " + name + " пробежала " + n + " метров");
        } else {
            System.out.println("Собака " + color + " " + name + " не может столько пробежать (" + n + " метров)");
        }
    }

    public void SwimAnimal(int n) {
        if (n > 0 && n <= 10) {
            System.out.println("Собака " + color + " " + name + " проплыла " + n + " метров");
        } else {
            System.out.println("Собака " + color + " " + name + " не может столько проплыть (" + n + " метров)");
        }
    }

    public void countDogs(){
        System.out.println("Количество созданных собак: "+dogCount);
    }
}
