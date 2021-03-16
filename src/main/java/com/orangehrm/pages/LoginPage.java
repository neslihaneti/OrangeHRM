package com.orangehrm.pages;

import com.orangehrm.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.orangehrm.base.BasePAge.driver;

public class LoginPage {
//user-name
//password
//login-buttonrunnerrunner
    // locators using FindBy
    @FindBy(id = "txtUsername" )
    private static WebElement userName;

    @FindBy(id = "txtPassword" )
    private static WebElement password;

    @FindBy(id = "btnLogin" )
    private  static WebElement loginBtn;

    @FindBy(id = "spanMessage" )
    private  static WebElement errorMsg;

    //Constructor
    public  LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Page Actions
    public static String verifyTitle(){
        return ElementUtil.doGetPageTitle();
   }

    public static void enterUserName(String user){
         ElementUtil.doSendText(userName, user);
   }

    public static void enterPassword(String pass){
        ElementUtil.doSendText(password, pass);
    }

    public static void clickLoginBtn(){
        ElementUtil.doClick(loginBtn);
    }

    public static String getErrorMessage(){
        return ElementUtil.doGetText(errorMsg);
    }

}
