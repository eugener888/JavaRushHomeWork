package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirst = reader.readLine();
        int nFirst = Integer.parseInt(sFirst);
        String sSecond = reader.readLine();
        int nSecond = Integer.parseInt(sSecond);
        if (nFirst<nSecond)
            System.out.println(nFirst);
        else
            System.out.println(nSecond);
    }
}