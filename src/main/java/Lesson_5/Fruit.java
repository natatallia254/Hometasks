package Lesson_5;

public abstract class Fruit<T, V extends Number, K extends Number> {
    protected T country;
    protected T sort;
    protected T name;
    protected V weight;
    protected K quantity;

    public Fruit(T country, T sort, T name, V weight, K quantity) {
        this.country = country;
        this.sort = sort;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    public abstract void About();

    public float getWeight() {
        float m = weight.floatValue() * quantity.floatValue();
        return m;
    }

    public boolean Compare(Orange another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void decreaseBox(Orange another) {
        int t = this.quantity.intValue();
        int l = another.quantity.intValue();
        if (t == 0 && l > 0) {
            t += l;
            l = 0;
            System.out.println("Из корзины c "+another.name+" пересыпали в корзину с "+this.name+" "+t+" фруктов.");
        } else if (t>0 && l==0) {
            l+=t;
            t = 0;
            System.out.println("Из корзины c "+this.name+" пересыпали в корзину с "+another.name+" "+l+" фруктов.");
        }   else
            System.out.println("Невозможно пересыпать яблоки в апельсины, а апельсины в яблоки. Освободите одну из корзин.");
    }

    public void increaseBox(Orange another) {
        int t = this.quantity.intValue();
        int l = another.quantity.intValue();
        if (l == 0) {
            l += 200;
            System.out.println("Корзина c "+another.name+" снова наполнена. Количество фруктов в корзине "+l);
        } else if (t == 0) {
            t += 200;
            System.out.println("Корзина c "+this.name+" снова наполнена. Количество фруктов в корзине "+t);
        } else
            System.out.println("Корзины наполнены.");
    }

}