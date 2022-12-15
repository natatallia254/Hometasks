package Lesson_5;

public class elemMas<T> {
    private T[] masElem;

    public elemMas(T... masElem) {
        this.masElem = masElem;
    }

    public T[] getMasElem() {
        return masElem;
    }

    public void showTypes() {
        System.out.println("Тип массива: " + masElem.getClass().getName());
    }

    public void ishMas() {
        System.out.println("Исходный массивв:");
        for (int i = 0; i < masElem.length; i++) {
            System.out.print(masElem[i] + " ");
        }
        System.out.println();
    }

    public void menMest() {
        T a = masElem[2];
        T b = masElem[3];
        masElem[2] = b;
        masElem[3] = a;
        System.out.println("Готовый массив с измененными местами 3-го и 4-го элементов:");
        for (int i = 0; i < masElem.length; i++) {
            System.out.print(masElem[i] + " ");
        }
        System.out.println();
    }

}
