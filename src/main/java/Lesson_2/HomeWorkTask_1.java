package Lesson_2;

import java.util.Scanner;

public class HomeWorkTask_1 {
    public static void main(String[] args) {
        Task_1();
    }

    public static void Task_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = sc.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
