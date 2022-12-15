package Lesson_2;

public class HomeWorkTask_9 {
    public static void main(String[] args) {
        Task_9(15, 12);
    }

    public static void Task_9(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
