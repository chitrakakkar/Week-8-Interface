package com.Chitra;

import java.util.Scanner;

public class NameGetter
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = scanner.next();

        //NameProcessor nameProcessor = new NameCapitalizer();
        //NameProcessor nameProcessor = new NameSaver();
        NameProcessor nameExclaim = new NameExclaim();
        nameExclaim.process(Name);
        scanner.close();
    }
}
