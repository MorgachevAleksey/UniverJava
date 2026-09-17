package com.fintech.practice1.tusk2;

import java.util.Scanner;

public class Tusk1 {
    public static void main (String[] args){
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        int digit;
        String message;

        Scanner scan = new Scanner(System.in);
        String syuan = scan.nextLine();
        yuan = Integer.valueOf(syuan);

        roubles = ROUBLES_PER_YUAN * yuan;
        digit = yuan % 10;
        if (digit == 1){
            message = "Йена";
        }
        else if (digit == 2 || digit == 3 || digit ==4){
            message = "Йены";
        } else {
            message = "Йен";
        }

        System.out.println("Vi polozili " + yuan + message);
        System.out.println("Result in roubles: " + roubles  );
    }
}
