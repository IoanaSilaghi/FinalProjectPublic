package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



        public class AutocompleteTests extends BasePage{
            public AutocompleteTests(WebDriver driver){super(driver);}

            By ClickOnTheCheckBoxDemo = By.linkText("Checkbox Demo");

            public void clickOnCheckboxPage(){driver.findElement(ClickOnTheCheckBoxDemo).click();}

            By SingleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div[2]/div[1]/label/input");
            public void clickOnSingleCheckbox(){ driver.findElement(SingleCheckbox).click();}

            By FirstCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input");

            public void clickOnTheFirstCheckboxoption(){driver.findElement(FirstCheckboxOption).click();}

            By SecondCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input ");

            public void clickOnTheSecondCheckboxoption(){driver.findElement(SecondCheckboxOption).click();}

            By ThirdCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input9");

            public void clickOnTheThirdCheckboxoption(){driver.findElement(ThirdCheckboxOption).click();}

            By ForthCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[4]/input");

            public void clickOnTheForthCheckboxoption(){driver.findElement(ForthCheckboxOption).click();}

            By CheckAllOption = By.id("box");

            public void clickOnCheckAllOption(){ driver.findElement(CheckAllOption).click();}
        }

