package Lesson_6;

public class Task_1_2Main {
    public static void main(String[] args) throws Exception {
        try {
            Task_1 task1 = new Task_1();
            Task_2 task2 = new Task_2();
            task1.Task1();
            task2.Task2();
        } catch (NegativeArraySizeException e) {
            System.out.println("Второй массив отрицательного размера. Вывести невозможно. Исключение: " + e);
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.out.println("Не удалось заменить символьные элементы массива на целочисленные. Ошибка: " + e);
            e.printStackTrace();
        }

        finally {
            System.out.println();
            System.out.println("Конец программы");
        }
    }
}
