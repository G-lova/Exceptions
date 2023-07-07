package org.example;

import static org.example.Seminar2.Task1.floatInput;
import static org.example.Seminar2.Task2.task2Correct;
import static org.example.Seminar2.Task3.task3Correct;
import static org.example.Seminar2.Task4.emptyString;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Seminar1


         // java.io.FileNotFoundException
         ExceptionTest ex = new ExceptionTest();
         ex.readFile("file.txt");

         // java.lang.ArrayIndexOutOfBoundsException
         int[] arr = new int[]{6, 5, 9, 8};
         ex.arrayElement(arr, 4);

         // java.lang.ArithmeticException
         ex.divide(5, 0);

         */

        /**
         * Seminar2
         */


        floatInput(); //Task1
        task2Correct(); //Task2
        task3Correct(); //Task3
        emptyString(); //Task4

    }
}