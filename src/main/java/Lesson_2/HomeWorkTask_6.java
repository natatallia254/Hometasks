package Lesson_2;

public class HomeWorkTask_6 {
    public static void main(String[] args) {
        Task_6();
    }

    public static void Task_6() {
        int[] array = new int[100];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = counter;
            System.out.print(array[i] + " ");
            counter++;
        }
        System.out.println();
    }
}
