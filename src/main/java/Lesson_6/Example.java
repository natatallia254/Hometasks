package Lesson_6;

import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try {
            int[] c = {1, 2, 3};
            c[42] = 99;
            int a = 10;
            a -= 10;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        }
        finally {
            System.out.println("Конец программы");
        }
    }
}
