package org.example;

import java.util.Scanner;

import static java.lang.System.out;

public class JustSwitchIt {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Which verse? ");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 1 -> out.println("That's because he is Iron Man.");
            case 2 -> out.println("That's because he is Super Man.");
            case 3 -> out.println("'Cause this is the Dead Pool.");
            default -> out.println("No such verse. Please try again.");
        }

        out.println("Oh, oh, oh, oh");

        keyboard.close();
    }
}
