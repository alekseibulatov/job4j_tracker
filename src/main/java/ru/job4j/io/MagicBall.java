package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в мир предсказаний!!!");
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String question = scanner.nextLine();
        int answerNumber = new Random().nextInt(3);
        String answer;
        switch (answerNumber) {
            case 0:
                answer = "Да";
                break;
            case 1:
                answer = "Нет";
                break;
            default:
                answer = "Может быть";

        }
        System.out.println(String.format("Ответ на твой вопрос %s такой -  %s", question, answer));
    }
}
