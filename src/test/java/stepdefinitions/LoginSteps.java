package stepdefinitions;

import factory.DriverFactory;
import factory.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	@Given("I am on shopping site")
	public void i_am_on_shopping_site()  {
		DriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");

	}

	@When("I enter username")
	public void i_enter_username() {
		PageFactory.getLoginPage().enterUsername("RohanSingh@gspann.com");
	}

	@And("I enter password")
	public void enterPassword() {
		PageFactory.getLoginPage().enterPassword("12345678");
	}

	@And("I click on Sign in")
	public void clickOnSignInBtn() {
		PageFactory.getLoginPage().clickOnSignInBtn();
	}

	@Then("I should be on accounts page")
	public void verifyAccountsPage() {
		System.out.println("Accounts Page");
	}
}
