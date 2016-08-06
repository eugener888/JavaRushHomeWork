package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Лицо");
        set.add("Лишь");
        set.add("Любый");
        set.add("Любой");
        set.add("Легкий");
        set.add("Любить");
        set.add("Лежать");
        set.add("Личный");
        set.add("Лучший");
        set.add("Лес");
        set.add("Лестница");
        set.add("Либо");
        set.add("Левый");
        set.add("Леса");
        set.add("Лежалый");
        set.add("Лошадь");
        set.add("Люба");
        set.add("Линия");
        set.add("Лодка");
        set.add("Ладонь");
        return set;
    }
}
