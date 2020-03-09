package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTest {

    public static void main(String[] args) {
        Chrome();
        Firefox();
        Safari();

    }

    public static void Chrome(){
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquality(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquality(driver.getTitle(),title2);
        driver.quit();
    }

    public static void Firefox(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquality(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquality(driver.getTitle(),title2);
        driver.quit();
    }

    public static void Safari(){
        WebDriver driver = BrowserFactory.getDriver("safari");

        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquality(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquality(driver.getTitle(),title2);
        driver.quit();

    }
}
