package Lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(String c, String kl, int n, boolean l) {
        //int m;
        if (food >= n) {
            //m = food - n;
            food -= n;
            l = true;
            System.out.println("Котик " + c + " " + kl + " поел. Осталось " + food + " единиц еды в тарелке. Его сытость: " + l);
        } else {
            l = false;
            System.out.println("Аппетит " + c + " кота " + kl + " превышает количество еды в тарелке (количество еды в тарелке: " + food + ", аппетит: " + n + "). Кот обиделся и отказался есть. Его сытость: " + l);
        }
    }

    public void increaseFood(int kol_dob) {
        if (food == 0) {
            food += kol_dob;
            System.out.println("Тарелка снова наполнена. Количество еды "+food);
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
