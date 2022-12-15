package Lesson_3;

public class MassSotrud {
    public static void main(String[] args) {
        Sotrudnik[] SotrudnikArr = new Sotrudnik[5];
        SotrudnikArr[0] = new Sotrudnik("Иванов Иван Иванович", "инженер", "ivanovv@gmail.com", "8-044-789-74-23", 1000.025, 45);
        SotrudnikArr[1] = new Sotrudnik("Петров Петр Петрович", "конструктор", "petrov@gmail.com", "8-029-695-12-58", 700.15, 32);
        SotrudnikArr[2] = new Sotrudnik("Александрова Ирина Витальевна", "учитель", "alekstut@yandex.ru", "8-033-597-78-65", 500.45, 52);
        SotrudnikArr[3] = new Sotrudnik("Михалев Юрий Анатольевич", "директор", "mixayura@gmail.com", "8-044-777-88-99", 850.56, 30);
        SotrudnikArr[4] = new Sotrudnik("Николаева Василиса Игоревна", "маркетолог", "nikolaeva@yandex.ru", "8-033-255-34-81", 600.1, 25);
        for (int i = 0; i < SotrudnikArr.length; i++) {
            if (SotrudnikArr[i].age > 40) {
                System.out.println("ФИО: " + SotrudnikArr[i].fio + ", должность: " + SotrudnikArr[i].dolzhnost + ", email: " + SotrudnikArr[i].email + ", телефон: " + SotrudnikArr[i].phone + ", зарплата: " + SotrudnikArr[i].zp + ", возраст: " + SotrudnikArr[i].age);
            }
        }
    }
}
