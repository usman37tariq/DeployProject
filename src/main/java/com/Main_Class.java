package com;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;


public class Main_Class {


    public boolean compare_string(){
        String str = "This is my first JUnit program";
        try{
            assertEquals("This is my first JUnit program", str);
            return true;
        }
        catch(AssertionError e) {
            return false;
        }
    }

    public int compare_number(){
        int a=5;
        int b=6;
        return a+b;
    }

}