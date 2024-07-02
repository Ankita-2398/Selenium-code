package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver", "C:\\Users\\MTPL\\eclipse\\lib files\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://melot.greythr.com/uas/portal/auth/login?login_challenge=a86a584984c7434b93d883d305ff1ca2");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();






    }
    }
