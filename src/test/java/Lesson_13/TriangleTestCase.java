package Lesson_13;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TriangleTestCase {
    //@ExtendWith(ForLog.class)

    @DisplayName("Площадь треугольника, если сторона c имеет отрицательное значение (negative)")
    @RepeatedTest(2)
    public void Triangle1Test() {
        ForLog forlog = new ForLog();
        //forlog.process("going");
        Triangle triangle1 = new Triangle();
        triangle1.TriangleFunction(2, 2, -3);
        System.out.println("1 / Негативный сценарий с отрицательной стороной с выполнен");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если сторона b имеет отрицательное значение (negative)")
    public void Triangle2Test() {
        Triangle triangle2 = new Triangle();
        triangle2.TriangleFunction(2, -2, 3);
        System.out.println("2 / Негативный сценарий с отрицательной стороной b выполнен");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если сторона a имеет отрицательное значение (negative)")
    public void Triangle3Test() {
        Triangle triangle3 = new Triangle();
        triangle3.TriangleFunction(-2, 2, 3);
        System.out.println("3 / Негативный сценарий с отрицательной стороной a выполнен");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если все стороны имеют отрицательные значения (negative)")
    @Disabled
    public void Triangle4Test() {
        Triangle triangle4 = new Triangle();
        triangle4.TriangleFunction(-2, -2, -3);
        System.out.println("4 / Негативный сценарий со всеми отрицательными сторонами выполнен");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь равностороннего треугольника (positive)")
    @AfterEach
    public void Triangle5Test() {
        Triangle triangle5 = new Triangle();
        triangle5.TriangleFunction(1, 1, 1);
        System.out.println("5 / Позитивный сценарий выполнен, площадь треугольника вычислена");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если (b < a+c) && (a < b+c) && (c < a+b) (positive)")
    public void Triangle6Test() {
        Triangle triangle6 = new Triangle();
        triangle6.TriangleFunction(5, 2, 6);
        System.out.println("6 / Позитивный сценарий выполнен ((b < a+c) && (a < b+c) && (c < a+b)), площадь треугольника вычислена");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если (b < a+c) && (a < b+c) && (c < a+b) (positive)")
    public void Triangle7Test() {
        Triangle triangle7 = new Triangle();
        triangle7.TriangleFunction(2, 5, 6);
        System.out.println("7 / Позитивный сценарий выполнен ((b < a+c) && (a < b+c) && (c < a+b)), площадь треугольника вычислена");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если (b < a+c) && (a < b+c) && (c < a+b) (positive)")
    public void Triangle8Test() {
        Triangle triangle8 = new Triangle();
        triangle8.TriangleFunction(6, 5, 2);
        System.out.println("8 / Позитивный сценарий выполнен ((b < a+c) && (a < b+c) && (c < a+b)), площадь треугольника вычислена");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь равнобедренного треугольника, если (b < a+c) && (a < b+c) && (c < a+b) && (b == c) (positive)")
    public void Triangle9Test() {
        Triangle triangle9 = new Triangle();
        triangle9.TriangleFunction(5, 12, 12);
        System.out.println("9 / Негативный сценарий выполнен ((b < a+c) && (a < b+c) && (c < a+b) && (b == c))");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если (b > a+c) && (a < b+c) && (c < a+b) (negative)")
    public void Triangle10Test() {
        Triangle triangle10 = new Triangle();
        triangle10.TriangleFunction(5, 12, 6);
        System.out.println("10 / Негативный сценарий выполнен ((b > a+c) && (a < b+c) && (c < a+b))");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если (a > b+c) && (b < a+c) && (c < a+b) (negative)")
    public void Triangle11Test() {
        Triangle triangle11 = new Triangle();
        triangle11.TriangleFunction(12, 2, 6);
        System.out.println("11 / Негативный сценарий выполнен ((a > b+c) && (b < a+c) && (c < a+b))");
        System.out.println();
    }

    @Test
    @DisplayName("Площадь треугольника, если (c > a+b) && (a < b+c) && (b < a+c) (negative)")
    public void Triangle12Test() {
        Triangle triangle12 = new Triangle();
        triangle12.TriangleFunction(5, 2, 16);
        System.out.println("12 / Негативный сценарий выполнен ((c > a+b) && (a < b+c) && (b < a+c))");
        System.out.println();
    }

    @Test
    @DisplayName("Тест до всех")
    @BeforeAll
    public static void Triangle13Test() {
        Triangle triangle13 = new Triangle();
        triangle13.TriangleFunction(5, 2, 16);
        System.out.println("13 / Тест до всех выполнен");
        System.out.println();
    }

    /*@DisplayName("Параметризированный тест")
    @ParameterizedTest
    @ValueSource(int = {20, 30, 40})
    public void TriangleTest14(int side) {
        Triangle triangle14 = new Triangle();
        Assertions.assertTrue(triangle14.TriangleFunction(side));
    }*/



}