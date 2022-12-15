package Lesson_4;

import java.util.Scanner;

public class Payment_ {
    private String nameProduct;
    private String byMade;
    static int countProdBusk;

    public Payment_(String nameProduct, String byMade) {
        this.nameProduct = nameProduct;
        this.byMade = byMade;
        countProdBusk++;
    }

    public class busket_ {
        private String paramProduct;
        private int costProduct;
        private int countProduct;

        public busket_(String paramProduct, int costProduct, int countProduct) {
            this.paramProduct = paramProduct;
            this.costProduct = costProduct;
            this.countProduct = countProduct;
        }

        public void inBusket_() {
            System.out.println("Наименование товара в корзине: " + Payment_.this.nameProduct + ". Фирма-производитель: "
                    + Payment_.this.byMade + ". Описание: " + paramProduct + ". Стоимость " + Payment_.this.nameProduct
                    + ": " + costProduct + ". Количество в корзине: " + countProduct + ". Общая стоимость за " + countProduct
                    + " товара(ов): " + costProduct * countProduct + ".");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество покупаемых товаров: ");
        int a = sc.nextInt();
        if (a > 0) {
            int sum = 0;
            for (int i = 0; i < a; i++) {
                System.out.print("Введите название товара: ");
                String b = sc.next();
                System.out.print("Введите производителя: ");
                String c = sc.next();
                System.out.print("Введите описание: ");
                String d = sc.next();
                System.out.print("Введите стоимость данного товара: ");
                int m = sc.nextInt();
                System.out.print("Введите количество единиц данного товара: ");
                int n = sc.nextInt();
                System.out.println();

                Payment_.busket_[] busketArr_ = new Payment_.busket_[a];
                busketArr_[i] = new Payment_(b, c).new busket_(d, m, n);
                busketArr_[i].inBusket_();

                if (busketArr_[i].costProduct > 0) {
                    sum += busketArr_[i].costProduct * busketArr_[i].countProduct;
                    System.out.println();
                }

            }
            System.out.println("Общая стоимость покупки: " + sum);
            System.out.println();
            System.out.println("Общее количество видов товаров в корзине: " + countProdBusk);

        } else System.out.println("Вы ввели недопустимое количество покупаемого товара");

    }
}
