package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 26;
        int temp = 15;
        String name = "aidin";

        if ((age >=20 && age <=45)&&(temp <+30 && temp >-20) ){
            System.out.println("Можно идти гулять");}

        else if (age <20 && temp >0 && temp <28){
            System.out.println("Можно идти гулять1");}

        else if (age >45 && temp >-10 && temp <25){
            System.out.println("Можно идти гулять3");}
    }

}
