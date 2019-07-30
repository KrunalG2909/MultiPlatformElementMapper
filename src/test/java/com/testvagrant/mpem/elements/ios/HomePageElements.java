package com.testvagrant.mpem.elements.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

    @FindBy(xpath = "//b")
    private WebElement element;

    @FindBy(xpath = "//d")
    public WebElement element2;
}
