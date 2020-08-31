package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
    WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException {
//        baseURL = "http://demo.guru99.com/test/guru99home/";
        baseURL = "https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html";
        nodeURL = "http://192.168.1.245:5566/wd/hub";
//        nodeURL = "http://192.168.1.245:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.MAC);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void sampleTest() {
        driver.get(baseURL);
        System.out.println("Hello world");
//        String actualTitle = driver.findElement(By.xpath("//*[@class='form-header']")).getText();
//        Assert.assertEquals(actualTitle, "Docker Flight Booking Application");
    }
}
