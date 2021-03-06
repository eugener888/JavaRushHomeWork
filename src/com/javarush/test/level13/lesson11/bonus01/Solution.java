package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        // напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        String s="";
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(fileName));

            int data = inputStreamReader.read();
            while (data != -1)
            {
                char theChar = (char) data;
                //System.out.println(theChar+" "+data);
                if (data==13) data = inputStreamReader.read();
                if (data==10)
                {
                    //System.out.println("s= "+s);
                    if (!s.equals(""))
                    {
                        int num = Integer.parseInt(s);
                        if (num % 2 == 0) list.add(num);
                        s = "";
                    }
                }
                s+=theChar;
                s=s.trim();
                data = inputStreamReader.read();
            }
            if (!s.equals(""))
            {
                int num = Integer.parseInt(s);
                if (num % 2 == 0) list.add(num);
            }
            Collections.sort(list);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

}
