/*Домашнее задание 13
Напишите функцию, вычисляющую площадь треугольника по трём сторонам (int a, int b, int c). Разместите класс с функцией в src/main/java.
Разместите тесты на эту функцию в классе src/test/java/.../TriangleTest.java.
Настройте генерацию отчета и по желанию — логирование.
Официальная документация JUnit 5 - https://junit.org/junit5/docs/current/user-guide/
Официальная документация TestNG - https://testng.org/doc/index.html*/

package Lesson_13;

import java.util.InputMismatchException;

public class Triangle {
    public void TriangleFunction(int a, int b, int c) {
        System.out.println("Начало программы вычисления площади треугольника по трем сторонам");
        //Scanner sc = new Scanner(System.in);
        try {
            //System.out.print("Введите значение первой стороны треугольника a = ");
            //int a = sc.nextInt();
            //System.out.print("Введите значение второй стороны треугольника b = ");
            //int b = sc.nextInt();
            //System.out.print("Введите значение третьей стороны треугольника c = ");
            //int c = sc.nextInt();
            if (a>0 && b>0 && c>0) {
                if (a<b+c) {
                    if (b<a+c) {
                        if (c<a+b) {
                            float p = (a+b+c)/2.f;
                            float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                            System.out.println("Площадь треугольника: s = " +s);
                        } else
                            System.out.println("Сторона c = " + c + " треугольника слишком большая");
                    } else
                        System.out.println("Сторона b = " + b + " треугольника слишком большая");
                } else
                    System.out.println("Сторона a = " + a + " треугольника слишком большая");
            } else
                System.out.println("Стороны треугольника не могут быть отрицательными. Вы ввели: a = " + a + ", b = " + b + ", c = " + c );
        }

        catch (InputMismatchException e) {
            System.out.println("Введите целочисленные значения сторон");
        }

        finally {
            //sc.close();
            System.out.println("Конец программы");
        }

    }
}


