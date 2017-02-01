package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen
{
    int getCountOfEggsPerMonth(){return 10;}

    @Override
    String getDescription()
    {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.",
                super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
