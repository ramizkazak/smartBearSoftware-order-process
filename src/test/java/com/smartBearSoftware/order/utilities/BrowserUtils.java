package com.smartBearSoftware.order.utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something happened in sleep method");
        }
    }

    public static void wait(int time){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),time);

    }


}
