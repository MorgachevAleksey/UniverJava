package com.fintech.practice1;

import java.util.Scanner;

public class Tusk1 {
    public static void main (String[] args){
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        int digit;
        String message;

        Scanner scan = new Scanner(System.in);
        String stringYuan = scan.nextLine();
        yuan = Integer.valueOf(stringYuan);

        //По условию задачи - double, но финансовые расчеты корректно производить ТОЛЬКО в BigDecimal
        roubles = ROUBLES_PER_YUAN * yuan;
        digit = yuan % 10;
        //По условию задачи склоняется по последней цифре, но корректнее - по двум последним
        if (digit == 1){
            message = "Юань";
        }
        else if (digit == 2 || digit == 3 || digit == 4){
            message = "Юаня";
        } else {
            message = "Юаней";
        }

        System.out.println("Сумма: " + yuan + " " + message);
        System.out.println("В пересчете на рубли: " + roubles);
    }
}
