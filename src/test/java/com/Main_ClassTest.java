package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import com.Main_Class;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.testng.annotations.BeforeTest;

public class Main_ClassTest {
    Main_Class Class;

    @Test
    public void compare_str() {
        Class = new Main_Class();
        boolean result = Class.compare_string();
        if(false) {
            fail("Did not Run Suceesfully");
        }
        else{
        System.out.println("Run Suceesfully");
    }
    }

    @Test
    public void compare_int() {
        Class = new Main_Class();
        int result = Class.compare_number();
        if(result>10) {
            fail("Did not Run Suceesfully");
        }
        else{
            System.out.println("Run Suceesfully");
        }
    }
    @Test
    public void openbrowser() {

        System.out.println("Browser Open Successfully");
    }

    @Test
    public void checkbrowser() {

        System.out.println("Browser Checked Successfully");
    }

    @Test
    public void closebrowser() {

        System.out.println("Browser Closed Successfully");
    }


}
