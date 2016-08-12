package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        String beginDate = "JANUARY 1 " + date.substring(date.length()-4);
        Date dateDate = new Date(date);
        Date beginDateDate = new Date(beginDate);
        long dif = (dateDate.getTime()-beginDateDate.getTime())/1000/60/60/24 + 1;
        return (dif % 2 == 1);
    }
}
