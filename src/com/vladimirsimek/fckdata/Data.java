package com.vladimirsimek.fckdata;

import java.io.*;

public class Data {

    public static void parseAnimalID(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data/animals.csv"));
            BufferedReader bufferedReaderID = new BufferedReader(new FileReader("data/animal_types.csv"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data/output/parsed_animals.csv"));

            String rawAnimalLine = bufferedReader.readLine();

            String rawAnimalIDLine = bufferedReaderID.readLine();



            while (rawAnimalLine != null) {

                String[] splitLine = rawAnimalLine.split(";");

                AnimalIdentifier animalIdentifier = new AnimalIdentifier();

                animalIdentifier.id = Long.parseLong(splitLine[0]);
                animalIdentifier.type = Integer.parseInt(splitLine[1]);
                animalIdentifier.name = splitLine[2];
                animalIdentifier.age = Integer.parseInt(splitLine[3]);
                animalIdentifier.gender = splitLine[4];
                animalIdentifier.isAggressive = splitLine[5];
                animalIdentifier.isFriendly = splitLine[6];


                rawAnimalLine = bufferedReader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getAggressiveAnimals() {

    }

}
