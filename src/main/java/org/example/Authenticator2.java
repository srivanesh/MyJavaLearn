package org.example;

import java.util.Scanner;

import static java.lang.System.out;

public class Authenticator2 {

    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        out.print("Username: ");
        String username = keyboard.next();
        if(username.equals("testuser")){
            out.print("Enter Password: ");
            String password = keyboard.next();
            if(password.equals("devtest")){
                out.println("You are in");
            }else{
                out.println("You are not logged in");
            }
        }else{
            out.println("unknown user");
        }
        keyboard.close();
    }
}
