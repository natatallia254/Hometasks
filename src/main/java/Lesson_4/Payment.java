package Lesson_4;

public class Payment {
    private String nameProduct;
    private String byMade;

    public Payment(String nameProduct, String byMade) {
        this.nameProduct = nameProduct;
        this.byMade = byMade;
    }

    public class busket {
        private String paramProduct;
        private int costProduct;
        private int countProduct;

        public busket(String paramProduct, int costProduct, int countProduct) {
            this.paramProduct = paramProduct;
            this.costProduct = costProduct;
            this.countProduct = countProduct;
        }

        public void inBusket() {
            System.out.println("Наименование товара в корзине: " + nameProduct + ". Фирма-производитель: "
                    + byMade + ". Описание: " + paramProduct + ". Стоимость " + nameProduct + ": "
                    + costProduct + ". Количество в корзине: " + countProduct + ". Общая стоимость за " + countProduct
                    + " товара(ов): " + costProduct * countProduct + ".");
        }
    }

    public static void main(String[] args) {
        Payment.busket[] busketArr = new busket[3];
        busketArr[0] = new Payment("Телевизор", "LG, Китай").new busket("черный, диагональ 32", 1500, 2);
        busketArr[1] = new Payment("Холодильник", "Атлант, р.Беларусь").new busket("белый, 2м", 1000, 1);
        busketArr[2] = new Payment("Микроволновая печь", "Samsung, Китай").new busket("белая, 24л", 700, 3);

        int sum = 0;
        for (int i = 0; i < busketArr.length; i++) {
            if (busketArr[i].costProduct > 0) {
                sum += busketArr[i].costProduct * busketArr[i].countProduct;
                busketArr[i].inBusket();
                System.out.println();
            }
        }

        System.out.println("Общая стоимость покупки: " + sum);

        //Payment.busket Busket1 = new Payment().new busket("Телевизор", 1500, 2);
        //Payment.busket Busket2 = new Payment().new busket("Холодильник", 1000, 1);
        //Payment.busket Busket3 = new Payment().new busket("Микроволновая печь", 700, 3);
        //Busket1.inBusket();
        //Busket2.inBusket();
        //Busket3.inBusket();
    }
}
