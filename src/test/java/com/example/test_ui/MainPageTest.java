package com.example.test_ui;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.service.nsw.gov.au/service-centre");

        mainPage = new MainPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() throws InterruptedException {
        mainPage.inputSearch().btn_Srch.click();
    }

    @Test
    public void search1() throws InterruptedException {
        mainPage.findLocation().inputSearchLoc1().btn_SearchLoc();
    }

    @Test
    public void search2() throws InterruptedException {
        mainPage.findLocation().inputSearchLoc2().btn_SearchLoc();
    }
}
