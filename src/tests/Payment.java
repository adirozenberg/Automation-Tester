package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {

    public void payOnItemsTest(WebDriver driver) throws InterruptedException {
        //click on chart
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();

        Thread.sleep(2000);

        //Proceed to checkout button
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[3]/div/button")).click();

        Thread.sleep(4000);

        //filling details
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[3]/div/input")).sendKeys("SecuriThings");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input")).sendKeys("Tel Aviv");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")).sendKeys("Tel Aviv");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")).sendKeys("12345-6789");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select")).sendKeys("United States");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")).sendKeys("0521234567");

        Thread.sleep(4000);

        //filling details
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")).sendKeys("New York");
        //click on Next button
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();

        Thread.sleep(3000);

        //click on Place Order button
        driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();

        Thread.sleep(6000);

        System.out.println("All tests were performed correctly!");
    }
}
