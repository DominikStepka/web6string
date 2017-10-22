package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        System.out.println("Podaj poprawny wyraz");
        Scanner scanner = new Scanner (System.in);
        String word = scanner.next();
        if (word.equals("Akademia")){
            System.out.println("Podałeś poprawne hsało");
        }
        else {
            System.out.println("Podałeś błędne hasło");
        }
    }
}
