package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFly {

    @Test
    public void test_Fly() {
        WebDriver driver;
        String baseURL = "https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html";
        System.setProperty("webdriver.chrome.driver","/Users/phuckhang.nguyen/Documents/testing/dockerlearning/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseURL);
        String actualTitle = driver.findElement(By.xpath("//*[@class='form-header']")).getText();
        Assert.assertEquals(actualTitle, "Docker Flight Booking Application");
        driver.quit();
    }
}
