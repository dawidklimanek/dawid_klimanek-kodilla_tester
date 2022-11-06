package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.facebook.com/");


//        WebElement cookies = driver.findElement(By.xpath("//button[2]"));//znlezienie elementu
//        cookies.click();//klikniecie
//        Thread.sleep(2000);//czekanie
//        WebElement createAccount =driver.findElement(By.xpath("//div[5]"));
//        createAccount.click();
//        Thread.sleep(4100);


        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect=new Select(yearCombo);
        yearSelect.selectByIndex(5);

    }
}
