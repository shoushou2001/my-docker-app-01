package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        writeToFile();
        System.out.println("Hello world!");
    }

    private static void writeToFile() throws IOException, InterruptedException {
        String text = "Hello, this is java.";

        File file = new File("abc.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(text.getBytes());
        //sleep for a while for checking output in container
        Thread.sleep(300000);
        fos.close();
    }
}