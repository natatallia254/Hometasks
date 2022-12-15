package Lesson_4;

public class Cat extends Animals {
    private int appetite;
    private boolean sytost;
    static int catCount;

    public Cat(String name, String color, int appetite, boolean sytost) {
        super(name, color);
        this.appetite = appetite;
        this.sytost = sytost;
        catCount++;
    }

    public void SoundsAnimal() {
        System.out.println("Кот мяукает");
    }

    public void eat(Plate p) {
        p.decreaseFood(color, name, appetite, sytost);
    }

    /*public void eat2(Plate p){
        p.increaseFood();
    }*/

    public void AppetiteInfo() {
        System.out.println("appetite: " + appetite + " кота " + name);
    }

    public void RunAnimal(int n) {
        if (n > 0 && n <= 200) {
            System.out.println("Кот " + color + " " + name + " пробежал " + n + " метров");
        } else {
            System.out.println("Кот " + color + " " + name + " не может столько пробежать (" + n + " метров)");
        }
    }

    public void countCats(){
        System.out.println("Количество созданных котов: "+catCount);
    }
}
