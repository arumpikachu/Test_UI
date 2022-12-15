package com.example.test_ui;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// page_url = https://www.service.nsw.gov.au/service-centre
public class MainPage {
    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[2]/div/div/form/div[1]/input")
    public WebElement search;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[2]/div/div/form/div[2]/button")
    public WebElement btn_Srch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/header/div[2]/div/nav/ul/li[4]/a")
    public WebElement find_location;

    @FindBy(xpath = "/html/body/div[1]/main/div/article/section[1]/div/div/div/div/div/form/div/div/div[1]/input")
    public WebElement search_location;

    @FindBy(xpath = "/html/body/div[1]/main/div/article/section[1]/div/div/div/div/div/form/div/div/div[2]/div/button")
    public WebElement btnSrch_loc;

    @Step("As a Buyer, I input a sentence in the search field")
    public MainPage inputSearch() throws InterruptedException {
        search.sendKeys("Apply for a number plate");
        Thread.sleep(2000);
        return this;
    }

    @Step ("As a Buyer, I click the search button")
    public MainPage btn_Search() throws InterruptedException {
        btn_Srch.click();
        Thread.sleep(2000);
        return this;
    }

    @Step("As a Buyer, I click the Find Location button")
    public MainPage findLocation() throws InterruptedException {
        find_location.click();
        Thread.sleep(2000);
        return this;
    }

    @Step ("As a Buyer, I input the location in the Search Field")
    public MainPage inputSearchLoc1() throws InterruptedException {
        search_location.sendKeys("Sydney 2000");
        Thread.sleep(2000);
        return this;
    }

    @Step ("As a Buyer, I input the location in the Search Field")
    public MainPage inputSearchLoc2() throws InterruptedException {
        search_location.sendKeys("Sydney Domestic Airport 2020");
        Thread.sleep(2000);
        return this;
    }

    @Step ("As a Buyer, I click the search button")
    public MainPage btn_SearchLoc() throws InterruptedException {
        btnSrch_loc.click();
        Thread.sleep(2000);
        return this;
    }
}
