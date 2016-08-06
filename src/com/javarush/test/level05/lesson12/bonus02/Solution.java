package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());

        int minimum = min(num1, num2);
        minimum = min(minimum, num3);
        minimum = min(minimum, num4);
        minimum = min(minimum, num5);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
