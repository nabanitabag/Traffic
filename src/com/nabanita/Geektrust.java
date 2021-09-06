package com.nabanita;

import java.io.File;
import java.util.*;

import static com.nabanita.OptimumStats.calculateOptimumStats;

public class Geektrust {
    public static void main(String[] args) {
        try {
            Scanner filePathScanner = new Scanner(System.in);
            System.out.println("Please enter the file path for inputs:");
            String filePath = filePathScanner.nextLine();

            File inputFile = new File(filePath);

            Scanner readFile = new Scanner(inputFile);
            while (readFile.hasNextLine()) {
                String data = readFile.nextLine();
                String[] inputs = data.split(" ");
                String optimumVehicleStats = calculateOptimumStats(inputs[0], inputs[1], inputs[2]);

                System.out.println(optimumVehicleStats);
            }
            readFile.close();

        } catch (Exception FileNotFoundException)
        {
            System.out.println("File Not Found error occurred.");
            FileNotFoundException.printStackTrace();
        }
    }
}
