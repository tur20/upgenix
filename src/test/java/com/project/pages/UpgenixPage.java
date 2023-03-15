package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class UpgenixPage {

    public UpgenixPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
