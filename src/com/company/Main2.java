package com.company;

public class Main2 {
    public static void main(String[] args){

        String city = "Warszawa";
        System.out.println(city.charAt(0));
        char firstLetter = city.charAt(0);
        if (firstLetter == 'W'){
            System.out.println("Zaczyna się na W");
        }
        else{
            System.out.println("NIe zaczyna się na W");
        }
    }
}
