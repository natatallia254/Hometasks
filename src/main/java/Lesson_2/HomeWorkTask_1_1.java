package Lesson_2;

public class HomeWorkTask_1_1 {
    public static void main(String[] args) {
        System.out.println(Task_1_1(100, 3));
    }

    public static boolean Task_1_1(int m, int n) {
        if (m + n >= 10 && m + n <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
