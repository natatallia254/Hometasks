package Lesson_5;

public class Box {
    public static void main(String args[]) {
        Apple<String, Float, Integer> boxForApple = new Apple<>("Беларусь", "Белый налив", "яблоко летнее", "желтый", 1.0f, 150);
        Orange<String, Float, Integer> boxForOrange = new Orange<>("Египет", "Сочный", "апельсин", 1.0f, 150);
        boxForApple.About();
        boxForOrange.About();
        System.out.println("Общий вес яблок в коробке: " + boxForApple.getWeight() + ".");
        System.out.println("Общий вес апельсин в коробке: " + boxForOrange.getWeight() + ".");

        if (boxForApple.Compare(boxForOrange)) {
            boolean n = true;
            System.out.println("Равны ли коробки по весу: "+n);
        } else {
            boolean n = false;
            System.out.println("Равны ли коробки по весу: "+n);
        }

        boxForApple.decreaseBox(boxForOrange);
        boxForApple.increaseBox(boxForOrange);

    }
}
