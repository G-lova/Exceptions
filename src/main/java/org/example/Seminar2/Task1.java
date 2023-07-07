package org.example.Seminar2;

import java.util.Scanner;

public class Task1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    //        1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    //        и возвращает введенное значение.
    //        Ввод текста вместо числа не должно приводить к падению приложения,
    //        вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void floatInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String number;
        try {
            number = sc.next();
//            sc.close();
            number = number.replace(',', '.');
            System.out.println(Float.parseFloat(number));
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Ошибка ввода данных" + ANSI_RESET);
//            sc.close();
            floatInput();
        }
    }
}
