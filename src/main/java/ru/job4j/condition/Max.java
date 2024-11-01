package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public int max(int a, int b, int c, int d) {
        return max(a, b, max(c, d));
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        System.out.println(String.format("Максимальное число из 2х: %s", maximum.max(5, 7)));
        System.out.println(String.format("Максимальное число из 3х: %s", maximum.max(5, 10, 7)));
        System.out.println(String.format("Максимальное число из 4х: %s", maximum.max(5, 10, 7, 12)));
    }
}
