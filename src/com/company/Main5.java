package com.company;

public class Main5 {
    public static void main(String[] args){
        String name = "Michał";
        StringBuilder nameBuilder = new StringBuilder("MIchał");
        System.out.println(nameBuilder.reverse());
        nameBuilder.reverse();
        nameBuilder.append(" Ma");
        nameBuilder.append("karuk");
        System.out.println(nameBuilder);
    }
}
