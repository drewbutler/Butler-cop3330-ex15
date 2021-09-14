/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the password? ");
        String password= myObj.nextLine();

        if (password.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you");
        }
        
        myObj.close();
    }
}