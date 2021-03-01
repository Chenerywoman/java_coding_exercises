package com.techreturners.exercise001;

import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {    
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {

        double vatElement = originalPrice * vatRate / 100;
        double priceWithVAT = originalPrice + vatElement;

        BigDecimal bd = new BigDecimal(priceWithVAT).setScale(2, RoundingMode.HALF_UP);
        double salary = bd.doubleValue();
        return salary;
    }

    public String reverse(String sentence) {

        char[] characters = sentence.toCharArray();
        
        String reversed = "";

        for (int i = characters.length - 1; i >= 0; i--){
            reversed = reversed + characters[i];
        }

        return reversed;
    }

    public int countLinuxUsers(List<User> users) {
        
        int count = 0;

        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getType().equals("Linux")){

                count = count + 1;
            }
        }

        return count;
    }
}
