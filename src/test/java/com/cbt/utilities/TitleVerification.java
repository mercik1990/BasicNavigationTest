package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        List<String> titles = new ArrayList<>();

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for(int y = 0; y < urls.size(); y++) {
            driver.get(urls.get(y));
            titles.add(driver.getTitle());
            if(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com/")){
                System.out.println("TEST PASSED");
            }else{
                System.out.println("TEST FAILED");
            }

        }

        for(int i = 0; i < titles.size()-1 ; i++){
            StringUtility.verifyEquality(titles.get(i), titles.get(i+1));
        }

        driver.quit();


    }
}
