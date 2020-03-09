package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquality(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }
}
