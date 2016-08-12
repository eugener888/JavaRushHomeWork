package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap();
        map.put("Кот 1", new Cat("Кот 1"));
        map.put("Кот 2", new Cat("Кот 2"));
        map.put("Кот 3", new Cat("Кот 3"));
        map.put("Кот 4", new Cat("Кот 4"));
        map.put("Кот 5", new Cat("Кот 5"));
        map.put("Кот 6", new Cat("Кот 6"));
        map.put("Кот 7", new Cat("Кот 7"));
        map.put("Кот 8", new Cat("Кот 8"));
        map.put("Кот 9", new Cat("Кот 9"));
        map.put("Кот 10", new Cat("Кот 10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        return new HashSet<Cat>(map.values());
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
