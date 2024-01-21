package com.comarch.camp.it.rent.car;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {

        String path = "C:\\Users\\olgaa\\OneDrive\\Pulpit\\Bootcamp\\plik.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String lineFromFile;
            while( (lineFromFile = reader.readLine()) != null) {
                System.out.println(lineFromFile);
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("Pliku nie ma, zepsuło się !!!");
        } catch (IOException e){
            System.out.println("Nie da sie pliku odczytać !!!");
        }


        String tekst = "To będzie nasz teskt w pliku";
        String tekst1 = "To będzie nasz drugi w pliku";
        String file = "C:\\Users\\olgaa\\OneDrive\\Pulpit\\Bootcamp\\plik2.txt";

        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write(tekst);
            writer.newLine();
            writer.write(tekst1);
            writer.close();
        } catch(IOException e) {
            System.out.println("Zepsuło się zapisywanie do pliku! ");
        }

    }
}
