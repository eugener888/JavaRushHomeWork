package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> list = new ArrayList<Human>();
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> father = new ArrayList<Human>();
        ArrayList<Human> mother = new ArrayList<Human>();
        list.add(new Human("Игорь", true, 2));
        list.add(new Human("Вася", true, 12));
        list.add(new Human("Даша", false, 5));
        children.add(list.get(0));
        children.add(list.get(1));
        children.add(list.get(2));
        list.add(new Human("Аня", false, 31, children));
        list.add(new Human("Михаил", true, 35, children));
        father.add(list.get(4));
        mother.add(list.get(3));
        list.add(new Human("Катя", false, 55, father));
        list.add(new Human("Света", false, 60, mother));
        list.add(new Human("Павел", true, 65, father));
        list.add(new Human("Петр", true, 70, mother));
        Collections.reverse(list);
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
        private ArrayList<Human> children;

        Human(String name)
        {
            this.name = name;
            this.children = new ArrayList<Human>();
        }

        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
