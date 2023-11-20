package dev.alinigottardi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    @Test
    public void PrimeiroTeste() throws IOException, InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String URL = "http://www.google.com";
        driver.get(URL);
        Thread.sleep(1000);
        Assert.assertEquals("Google", driver.getTitle());

        driver.quit();
    }
}