package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;


public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        //System.out.println("Enter file name: ");
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            InputStream inStream = new FileInputStream(fileName);
            PrintStream outStream = new PrintStream(System.out);

            while (inStream.available() > 0)
            {
                int data = inStream.read(); //читаем один байт из потока для чтения
                outStream.write(data); //записываем прочитанный байт в другой поток.
            }

            inStream.close(); //закрываем потоки
            outStream.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
