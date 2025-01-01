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
                if (matches >= 1 && matches <= 3) {
                    if (count >= matches) {
                        count -= matches;
                        turn = !turn;
                    } else {
                        System.out.println(String.format("Введенное значение  %s должно быть не более остатка %s", matches, count));
                    }
                } else {
                    System.out.println(String.format("Введенное значение  %s должно быть от 1 до 3 x", matches));
                }
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

