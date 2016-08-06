package com.javarush.test;

/**
 * Created by ryzev on 22.06.2016.
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
        }

        numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = 10 - i;
        }
    }
}

