package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bassam.amgad\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Registeration(To Avtivate just un-comment)
        /*driver.navigate().to("https://www.phptravels.net/register");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/div[1]/div/label/input")).sendKeys("Bassam");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/div[2]/div/label/input")).sendKeys("Amgad");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/label/input")).sendKeys("+4915207831169");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/label/input")).sendKeys("jedeh22698@sejkt.com");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/label/input")).sendKeys("B@b12345");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/label/input")).sendKeys("B@b12345");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).click();
        driver.quit();*/

        //Login
        driver.navigate().to("https://www.phptravels.net/login");

        driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[1]/label/input")).sendKeys("jedeh22698@sejkt.com");
        driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[2]/label/input")).sendKeys("B@b12345");
        driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();


        String actualUrl="https://www.phptravels.net/register";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.quit();

    }
}
