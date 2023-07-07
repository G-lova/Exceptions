package org.example.Seminar2;

import java.util.Scanner;

public class Task4 {

//    4. Разработайте программу, которая выбросит Exception,
//    когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение,
//    что пустые строки вводить нельзя!!!

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void emptyString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = sc.nextLine();
        if (str.equals("")) {
            System.out.println(ANSI_RED + "Строка не может быть пустой!" + ANSI_RESET);
            emptyString();
            sc.close();
        } else {
            System.out.println("Text is correct");
        }
    }
}

