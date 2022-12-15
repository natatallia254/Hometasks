package Lesson_2;

public class HomeWorkTask_7 {
    public static void main(String[] args) {
        Task_7();
    }

    public static void Task_7() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Полученный массив с элементами, которые меньше 6, умноженными на 2:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}
