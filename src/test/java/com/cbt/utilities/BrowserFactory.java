package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String opSystem) {


        if(opSystem.equalsIgnoreCase("safari")){
            return null;
        }else if (opSystem.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        }else if(opSystem.equalsIgnoreCase("edge")) {
            WebDriverManager.chromedriver().setup();
            return new EdgeDriver();
        }else if (opSystem.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            return new FirefoxDriver();
        }else {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();




        }
    }
}

