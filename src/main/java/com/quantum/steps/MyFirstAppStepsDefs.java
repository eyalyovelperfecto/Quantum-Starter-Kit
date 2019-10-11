/**
 * 
 */
package com.quantum.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.pages.MyFirstAppPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author chirag.jayswal
 *
 */
@QAFTestStepProvider
public class MyFirstAppStepsDefs {


	MyFirstAppPage myFirstAppPage = new MyFirstAppPage();

	@When("^I type to my first App \"(.*?)\"$")
	public void iTypeToMyFirstApp(String myText) {
		myFirstAppPage.setMyAppText(myText);
	}


	@When("^I click on the set title in my first App$")
	public void iClickOnTheSetTitleInMyFirstApp() {
		myFirstAppPage.clickMyAppButton();
	}

	@Then("^the title of my first App is \"([^\"]*)\"$")
	public void theTitleOfMyFirstAppIs(String expectedTitle) {
		String actualTitleText = myFirstAppPage.getMyAppTitle();
		System.out.println("title is " + actualTitleText);
        assertThat(actualTitleText, equalTo(expectedTitle));
	}
}
