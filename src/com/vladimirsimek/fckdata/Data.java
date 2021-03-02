package com.vladimirsimek.fckdata;

import java.io.*;

public class Data {

    public static void parseAnimalID(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data/animal_types.csv"));
            BufferedReader bufferedReaderID = new BufferedReader(new FileReader("data/animals.csv"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/output/parsed_animals.csv"));

            String rawAnimalLine = bufferedReader.readLine();
            String rawAnimalIDLine = bufferedReaderID.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getAggressiveAnimals() {

    }
}
