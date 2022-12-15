package Lesson_2;

public class HomeWorkTask_1_1 {
    public static void main(String[] args) {
        Task_1_1(100, 3);
    }

    public static boolean Task_1_1(int m, int n) {
        int l = m + n;
        if (l >= 10 && l <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
