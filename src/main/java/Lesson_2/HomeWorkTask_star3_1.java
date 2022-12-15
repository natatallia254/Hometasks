package Lesson_2;

import java.util.Scanner;

public class HomeWorkTask_star3_1 {
    public static void main(String[] args) {
        Task_star3(2, 5);
    }

    public static void Task_star3(int n, int m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Наш массив одномерный целочисленный размерности " + m + ".");
        System.out.print("Введите 1-ый целый элемент массива: ");
        int a = sc.nextInt();
        System.out.print("Введите 2-ой целый элемент массива: ");
        int b = sc.nextInt();
        System.out.print("Введите 3-ий целый элемент массива: ");
        int c = sc.nextInt();
        System.out.print("Введите 4-ый целый элемент массива: ");
        int d = sc.nextInt();
        System.out.print("Введите 5-ый целый элемент массива: ");
        int e = sc.nextInt();
        int[] arr = {a, b, c, d, e};
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
