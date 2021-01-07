package com;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class LoginPageTest {
    LoginPage Class;

    @Test
    public void compare_str() {
        Class = new LoginPage();
        boolean result = Class.compare_string();
        if(false) {
            Assertions.fail("Did not Run Suceesfully");
        }
        else{
            System.out.println("Run Suceesfully");
        }
    }

    @Test
    public void compare_int() {
        Class = new LoginPage();
        int result = Class.compare_number();
        if(result>10) {
            Assertions.fail("Did not Run Suceesfully");
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
