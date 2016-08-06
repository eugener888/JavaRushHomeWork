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

        //��������� ��������� ��� ���������
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //��������, ���� �� ��� ��������
        {
            //��������� �������� �������� � ������� �� ���������
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

        Iterator<String> iterator = list.iterator();//��������� ��������� ��� ������

        while (iterator.hasNext())      //��������, ���� �� ��� ��������
        {
            //��������� �������� �������� � ������� �� ���������
            String text = iterator.next();

            System.out.println(text);
        }
    }*/
/*public static void main(String[] args)
{
    //��� �������� �������� � �����
    Map<String, String> map = new HashMap<String, String>();
    map.put("first", "Mama");
    map.put("second", "Mila");
    map.put("third", "Ramu");

    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

    while (iterator.hasNext())
    {
        //��������� ������ ���������
        Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //����
        String value = pair.getValue();        //��������
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
        String key = pair.getKey();                      //����
        String value = pair.getValue();                  //��������
        System.out.println(key + ":" + value);
    }
}*/
/*
public static void main(String[] args) throws Exception
{
    Date currentTime = new Date();           //�������� ������� ���� � �����
    Thread.sleep(3000);                      //��� 3 ������� � 3000 �����������
    Date newTime = new Date();               //�������� ����� ������� �����

    long msDelay = newTime.getTime() - currentTime.getTime(); //��������� �������
    System.out.println("Time distance is: " + msDelay + " in ms");
}
*/

/*    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 3000;   //    +5 ������
        Date endDate = new Date(endTime);

        Thread.sleep(5000);              // ���� 3 �������

        Date currentTime = new Date();
        if (currentTime.after(endDate))//��������� ��� ����� currentTime ����� endDate
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

    yearStartTime.setDate(1);      // ������ �����
    yearStartTime.setMonth(0);     // ����� ������, ��������� ��� ������� 0-11

    Date currentTime = new Date();
    long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
    long msDay = 24 * 60 * 60 * 1000;  //������� ����������� � ����� ������

    int dayCount = (int) (msTimeDistance/msDay); //���������� ����� ����
    System.out.println("Days from start of year: " + dayCount);
}
}
