package Lesson_6;

import java.util.Arrays;

public class Task_2 {
    public void Task2() throws Exception {
        //try {
        String[][] MyArray = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j ==0) {
                    MyArray[i][j] = "привет";
                } else {
                    MyArray[i][j] = "1";
                }
                System.out.print(MyArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] NewArray = new int[MyArray.length][MyArray.length];
        int sum = 0;
        for (int i = 0; i < MyArray.length; i++) {
            for (int j = 0; j < MyArray.length; j++) {
                NewArray[i][j] = Integer.parseInt(MyArray[i][j]);
                sum = sum + NewArray[i][j];
                System.out.print(NewArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Общая сумма всех элементов массива: " + sum);

        /*} catch (NumberFormatException e) {
            System.out.println("Не удалось заменить символьные элементы массива на целочисленные. Ошибка: " + e);
            e.printStackTrace();
        }

        finally {
            System.out.println();
            System.out.println("Конец программы");
        }*/
    }
}
