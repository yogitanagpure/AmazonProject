package setups;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook{
    @Before
    public void before() throws Exception {
        System.setProperty("device", "android");
        DriverSetup.startAppium();
        DriverSetup.setDriver();
    }

    @After
    public void after(){
        DriverSetup.getAppiumDriver().quit();
        DriverSetup.stopAppium();
    }
}
