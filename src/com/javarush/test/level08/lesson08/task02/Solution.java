package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> Set = new HashSet<Integer>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        Set.add(6);
        Set.add(7);
        Set.add(8);
        Set.add(9);
        Set.add(10);
        Set.add(11);
        Set.add(12);
        Set.add(13);
        Set.add(14);
        Set.add(15);
        Set.add(16);
        Set.add(17);
        Set.add(18);
        Set.add(19);
        Set.add(0);

        return Set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        HashSet<Integer> newSet = new HashSet<Integer>();
        for (Integer i : set)
            if(i>10)
                newSet.add(i);
        set.removeAll(newSet);
        return set;
    }
/*    public static void main(String[] args)
    {
        HashSet<Integer> Set = createSet();
        Set = removeAllNumbersMoreThan10(Set);

        for (Integer i : Set)
            System.out.println(i);

    }*/
}
