package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();

/*
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
*/
        }
    }
}

/*public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}*/

/*public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        //это статическая инициализация
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //подсчёт суммы элементов
        int sum = 0;
        for (int i = 0; i < list.length; i++)
            sum += list[i];

        System.out.println("Sum is " + sum);
    }
}*/

/*
public class MainClass
{
    public static void main(String[] args) throws IOException
    {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println("Min is " + min);
    }
}*/

/*
ArrayList<String> list = new ArrayList<String>();
int n = list.size();
String s = list.get(3);
list.set(3, s);

Array	ArrayList
	Добавление элемента в конец массива
Невозможно выполнить данное действие	list.add(s);
Вставка элемента в середину массива
Невозможно выполнить данное действие	list.add(15, s);
Вставка элемента в начало массива
Невозможно выполнить данное действие	list.add(0, s);
Удаление элемента из массива
Можно стереть элемент с помощью list[3] = null. Но тогда останется «дыра» в массиве.	list.remove(3);
*/

/*
    public static void main(String[] args)
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }

    }*/

   /* public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }
    }*/

/*
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list.add(x);          //добавление в конец
            else
                list.add(0, x);      //вставка в начало
        }
    }*/

/*
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); )  //убрали увеличение i внутрь цикла
        {
            if (list.get(i) > 5)
                list.remove(i);  //не увеличиваем i, если удалили текущий  элемент
            else
                i++;
        }
    }*/

/*
    public static void main(String[] args) throws IOException
    {
        //статическая инициализация массива
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        //создание списка, где все элементы должны быть типа Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        //заполнение списка из массива
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }
    }*/

/*
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);   //добавление всех значений из одного списка в другой
        result.addAll(list2);

        for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }
    }*/
