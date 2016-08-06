package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/


import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> list = new ArrayList<Human>();

        list.add(new Human("Павел", true, 65));
        list.add(new Human("Петр", true, 70));
        list.add(new Human("Катя", false, 55));
        list.add(new Human("Света", false, 60));
        list.add(new Human("Михаил", true, 35, list.get(1), list.get(3)));
        list.add(new Human("Аня", false, 31, list.get(0), list.get(2)));
        list.add(new Human("Игорь", true, 2, list.get(4), list.get(5)));
        list.add(new Human("Вася", true, 12, list.get(4), list.get(5)));
        list.add(new Human("Даша", false, 5, list.get(4), list.get(5)));

        for (Human item : list)
        {
            System.out.println(item);
        }

    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex = true;
        private int age = 18;
        private Human father;
        private Human mother;

        Human(String name)
        {
            this.name = name;
            this.mother = null;
            this.father = null;
        }

        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = null;
            this.father = null;
        }

        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
