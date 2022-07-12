package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", 1000);
        Book b2 = new Book("Преступление и наказание", 800);
        Book b3 = new Book("Конституция РФ", 35);
        Book b4 = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("Название книги: " + "\"" + b.getTitle() + "\""
                    + ", Кол-во страниц: " + b.getNumberOfPages());
        }
        System.out.println();
        Book bb = books[0];
        books[0] = books[3];
        books[3] = bb;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("Название книги: " + "\"" + b.getTitle() + "\""
                    + ", Кол-во страниц: " + b.getNumberOfPages());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getTitle().equals("Clean code")) {
                System.out.println("Название книги: " + "\"" + b.getTitle() + "\""
                        + ", Кол-во страниц: " + b.getNumberOfPages());
            }

        }
    }
}
