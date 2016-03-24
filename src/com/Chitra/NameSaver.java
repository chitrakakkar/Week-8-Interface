package com.Chitra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chitrakakkar on 3/24/16.
 */
public class NameSaver implements NameProcessor
{
    public void process(String name)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"));
            writer.write(name);
            writer.close();
            System.out.println("Saved your nam to name.txt");
        }
        catch (IOException e)
        {
            System.out.println("Opps !!!");
        }
    }

}
