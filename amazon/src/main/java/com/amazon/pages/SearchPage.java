package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath="//span[@class='a-color-state a-text-bold']")
    private WebElement searchItem;

    public String validateSearchItem(){
        return searchItem.getText();

    }

}
