package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionTest {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void readFile(String file_name) {

        // java.io.FileNotFoundException
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file_name));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(ANSI_RED + "Файл не существует: " + ANSI_RESET + e);
        }
    }

    public static void arrayElement(int[] array, int i) {
        try {
            System.out.println(array[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ANSI_RED + "Элемент за пределами массива: " + ANSI_RESET + e);
        }
    }

    public static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(ANSI_RED + "Деление на 0: " + ANSI_RESET + e);
        }
    }
}
