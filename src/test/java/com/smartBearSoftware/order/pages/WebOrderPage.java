package com.smartBearSoftware.order.pages;

import com.smartBearSoftware.order.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebOrderPage {

    public WebOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@id='ctl00_menu']/li[3]")
    public WebElement orderButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;



    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;


    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;


    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(xpath = "//table[@class='RadioList']//td")
    public List<WebElement> cardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNum;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement process;

    @FindBy(xpath = "//ul/li[1]")
    public WebElement viewAll;


    @FindBy(xpath = "//table[@class='SampleTable']//td[2]")
     public List<WebElement> customerList;


   // @FindBy(xpath = "//tbody/tr[2]/td[2]")
    //public WebElement customer;



}
