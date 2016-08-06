package com.javarush.test;

/**
 * Created by ryzev on 25.06.2016.
 */
public class level9
{
    /*public class ExceptionExample2
    {
        public static void main(String[] args)
        {
            System.out.println("Program starting.");
            try
            {
                System.out.println("Before method1 calling,");

                method1();

                System.out.println("After method1 calling. Never showed.");
            }
            catch (Exception e)
            {
                System.out.println("Exception catched.");
            }

            System.out.println("Program is still running.");
        }

        public static void method1()
        {
            int a = 100;
            int b = 0;
            System.out.println(a / b);
        }
    }*/
   /* public class ExceptionExample2
    {
        public static void main(String[] args)
        {
            System.out.println("Program starting.");

            try
            {
                System.out.println("Before method1 calling.");
                method1();
                System.out.println("After method1 calling. Never showed.");
            }
            catch (NullPointerException e)
            {
                System.out.println("Reference is null. Exception caught.");
            }
            catch (ArithmeticException e)
            {
                System.out.println("Divided by zero. Exception caught.");
            }
            catch (Exception e)
            {
                System.out.println("Any other errors. Exception caught.");
            }

            System.out.println("Program still running.");
        }

        public static void method1()
        {
            int a = 100;
            int b = 0;
            System.out.println(a / b);
        }
    }*/
   /* public static void method2() throws FileNotFoundException, ClassNotFoundException
    {
        method1();
    }
    public static void method3() throws ClassNotFoundException
    {
        try
        {
            method1();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException has been caught.");
        }
    }
    public static void method4()
    {
        try
        {
            method1();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException has been caught.");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException has been caught.");
        }
    }*/
    /*class ExceptionExampleOriginal
    {


        public static void main(String[] args)
        {
            System.out.println("main begin");
            try
            {
                System.out.println("main before call");

                method1();



                System.out.println("main after call");
            }
            catch (RuntimeException e)
            {


                String s = e.getMessage();
                System.out.println(s);
            }
            System.out.println("main end");
        }

        public static void method1()
        {
            System.out.println("method1 begin");
            method2();

            System.out.println("method1 end");
        }

        public static void method2()
        {
            System.out.println("method2");
            String s = "Message: Unknown Exception";
            throw new RuntimeException(s);

        }
    }*/

}
