package com.javarush.test.level14.lesson06.home01;

public abstract class Hen implements Country
{
    abstract int getCountOfEggsPerMonth();
    String getDescription(){return "Я курица.";}
}
