package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.allegro.pl/");

        WebElement cookies = driver.findElement(By.xpath("//button[1]"));//znlezienie elementu
        cookies.click();//klikniecie
        Thread.sleep(2000);//czekanie

        WebElement comboBox= driver.findElement(By.xpath("(/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/div[3]/div/select)"));
        Select categorySelect=new Select(comboBox);
        categorySelect.selectByIndex(3);


        WebElement searchProduct= driver.findElement(By.xpath("(/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/input)"));
        searchProduct.click();//klikniecie
        Thread.sleep(2000);//czekanie
        searchProduct.sendKeys("mavic mini");

        WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/button"));//znlezienie elementu
        submit.click();//klikniecie
        Thread.sleep(2000);//czekanie



    }
}
