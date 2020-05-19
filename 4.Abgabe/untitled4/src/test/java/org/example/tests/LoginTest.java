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
        login.with("Maxx","Mustermdsann","+491724421793","max@muster.com","MusterStraße 10","Musterstadt","Musterstaat","24132","Musterman232","Musterpasswort1234","Musterpasswort1234","2");
        //login.assertValidLogin();
        login.fill("oneway","1","Frankfurt","5","20","London","5","15","Coach","No Preference");
    }
}
