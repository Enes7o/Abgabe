package org.example.tests;

import org.example.pages.Login;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    Login login;
    @Before
    public void setup(){
        login = new Login();
    }

    @Test
    public void validLoginTest(){
        login.with("tomsmith","SuperSecretPassword!");
        login.assertValidLogin();
    }
}
