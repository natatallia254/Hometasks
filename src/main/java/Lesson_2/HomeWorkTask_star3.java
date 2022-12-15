package Lesson_2;

public class HomeWorkTask_star3 {
    public static void main(String[] args) {
        Task_star3(2, new int[]{1, 2, 3, 4, 5});
    }

    public static void Task_star3(int n, int[] arr) {
        int[] brr = new int[arr.length];
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив, элементы которого сдвинуты на " + n + " элементов вправо:");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + n >= arr.length) {
                brr[i + n - arr.length] = arr[i];
            } else {
                brr[i + n] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
