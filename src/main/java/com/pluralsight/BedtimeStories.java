package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("What story do you want to hear?");
        try{
            BufferedReader storyReader = new BufferedReader(new FileReader(textScanner.nextLine()));

            String line;
            int lineCounter = 1;

            while ((line = storyReader.readLine()) != null) {
                System.out.println(lineCounter + "." + " " + line);
                lineCounter++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
