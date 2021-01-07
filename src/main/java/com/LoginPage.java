package com;


import org.junit.jupiter.api.Assertions;


public class LoginPage {


    public boolean compare_string(){
        String str = "This is my first JUnit program";
        try{
            Assertions.assertEquals("This is my first JUnit program", str);
            return true;
        }
        catch(AssertionError e) {
            return false;
        }
    }

    public int compare_number(){
        int a=2;
        int b=3;
        return a+b;
    }

}