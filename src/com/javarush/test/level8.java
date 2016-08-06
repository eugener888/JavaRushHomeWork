package com.javarush.test;

import java.util.*;

/**
 * Created by ryzev on 22.06.2016.
 */
public class level8
{
    /*public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора дл€ множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещЄ элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }*/
/*    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        Iterator<String> iterator = list.iterator();//получение итератора дл€ списка

        while (iterator.hasNext())      //проверка, есть ли ещЄ элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }*/
/*public static void main(String[] args)
{
    //все элементы хран€тс€ в парах
    Map<String, String> map = new HashMap<String, String>();
    map.put("first", "Mama");
    map.put("second", "Mila");
    map.put("third", "Ramu");

    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

    while (iterator.hasNext())
    {
        //получение Ђпарыї элементов
        Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //ключ
        String value = pair.getValue();        //значение
        System.out.println(key + ":" + value);
    }
}*/
/*public static void main(String[] args)
{
    Set<String> set = new HashSet<String>();
    set.add("Mama");
    set.add("Mila");
    set.add("Ramu");

    for (String text : set)
    {
        System.out.println(text);
    }
}*/
/*public static void main(String[] args)
{
    List<String> list = new ArrayList<String>();
    list.add("Mama");
    list.add("Mila");
    list.add("Ramu");

    for (String text : list)
    {
        System.out.println(text);
    }
}*/
/*public static void main(String[] args)
{
    Map<String, String> map = new HashMap<String, String>();
    map.put("first", "Mama");
    map.put("second", "Mila");
    map.put("third", "Ramu");

    for (Map.Entry<String, String> pair : map.entrySet())
    {
        String key = pair.getKey();                      //ключ
        String value = pair.getValue();                  //значение
        System.out.println(key + ":" + value);
    }
}*/
/*
public static void main(String[] args) throws Exception
{
    Date currentTime = new Date();           //получаем текущую дату и врем€
    Thread.sleep(3000);                      //ждЄм 3 секунды Ц 3000 миллисекунд
    Date newTime = new Date();               //получаем новое текущее врем€

    long msDelay = newTime.getTime() - currentTime.getTime(); //вычисл€ем разницу
    System.out.println("Time distance is: " + msDelay + " in ms");
}
*/

/*    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 3000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(5000);              // ждем 3 секунды

        Date currentTime = new Date();
        if (currentTime.after(endDate))//провер€ем что врем€ currentTime после endDate
        {
            System.out.println("End time!");
        }
    }*/
/*public static void main(String[] args) throws Exception
{
    Date currentTime = new Date();
    int hours = currentTime.getHours();
    int mins = currentTime.getMinutes();
    int secs = currentTime.getSeconds();

    System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
}*/
public static void main(String[] args) throws Exception
{
    Date yearStartTime = new Date();
    yearStartTime.setHours(0);
    yearStartTime.setMinutes(0);
    yearStartTime.setSeconds(0);

    yearStartTime.setDate(1);      // первое число
    yearStartTime.setMonth(0);     // мес€ц €нварь, нумераци€ дл€ мес€цев 0-11

    Date currentTime = new Date();
    long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
    long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

    int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
    System.out.println("Days from start of year: " + dayCount);
}
}
