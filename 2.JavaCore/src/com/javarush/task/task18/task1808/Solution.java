package com.javarush.task.task18.task1808;

/* 

Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileon, filetw, fileth;
        fileon = bufferedReader.readLine();
        filetw = bufferedReader.readLine();
        fileth = bufferedReader.readLine();
        FileInputStream fileInputStreamOne = new FileInputStream(fileon);
        FileOutputStream fileOutputStreamOne = new FileOutputStream(filetw);
        FileOutputStream fileOutputStreamTwo = new FileOutputStream(fileth);

        while (fileInputStreamOne.available() > -1) {
            fileInputStreamOne.read(1,1,1);
        }

    }
}
