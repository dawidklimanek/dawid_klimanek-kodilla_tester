package com.kodilla.selenium.onet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnetTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://onet.pl");
        driver.findElement(By.cssSelector("button[aria-label='accept and close']")).click();

        Thread.sleep(2000);



    }

}
