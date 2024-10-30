package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        return (a > b) ? max(a, c) : max(b, c);
    }

    public int max(int a, int b, int c, int d) {
        int i = (a > b) ? max(a, c) : max(b, c);
        return max(i, d);
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        System.out.println(String.format("Максимальное число из 2х: %s", maximum.max(5, 7)));
        System.out.println(String.format("Максимальное число из 3х: %s", maximum.max(5, 10, 7)));
        System.out.println(String.format("Максимальное число из 4х: %s", maximum.max(5, 10, 7, 12)));
    }
}
