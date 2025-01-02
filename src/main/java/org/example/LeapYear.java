package org.example;

import java.util.Scanner;

import static java.lang.System.*;

public class LeapYear {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.println("Enter the Month: ");
        String month = keyboard.next();
        boolean isLeapYear;
        out.println(switch (month){
            case "January","March", "May", "July", "August", "October", "December" -> 31;
            case "April", "June", "September", "November" -> 30;
            case "Feburary" -> {
                out.println("Leap Year (true/false) ?");
                isLeapYear = keyboard.nextBoolean();
                if(isLeapYear){
                    yield 29;
                }else{
                    yield  28;
                }
            }
            default -> 0;
        }+ " days");

    }
}
