package Lesson_13;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

class TriangleTestCase {

    @RepeatedTest(2)
    public void Triangle1Test() {
        ForLog forlog = new ForLog();
        //forlog.process("going");
        Triangle triangle1 = new Triangle();
        triangle1.TriangleFunction(2, 2, -3);
        System.out.println("Негативный сценарий с отрицательной стороной с выполнен");
        System.out.println();
    }

    //@ExtendWith(ForLog.class)
    @org.junit.jupiter.api.Test
    public void Triangle2Test() {
        Triangle triangle2 = new Triangle();
        triangle2.TriangleFunction(2, -2, 3);
        System.out.println("Негативный сценарий с отрицательной стороной b выполнен");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle3Test() {
        Triangle triangle3 = new Triangle();
        triangle3.TriangleFunction(-2, 2, 3);
        System.out.println("Негативный сценарий с отрицательной стороной a выполнен");
        System.out.println();
    }

    @Disabled
    public void Triangle4Test() {
        Triangle triangle4 = new Triangle();
        triangle4.TriangleFunction(-2, -2, -3);
        System.out.println("Негативный сценарий со всеми отрицательными сторонами выполнен");
        System.out.println();
    }

    @AfterEach
    public void Triangle5Test() {
        Triangle triangle5 = new Triangle();
        triangle5.TriangleFunction(1, 1, 1);
        System.out.println("Позитивный сценарий выполнен, площадь треугольника вычислена");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle6Test() {
        Triangle triangle6 = new Triangle();
        triangle6.TriangleFunction(5, 2, 6);
        System.out.println("Позитивный сценарий выполнен (b < a+c), площадь треугольника вычислена");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle7Test() {
        Triangle triangle7 = new Triangle();
        triangle7.TriangleFunction(2, 5, 6);
        System.out.println("Позитивный сценарий выполнен (a < b+c), площадь треугольника вычислена");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle8Test() {
        Triangle triangle8 = new Triangle();
        triangle8.TriangleFunction(6, 5, 2);
        System.out.println("Позитивный сценарий выполнен (c < a+b), площадь треугольника вычислена");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle9Test() {
        Triangle triangle9 = new Triangle();
        triangle9.TriangleFunction(5, 12, 6);
        System.out.println("Негативный сценарий выполнен (b > a+c)");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle10Test() {
        Triangle triangle10 = new Triangle();
        triangle10.TriangleFunction(12, 2, 6);
        System.out.println("Негативный сценарий выполнен (a > b+c)");
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void Triangle11Test() {
        Triangle triangle11 = new Triangle();
        triangle11.TriangleFunction(5, 2, 16);
        System.out.println("Негативный сценарий выполнен (c > a+b)");
        System.out.println();
    }


}