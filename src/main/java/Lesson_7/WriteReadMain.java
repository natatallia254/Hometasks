package Lesson_7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteReadMain {
    public static void main(String[] args) throws Exception{
        try {
            AppData appData = new AppData();
            System.out.println("В файл записан следующий массив:");
            System.out.println();
            appData.WriteFile();
            Read read = new Read();
            System.out.println();
            System.out.println("Из файла считан следующий массив:");
            System.out.println();
            read.ReadFile();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            System.out.println("Массив отрицательного размера. Вывести невозможно. Исключение: " + e);
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Не удается найти указанный файл или путь. Ошибка: " + e);
            e.printStackTrace();
        } finally {
            System.out.println();
            System.out.println("Конец программы");
        }
    }
}
