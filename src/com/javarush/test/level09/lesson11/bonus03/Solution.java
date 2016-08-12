package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        /*
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> words = new ArrayList();
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])) numbers.add(i);
            else words.add(i);
        }
        for (int i = 0; i < words.size() - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < words.size() - i - 1; j++)
            {
                if (isGreaterThan(array[words.get(j)], array[words.get(j + 1)]))
                {
                    String tmp = array[words.get(j)];
                    array[words.get(j)] = array[words.get(j + 1)];
                    array[words.get(j + 1)] = tmp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        for (int i = 0; i < numbers.size() - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < numbers.size() - i - 1; j++)
            {
                if (!isGreaterThan(array[numbers.get(j)], array[numbers.get(j + 1)]))
                {
                    String tmp = array[numbers.get(j)];
                    array[numbers.get(j)] = array[numbers.get(j + 1)];
                    array[numbers.get(j + 1)] = tmp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        */
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if(isNumber(array[i]) && isNumber(array[j]))
                {

                    if (Integer.parseInt(array[i])>Integer.parseInt(array[j]))
                    {
                        String tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
                if(!isNumber(array[i]) && !isNumber(array[j]))
                {
                    if (!isGreaterThan(array[i], array[j]))
                    {
                        String tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }

            }
        }


    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
