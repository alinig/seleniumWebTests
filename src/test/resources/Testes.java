import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testes {

    @Test
    public void PrimeiroTeste() {
        WebDriver driver = new FirefoxDriver();
        String URL = "http://www.google.com";
        driver.get(URL);
        Thread.sleep(1000);
        Assert.assertEquals("Google", driver.getTitle());

        driver.quit();
    }
}