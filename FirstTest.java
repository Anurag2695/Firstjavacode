package com.example.seleniumweb;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser using ChromeDriver directly
        ChromeDriver driver = new ChromeDriver(); 
        
        driver.get("https://www.amazon.com/"); //Launch the application
        driver.manage().window().maximize();   // Maximize the browser
    }
}