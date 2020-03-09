package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://luluandgeorgia.com",
                "http://wayfair.com/", "http://walmart.com", "http://westelm.com/");





        for(int x = 0; x < urls.size(); x++) {
            WebDriver driver = BrowserFactory.getDriver("chrome");

            driver.get(urls.get(x));
            String title = driver.getTitle().replace(" ","").toLowerCase().substring(0,7);

            if(urls.get(x).contains(title)){
                System.out.println("Test passed - "+urls.get(x)+" contains "+title);
            }else{
                System.out.println("TEST FAILED - "+urls.get(x)+" does not contain "+title);
            }
            driver.quit();
        }


    }
}
