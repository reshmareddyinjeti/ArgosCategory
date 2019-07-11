package argcategory.com.pageobjects;

import argcategory.com.drivers.DriverFactory;
import org.openqa.selenium.By;

public class HomePage extends DriverFactory {


    public void doSearch(String item) {
        driver.findElement(By.id("searchTerm")).sendKeys(item);
        driver.findElement(By.cssSelector("._2mKaC")).click();
    }

    public String getcurrenturl() {
        return driver.getCurrentUrl();


    }

    public String getProductHeader() {
        return driver.findElement(By.cssSelector(".search-title__term")).getText();
    }
}







