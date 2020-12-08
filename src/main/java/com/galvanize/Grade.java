package com.galvanize;

public class Grade {

    String grade(int input){
        if(input >= 90) return "A";
        else if(input >= 80) return "B";
        else if (input >= 70) return "C";
        else if (input >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        int value = 143;
        Grade test = new Grade();
        System.out.println(test.grade(value));
    }
}
