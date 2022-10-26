package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Purchase {

    public void selectItemsTest(WebDriver driver) throws InterruptedException {
        //What's New button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[1]/a")).click();
        //jackets button
        driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[2]/div/div/ul[1]/li[2]/a")).click();

        //click on a specific item
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[7]/div/div/strong/a")).click();
        //choose size
        By locator = By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[1]/div/div[2]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.findElement(locator).click();
        //choose color
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/div/div[2]")).click();
        //Add to Chart button
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button")).click();

        Thread. sleep(4000);

        //click on a specific item
        By locator3 = By.xpath("/html/body/div[2]/main/div[2]/div/div[5]/div[2]/div/ol/li[2]/div/div/strong/a");
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait3.until(ExpectedConditions.presenceOfElementLocated(locator3));
        driver.findElement(locator3).click();
        //choose size
        By locator2 = By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[1]/div/div[1]");
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.presenceOfElementLocated(locator2));
        driver.findElement(locator2).click();
        //choose color
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/div/div[2]")).click();
        //Add to Chart button
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button")).click();

        Thread. sleep(4000);
    }
}
