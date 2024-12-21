package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        try {
            while (count > 0) {
                String player = turn ? "Первый игрок" : "Второй игрок";
                System.out.println(String.format("%s введите число от 1 до 3:", player));
                int matches = Integer.parseInt(input.nextLine());
                turn = !turn;
                if (matches < 1 || matches > 3) {
                    System.out.println(String.format("Введенное значение  %s должно быть от 1 до 3 x", matches));
                    System.out.println("Введите повторно значение: ");
                    matches = Integer.parseInt(input.nextLine());
                } else
                if (count < matches) {
                    System.out.println(String.format("Введенное значение %s больше остатка", matches));
                    System.out.println("Введите повторно значение: ");
                    matches = Integer.parseInt(input.nextLine());
                }
                count -= matches;
            }
            if (!turn) {
                System.out.println("Выиграл первый игрок");
            } else {
                System.out.println("Выиграл второй игрок");
            }
        } catch (NumberFormatException e) {
            System.out.println("Не верный формат введенного числа. Игра завершена.");
        }
        System.out.println("Спасибо за игру!");
    }
}

