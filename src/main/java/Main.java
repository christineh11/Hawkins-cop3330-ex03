/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Christine Hawkins
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner quote= new Scanner(System.in);

        System.out.println("What is the quote?");

        String thequote=quote.nextLine();

        System.out.println("Who said it?");

        String author=quote.nextLine();
        System.out.printf("%s says, \"%s\"",author, thequote);


    }
}
