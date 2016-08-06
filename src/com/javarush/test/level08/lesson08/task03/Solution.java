package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Gevey");
        map.put("Dog", "Tom");
        map.put("Eat", "Hugs");
        map.put("Food", "Tom");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            if(value.equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            if(key.equals(lastName))
                count++;
        }
        return count;
    }
/*
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Tom"));
        System.out.println(getCountTheSameLastName(map, "Baby"));
    }
*/
}
