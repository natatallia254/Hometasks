package Lesson_5;

public class elemMasApp {
    public static void main(String args[]) {
        elemMas<Integer> mas1 = new elemMas<Integer>(1, 2, 3, 4, 5);
        elemMas<Double> mas2 = new elemMas<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        elemMas<Float> mas3 = new elemMas<Float>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        elemMas<String> mas4 = new elemMas<String>("мама", "папа", "брат", "сестра", "я");

        mas1.ishMas();
        mas1.menMest();
        mas1.showTypes();
        System.out.println();

        mas2.ishMas();
        mas2.menMest();
        mas2.showTypes();
        System.out.println();

        mas3.ishMas();
        mas3.menMest();
        mas3.showTypes();
        System.out.println();

        mas4.ishMas();
        mas4.menMest();
        mas4.showTypes();
    }
}
