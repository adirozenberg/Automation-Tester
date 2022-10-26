package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account {

        public void signUpTest(WebDriver driver) throws InterruptedException {
            //Create an Account button
            driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
            //filling details
            driver.findElement(By.id("firstname")).sendKeys("Adi");
            driver.findElement(By.id("lastname")).sendKeys("Rozenberg");
            driver.findElement(By.id("email_address")).sendKeys("adirozenberg6@gmail.com");
            driver.findElement(By.id("password")).sendKeys("TestUser@135");
            driver.findElement(By.id("password-confirmation")).sendKeys("TestUser@135");

            Thread.sleep(4000);

            //Create an Account button
            driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button")).click();
            //return to main page
            driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a/img")).click();

            Thread.sleep(4000);
        }
}
