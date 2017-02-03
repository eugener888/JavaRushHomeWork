package com.javarush.test.level14.lesson08.home09;

import com.javarush.test.level14.lesson06.home01.Hen;

/**
 * Created by p50_ryzhkovev on 03.02.2017.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount){super(amount);}

    public String getCurrencyName(){return "HRN";}
}
