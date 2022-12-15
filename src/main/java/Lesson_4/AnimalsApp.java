package Lesson_4;

public class AnimalsApp {
    public static void main(String[] args) {
        Animals animal = new Animals("Дружок", "рыжий");
        Dog dogReks = new Dog("Рекс", "черный");
        Dog dogBobik = new Dog("Бобик", "пятнистый");
        Dog dogLubimka = new Dog("Любимка", "серый");
        Cat catMarsik = new Cat("Марсик", "белый", 120, false);
        Cat catBarsik = new Cat("Барсик", "рыжий", 100, false);
        Cat catKlyaksik = new Cat("Кляксик", "черно-белый", 150, false);
        Plate plate = new Plate(0);

        dogReks.NameAnimal();
        dogReks.ColorAnimal();
        System.out.println();

        dogBobik.NameAnimal();
        dogBobik.ColorAnimal();
        System.out.println();

        dogLubimka.NameAnimal();
        dogLubimka.ColorAnimal();
        System.out.println();

        catMarsik.NameAnimal();
        catMarsik.ColorAnimal();
        System.out.println();

        catBarsik.NameAnimal();
        catBarsik.ColorAnimal();
        System.out.println();

        catKlyaksik.NameAnimal();
        catKlyaksik.ColorAnimal();
        System.out.println();

        dogReks.RunAnimal(300);
        dogBobik.RunAnimal(350);
        dogLubimka.RunAnimal(400);
        System.out.println();

        dogReks.SwimAnimal(100);
        dogBobik.SwimAnimal(110);
        dogLubimka.SwimAnimal(120);
        System.out.println();

        catMarsik.RunAnimal(50);
        catBarsik.RunAnimal(70);
        catKlyaksik.RunAnimal(10);
        System.out.println();

        catMarsik.SwimAnimal(30);
        catBarsik.SwimAnimal(35);
        catKlyaksik.SwimAnimal(40);
        System.out.println();

        catMarsik.RunAnimal(-2);
        catMarsik.RunAnimal(0);
        catMarsik.RunAnimal(200);
        catMarsik.RunAnimal(201);
        catMarsik.RunAnimal(100);
        System.out.println();

        catBarsik.RunAnimal(-500);
        catBarsik.RunAnimal(0);
        catBarsik.RunAnimal(200);
        catBarsik.RunAnimal(201);
        catBarsik.RunAnimal(42);
        System.out.println();

        catKlyaksik.RunAnimal(-25);
        catKlyaksik.RunAnimal(0);
        catKlyaksik.RunAnimal(200);
        catKlyaksik.RunAnimal(201);
        catKlyaksik.RunAnimal(97);
        System.out.println();

        dogReks.RunAnimal(-241);
        dogReks.RunAnimal(0);
        dogReks.RunAnimal(500);
        dogReks.RunAnimal(501);
        dogReks.RunAnimal(499);
        System.out.println();

        dogBobik.RunAnimal(-100);
        dogBobik.RunAnimal(0);
        dogBobik.RunAnimal(500);
        dogBobik.RunAnimal(501);
        dogBobik.RunAnimal(337);
        System.out.println();

        dogLubimka.RunAnimal(-700);
        dogLubimka.RunAnimal(0);
        dogLubimka.RunAnimal(500);
        dogLubimka.RunAnimal(501);
        dogLubimka.RunAnimal(222);
        System.out.println();

        dogReks.SwimAnimal(-20);
        dogReks.SwimAnimal(0);
        dogReks.SwimAnimal(10);
        dogReks.SwimAnimal(11);
        dogReks.SwimAnimal(7);
        System.out.println();

        dogBobik.SwimAnimal(-20);
        dogBobik.SwimAnimal(0);
        dogBobik.SwimAnimal(10);
        dogBobik.SwimAnimal(100);
        dogBobik.SwimAnimal(3);
        System.out.println();

        dogLubimka.SwimAnimal(-20);
        dogLubimka.SwimAnimal(0);
        dogLubimka.SwimAnimal(10);
        dogLubimka.SwimAnimal(14);
        dogLubimka.SwimAnimal(8);
        System.out.println();

        plate.info();
        catMarsik.AppetiteInfo();
        catMarsik.eat(plate);
        System.out.println();

        plate.info();
        catBarsik.AppetiteInfo();
        catBarsik.eat(plate);
        System.out.println();

        plate.info();
        catKlyaksik.AppetiteInfo();
        catKlyaksik.eat(plate);
        System.out.println();

        plate.info();
        plate.increaseFood(300);
        plate.info();
        catMarsik.AppetiteInfo();
        catMarsik.eat(plate);
        System.out.println();
        plate.info();
        catBarsik.AppetiteInfo();
        catBarsik.eat(plate);
        System.out.println();
        plate.info();
        catKlyaksik.AppetiteInfo();
        catKlyaksik.eat(plate);
        System.out.println();

        catMarsik.countCats();
        dogLubimka.countDogs();
        animal.countAnimals();
        System.out.println();

    }
}
