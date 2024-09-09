package ru.job4j.oop;

public class Error {

    boolean active;

    int status;

    String message;

    Error() {

    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(String.format("Активная ошибка %s", active));
        System.out.println(String.format("Статус ошибки %s", status));
        System.out.println(String.format("Сообщение ошибки %s", message));
    }

    public static void main(String[] args) {
        Error error = new Error(true, 401, "Unauthorized");
        error.printInfo();
        Error errorEmpty = new Error();
        errorEmpty.printInfo();
    }
}
