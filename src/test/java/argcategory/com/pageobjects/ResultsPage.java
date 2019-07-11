package argcategory.com.pageobjects;

import argcategory.com.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPage extends DriverFactory {


    public void categorytest() {
        getallcategoryfilters("Sofas");
        getallsofafilters("2 seater");    //sofa type
        getallsofafilters("Fabric");      //sofa materialtype
        getallsofafilters("Greys");       //sofa colourgroup
        getallsofafilters("£250 - £500"); // sofa price

    }

    public void getallcategoryfilters(String selectedcategory) {//Argos/home/category
        List<WebElement> category = driver.findElements(By.cssSelector(".ac-facet__filters--category .ac-facet__label--category "));
        System.out.println(category.size());
        for (WebElement categorys : category) {
            if (categorys.getText().equalsIgnoreCase(selectedcategory)) {
                categorys.click();
                break;


            }

        }
    }

    public void getallsofafilters(String selectedsofafilter) { //Argos/home/category/sofas/filterby
        List<WebElement> sofafilter = driver.findElements(By.cssSelector(".ac-drawer__content .ac-facet__label"));
        System.out.println(sofafilter.size());
        for (WebElement sofafilters : sofafilter) {
            if (sofafilters.getText().equalsIgnoreCase(selectedsofafilter)) {
                sofafilters.click();
                break;


            }
        }
    }
    public String getHeader() {

        return driver.findElement(By.cssSelector(".search-title")).getText();
}

}
