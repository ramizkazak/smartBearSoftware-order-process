package com.smartBearSoftware.order.step_definitions;

import com.smartBearSoftware.order.utilities.BrowserUtils;
import com.smartBearSoftware.order.utilities.ConfigurationReader;
import com.smartBearSoftware.order.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUpScenario() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDownScenario() {
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }
}
