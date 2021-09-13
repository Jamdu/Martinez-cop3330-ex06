/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        int year = Year.now().getValue();

        //System.out.println(dtf.format(now));

        System.out.println("What is your age?");
        int age = scnr.nextInt();

        System.out.println("At what age would you like to retire?");
        int retire = scnr.nextInt();

        int retireAge = retire - age;

        if (retireAge < 0){
            System.out.println("You can retire ya old coot!");
            System.exit(0);
        }

        System.out.format("You have %d years left until you can retire.\n", retireAge);

        int retireYear = year + retireAge;

        System.out.format("It's " + year + ", so you can retire in %d.", retireYear);



    }
}
