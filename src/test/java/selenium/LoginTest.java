package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LoginTest {
    @Test
    public void login_test() throws InterruptedException {
        //declare the  path
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\FDN-Macia\\Documents\\project belajar\\geckodriver.exe");

        //initialize the selenium webdriver class and create object
         WebDriver driver = new FirefoxDriver();

        //go to website
        driver.get("https://femaledaily.com/");

        //maximize the window, implicitlyWait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //type testing in username and password text box
        driver.findElement(By.id("login_home")).click();
        driver.findElement(By.id("id-email-username")).sendKeys("maciahauna");
        driver.findElement(By.id("id-password")).sendKeys("hanamasa");
        driver.findElement(By.cssSelector("input[data-element-id='button-red'")).click();

        //Thread.sleep(50000);

        //print out the title
        System.out.println(driver.getTitle());

        //validate the title
            String cek = driver.findElement(By.cssSelector("div[class='gbheader-userprofile'")).getText();
            System.out.println("Test Passed");
            System.out.println(cek);

        assertTrue(cek.contains("maciahauna"));


        driver.close();

    }
}
