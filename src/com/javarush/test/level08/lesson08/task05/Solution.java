package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        Map<String, Integer> valueMap = new HashMap<String, Integer>();
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String name = pair.getValue();
            if(!valueMap.containsKey(name))
                valueMap.put(name, 0);
            valueMap.put(name, valueMap.get(name)+1);
        }
        for (Map.Entry<String, Integer> pair: valueMap.entrySet())
        {
            if(pair.getValue()>1)
                removeItemFromMapByValue(map, pair.getKey());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    /*public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }*/
}
