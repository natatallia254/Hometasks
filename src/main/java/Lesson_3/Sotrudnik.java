package Lesson_3;

public class Sotrudnik {
    protected String fio;
    protected String dolzhnost;
    protected String email;
    protected String phone;
    protected double zp;
    protected int age;

    public Sotrudnik(String fio, String dolzhnost, String email, String phone, double zp, int age) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
    }

    public static void main(String[] args) {
        Sotrudnik sotrudnik1 = new Sotrudnik("Иванов Иван Иванович", "инженер", "ivanovv@gmail.com", "8-044-789-74-23", 1000.025, 45);
        Sotrudnik sotrudnik2 = new Sotrudnik("Петров Петр Петрович", "конструктор", "petrov@gmail.com", "8-029-695-12-58", 700.15, 32);
        Sotrudnik sotrudnik3 = new Sotrudnik("Александрова Ирина Витальевна", "учитель", "alekstut@yandex.ru", "8-033-597-78-65", 500.45, 52);
        System.out.println("ФИО: " + sotrudnik1.fio + ", должность: " + sotrudnik1.dolzhnost + ", email: " + sotrudnik1.email + ", телефон: " + sotrudnik1.phone + ", зарплата: " + sotrudnik1.zp + ", возраст: " + sotrudnik1.age);
        System.out.println("ФИО: " + sotrudnik2.fio + ", должность: " + sotrudnik2.dolzhnost + ", email: " + sotrudnik2.email + ", телефон: " + sotrudnik2.phone + ", зарплата: " + sotrudnik2.zp + ", возраст: " + sotrudnik2.age);
        System.out.println("ФИО: " + sotrudnik3.fio + ", должность: " + sotrudnik3.dolzhnost + ", email: " + sotrudnik3.email + ", телефон: " + sotrudnik3.phone + ", зарплата: " + sotrudnik3.zp + ", возраст: " + sotrudnik3.age);
    }
}
