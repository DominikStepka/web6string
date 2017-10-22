package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Michał";
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Długość wyrazu to "+name.length());
    }
}
