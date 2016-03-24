package com.Chitra;

/**
 * Created by chitrakakkar on 3/24/16.
 */
public class NameCapitalizer implements NameProcessor
{
    public void process(String name)
    {
        //String nameInUpperCase=name.toUpperCase();
        System.out.println("Here is your name in upperCase" + name.toUpperCase());
    }
}
