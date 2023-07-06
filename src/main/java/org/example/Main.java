package org.example;

public class Main {
    public static void main(String[] args) {

        // java.io.FileNotFoundException
        ExceptionTest ex = new ExceptionTest();
        ex.readFile("file.txt");

        // java.lang.ArrayIndexOutOfBoundsException
        int[] arr = new int[]{6, 5, 9, 8};
        ex.arrayElement(arr, 4);

        // java.lang.ArithmeticException
        ex.divide(5, 0);
    }
}