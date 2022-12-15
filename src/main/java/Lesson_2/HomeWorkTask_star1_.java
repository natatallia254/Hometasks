package Lesson_2;

import java.util.Scanner;

public class HomeWorkTask_star1_ {
    public static void main(String[] args) {
        Task_star1_();
    }

    public static boolean Task_star1_() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
