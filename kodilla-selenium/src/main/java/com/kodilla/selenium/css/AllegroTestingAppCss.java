package com.kodilla.selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingAppCss {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.allegro.pl/");

        WebElement cookies =
                driver.findElement(By.cssSelector("button[type='button'][autofocus]"));//znlezienie elementu
                cookies.click();//klikniecie

                 Thread.sleep(2000);//czekanie

       WebElement comboBox= driver.findElement(By.cssSelector("select[data-role]"));
        Select categorySelect=new Select(comboBox);
       categorySelect.selectByIndex(3);


        WebElement searchProduct= driver.findElement(By.cssSelector("input[role='combobox']"));
        searchProduct.click();//klikniecie
        Thread.sleep(2000);//czekanie
        searchProduct.sendKeys("mavic mini");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));//znlezienie elementu
        submit.click();//klikniecie
        Thread.sleep(2000);//czekanie



    }
}
