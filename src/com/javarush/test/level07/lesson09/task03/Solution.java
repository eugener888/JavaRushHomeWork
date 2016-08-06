package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] data = {"мама", "мыла", "раму"};

        //создание списка, где все элементы должны быть типа String
        ArrayList<String> list = new ArrayList<String>();

        //заполнение списка из массива
        for (int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
            list.add("именно");
        }



        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
