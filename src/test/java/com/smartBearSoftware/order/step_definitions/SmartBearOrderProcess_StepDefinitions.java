package com.smartBearSoftware.order.step_definitions;

import com.smartBearSoftware.order.pages.LoginPage;
import com.smartBearSoftware.order.pages.WebOrderPage;
import com.smartBearSoftware.order.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SmartBearOrderProcess_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    WebOrderPage webOrderPage = new WebOrderPage();

    @When("tester login using {string} and {string} and click login button")
    public void tester_login_using_and_and_click_login_button(String userName, String passWord) {
        loginPage.userNameInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(passWord);
        loginPage.submitButton.click();
    }

    @Then("tester should {string} page")
    public void tester_should_page(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("tester click order button")
    public void tester_click_order_button() {
        webOrderPage.orderButton.click();
    }

    @When("tester select {string} from product dropDown")
    public void tester_select_from_product_drop_down(String productName) {
        Select select = new Select(webOrderPage.product);
        select.selectByVisibleText(productName);
    }

    @When("tester enters {string} to quantity")
    public void tester_enters_to_quantity(String quantity) {
        webOrderPage.quantity.sendKeys(quantity);
    }

    @When("tester enters {string} to costumer name")
    public void tester_enters_to_costumer_name(String customerName) {
        webOrderPage.customerName.sendKeys(customerName);
    }

    @When("tester enters {string} to street")
    public void tester_enters_to_street(String street) {
        webOrderPage.street.sendKeys(street);
    }

    @When("tester enters {string} to city")
    public void tester_enters_to_city(String city) {
        webOrderPage.city.sendKeys(city);
    }

    @When("tester enters {string} to state")
    public void tester_enters_to_state(String state) {
        webOrderPage.state.sendKeys(state);
    }

    @When("tester enters {string} to zip")
    public void tester_enters_to_zip(String zip) {
        webOrderPage.zip.sendKeys(zip);

    }

    @When("tester select {string} as card type")
    public void tester_select_as_card_type(String cardType) {
        for (WebElement eachCard : webOrderPage.cardType) {
            if (eachCard.getText().contains(cardType))
                eachCard.click();
        }
    }

    @When("tester enters {string} to card number")
    public void tester_enters_to_card_number(String cardNum) {
        webOrderPage.cardNum.sendKeys(cardNum);
    }

    @When("tester enters {string} to expiration date")
    public void tester_enters_to_expiration_date(String expDate) {
        webOrderPage.expDate.sendKeys(expDate);
    }

    @When("tester click process button")
    public void tester_click_process_button() {
        webOrderPage.process.click();
    }

    @Then("tester verify {string} is in the list")
    public void tester_verify_is_in_the_list(String expectedCostumer) {
        webOrderPage.viewAll.click();
        List<String> actualCostumerList = new ArrayList<>();
        for (WebElement eachCostumer : webOrderPage.customerList)
            actualCostumerList.add(eachCostumer.getText());

        Assert.assertTrue(actualCostumerList.contains(expectedCostumer));
    }
}
