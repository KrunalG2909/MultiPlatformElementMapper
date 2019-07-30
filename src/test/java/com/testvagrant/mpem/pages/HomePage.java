package com.testvagrant.mpem.pages;

import com.testvagrant.mpem.mapper.ElementLocatorMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//a")
    public WebElement element;

    @FindBy(xpath = "//c")
    public WebElement element2;

    protected ElementLocatorMapper elementLocatorMapper = new ElementLocatorMapper();

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, elementLocatorMapper.map(this));
    }
}
