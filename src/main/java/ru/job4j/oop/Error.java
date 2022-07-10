package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Значение поля 1: " + active);
        System.out.println("Значение поля 2: " + status);
        System.out.println("Значение поля 3: " + message);
    }

    public static void main(String[] args) {
        Error er1 = new Error(true, 1, "ошибка");
        Error er2 = new Error();
        er1.printInfo();
        er2.printInfo();
    }
}


