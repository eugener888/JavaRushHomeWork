package com.javarush.test.level05.lesson07.task02;
/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Solution
{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.initialize(10, "red","moscow");
        System.out.println("test");
        System.out.println(cat1.name);
        System.out.println(cat1.address);
        System.out.println(cat1.color);
        System.out.println(cat1.age);
        System.out.println(cat1.weight);
    }

    public static class Cat
    {
        protected String name = null;
        protected String address = null;
        protected String color = "Gray";
        protected int age = 2;
        protected int weight = 2;

        public void initialize(String name)
        {
            this.name = name;
        }

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void initialize(String name, int weight, int age)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void initialize(int weight, String color)
        {
            this.color = color;
            this.weight = weight;
        }

        public void initialize(int weight, String color, String address)
        {
            this.color = color;
            this.weight = weight;
            this.address = address;
        }
    }
}
