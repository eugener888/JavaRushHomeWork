package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Norris", new Date("JULY 1 1967"));
        map.put("Swarz", new Date("AUGUST 14 1952"));
        map.put("Vandam", new Date("JANUARY 1 1970"));
        map.put("Britney", new Date("MARCH 1 1985"));
        map.put("Roberts", new Date("MAY 1 1976"));
        map.put("Dissel", new Date("SEPTEMBER 1 1975"));
        map.put("Lungren", new Date("DECEMBER 1 1956"));
        map.put("Fox", new Date("FEBRUARY 1 1976"));
        map.put("Eastwood", new Date("JUNE 1 1950"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Set<String> key4remove = new HashSet<String>();
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Date value = pair.getValue();                  //значение
            int monthNum = value.getMonth();
            if (monthNum > 4 && monthNum < 8)
                key4remove.add(key);
        }
        for (String s : key4remove)
            map.remove(s);
        //return map;
    }
/*    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Date value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }*/
}
