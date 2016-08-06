package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        System.out.println(max(a, max(b, c)));
        System.out.println(a+b+c-max(a, max(b, c))-min(a, min(b, c)));
        System.out.println(min(a, min(b, c)));

    }
    public static int max(int a, int b)
    {
        if (a>b)
            return a;
        else
            return b;
    }
    public static int min(int a, int b)
    {
        if (a<b)
            return a;
        else
            return b;
    }
}
