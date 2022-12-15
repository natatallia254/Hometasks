package Lesson_2;

public class HomeWorkTask_8 {
    public static void main(String[] args) {
        Task_8();
    }

    public static void Task_8() {
        int[][] massiv = new int[6][6];
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (i + j == massiv.length - 1 || i == j) {
                    massiv[i][j] = 1;
                } else {
                    massiv[i][j] = 0;
                }
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
    }
}
