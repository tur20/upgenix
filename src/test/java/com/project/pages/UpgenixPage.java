package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgenixPage {

    public UpgenixPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "login")
    public WebElement usernameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (className = "alert")
    public WebElement wrongInputMessage;

    @FindBy(className = "oe_topbar_name")
    public WebElement loggedInUserName;

    @FindBy(linkText = "Log out")
    public WebElement logOutButton;

    @FindBy(className = "o_dialog_warning")
    public WebElement sessionExpiredMessage;




}
