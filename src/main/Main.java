package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.Account;
import tests.Payment;
import tests.Purchase;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium webdriver\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        Account createAccountTest = new Account();
        try {
            createAccountTest.signUpTest(driver);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Purchase purchaseItems = new Purchase();
        try {
            purchaseItems.selectItemsTest(driver);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Payment payItems = new Payment();
        try {
            payItems.payOnItemsTest(driver);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
