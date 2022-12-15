package Lesson_8;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("375(29)222-33-44", "Викторова");
        phoneBook.add("375(44)222-33-44", "Викторова");
        phoneBook.add("375(25)222-33-44", "Викторова");
        phoneBook.add("375(29)111-33-44", "Иванов");
        phoneBook.add("375(44)789-44-73", "Хомченко");
        phoneBook.add("375(44)115-33-44", "Петрова");
        phoneBook.add("375(33)412-11-77", "Лукьяненко");
        phoneBook.add("375(29)456-74-32", "Назаров");

        phoneBook.get("Викторова");
        System.out.println();
        phoneBook.get("Иванов");
        System.out.println();
        phoneBook.get("Хомченко");
        System.out.println();
        phoneBook.get("Петрова");
        System.out.println();
        phoneBook.get("Лукьяненко");
        System.out.println();
        phoneBook.get("Назаров");

    }

}

