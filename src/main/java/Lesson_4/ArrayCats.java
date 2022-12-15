package Lesson_4;

public class ArrayCats {
    public static void main(String[] args) {
        Cat[] CatArr = new Cat[7];
        CatArr[0] = new Cat("Марсик", "белый", 30, false);
        CatArr[1] = new Cat("Барсик", "рыжий", 100, false);
        CatArr[2] = new Cat("Кляксик", "черно-белый", 150, false);
        CatArr[3] = new Cat("Фрося", "черно-белый", 30, false);
        CatArr[4] = new Cat("Васька", "черный", 20, false);
        CatArr[5] = new Cat("Белочка", "рыжий", 100, false);
        CatArr[6] = new Cat("Алиса", "рыже-коричневый", 120, false);
        Plate plate = new Plate(0);

        for (int i = 0; i < CatArr.length; i++) {
            plate.info();
            plate.increaseFood(350);
            CatArr[i].AppetiteInfo();
            CatArr[i].eat(plate);
            System.out.println();
        }

    }
}
