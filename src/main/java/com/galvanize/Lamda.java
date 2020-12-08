package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda {

    public static void main(String[] args) {
        List<String> fileNames = new ArrayList<>(Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"));
        System.out.println(fileNames);

        fileNames.forEach(name -> {
            for(String letter : name){

            }
        }
    }

}
