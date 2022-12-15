package Lesson_2;

import java.util.Scanner;

public class HomeWorkTask_star1 {
    public static void main(String[] args) {
        Task_star1();
    }

    public static void Task_star1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Данный год високосный (366 дней)");
                } else {
                    System.out.println("Данный год невисокосный (365 дней)");
                }
            } else {
                System.out.println("Данный год високосный (366 дней)");
            }
        } else {
            System.out.println("Данный год невисокосный (365 дней)");
        }
        scan.close();
    }
}
