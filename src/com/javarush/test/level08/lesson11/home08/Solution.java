package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int[] array = {9,8,7,6,5,4,3,2,1,0,20,19,18,17,16,15,14,13,12,11};

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        //сортировка пузырьком
        for (int i = 0; i < array.length - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] < array[j + 1])
                {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
    //Сортировка расчёской
    public static void CombSort(int[] input)
    {
        int gap = input.length;
        boolean swapped = true;
        while (gap > 1 || swapped)
        {
            if (gap > 1) gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < input.length)
            {
                if (input[i] < input[i + gap])
                {
                    int t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                }
                i++;
            }
        }
    }
    //Шейкерная сортировка
    public static void CocktailSort(int[] array)
    {
        int left = 0; // левая граница
        int right = array.length - 1; // правая граница

        do
        {
            //Сдвигаем к концу массива "тяжелые элементы"
            for (int i = left; i < right; i++)
            {
                if(array[i] < array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--; // уменьшаем правую границу
            //Сдвигаем к началу массива "легкие элементы"
            for (int i = right; i > left ; i--)
            {
                if(array[i] > array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++; // увеличиваем левую границу
        } while (left <= right);
    }
}
