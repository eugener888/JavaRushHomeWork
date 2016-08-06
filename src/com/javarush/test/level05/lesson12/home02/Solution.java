package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("Vasya", 30, "Moscow");
        Man man2 = new Man("Petya", 21, "Peterburg");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Dasha", 22, "Moscow");
        Woman woman2 = new Woman("Masha", 18, "Peterburg");
        System.out.println(woman1);
        System.out.println(woman2);


        //выведи их на экран тут
    }

    public static class Man
    {
        private String name = null;
        private int age = 0;
        private String address = null;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman
    {
        private String name = null;
        private int age = 0;
        private String address = null;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
