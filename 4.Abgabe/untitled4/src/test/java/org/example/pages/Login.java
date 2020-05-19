package org.example.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Login {

    private By firstLocator = By.name("firstName");
    private By lastLocator = By.name("lastName");
    private By phoneLocator = By.name("phone");
    private By mailLocator = By.name("userName");
    private By addressLocator = By.name("address1");
    private By cityLocator = By.name("city");
    private By stateLocator = By.name("state");
    private By postalLocator = By.name("postalCode");
    private By usernameLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By passwordcnfrmLocator = By.name("confirmPassword");
    private By slctcountryLocator = By.name("country");
    private By tripTypeLocator = By.name("tripType");
    private By passCountTypeLocator = By.name("passCount");
    private By fromPortLocator = By.name("fromPort");

    private By fromMonthLocator = By.name("fromMonth");
    private By fromDayLocator = By.name("fromDay");
    private By toPortLocator = By.name("toPort");
    private By toMonthLocator = By.name("toMonth");
    private By toDayLocator = By.name("toDay");
    private By servClassLocator = By.name("servClass");
    private By airlineLocator = By.name("airline");
    private By findFlightsButtonLocator = By.name("findFlights");


    private By registerButton = By.name("register");
    private By validLoginLocator = By.tagName("Thank you for registering.");

    public Login(){
        open("http://newtours.demoaut.com/mercuryregister.php");
    }
    public void with(String firstName,String lastName,String phone,String userName,String address1,String city,String state,String postalCode,String email,String password,String confirmPassword,String country){
        $(firstLocator).val(firstName);
        $(lastLocator).val(lastName);
        $(phoneLocator).val(phone);
        $(mailLocator).val(userName);
        $(addressLocator).val(address1);
        $(cityLocator).val(city);
        $(stateLocator).val(state);
        $(postalLocator).val(postalCode);
        $(slctcountryLocator).selectOptionByValue(country);
        $(usernameLocator).val(email);
        $(passwordLocator).val(password);
        $(passwordcnfrmLocator).val(confirmPassword);
        $(registerButton).click();
    }
    public void login2(String userName,String password){
        $(usernameLocator).val(userName);
        $(passwordLocator).val(password);
    }

    public void fill(String tripType,String passCount,String fromPort,String fromMonth,String fromDay,String toPort,String toMonth,String toDay,String servClass,String airline){
        $(tripTypeLocator).selectRadio(tripType);
        $(passCountTypeLocator).selectOptionByValue(passCount);
        $(fromPortLocator).selectOptionByValue(fromPort);
        $(fromMonthLocator).selectOptionByValue(fromMonth);
        $(fromDayLocator).selectOptionByValue(fromDay);
        $(toPortLocator).selectOptionByValue(toPort);
        $(toMonthLocator).selectOptionByValue(toMonth);
        $(toDayLocator).selectOptionByValue(toDay);
        $(servClassLocator).selectRadio(servClass);
        $(airlineLocator).selectOption(airline);
        $(findFlightsButtonLocator).click();
    }

   public void assertValidLogin(){
        //$(validLoginLocator).shouldBe(Condition.visible).waitUntil(Condition.visible,4000);
        //$(validLoginLocator).findElement(By.xpath("a href=mercurysignon.php"));
    }
}
