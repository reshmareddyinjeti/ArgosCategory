package argcategory.com.utils;

import argcategory.com.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.maxBrowser();
        driverFactory.impWait();

    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }


}
