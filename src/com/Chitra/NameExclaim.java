package com.Chitra;

/**
 * Created by chitrakakkar on 3/24/16.
 */
public class NameExclaim implements NameProcessor
{
    public void process(String name)
    {
        String nameExclaim = name + "!!!";
        System.out.println("Your name now is " + nameExclaim);
    }
}
