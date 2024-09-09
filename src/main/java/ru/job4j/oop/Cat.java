package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(String.format("%s eat %s", this.name, this.food));
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void getNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.eat("cutlet");
        gav.getNick("Peppy");
        gav.show();

        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.getNick("Sparky");
        black.show();
    }
}
