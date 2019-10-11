package com.quantum.pages;


import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;


public class MyFirstAppPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}

	@FindBy(locator = "page.edit")
	private QAFWebElement myEditText;

	@FindBy(locator = "page.button")
	private QAFWebElement myButton;

	@FindBy(locator = "page.title")
	private QAFWebElement myTitle;


	public void setMyAppText(String myString) {

		myEditText.sendKeys(myString);
	}

	public void clickMyAppButton() {

		myButton.click();
	}

	public String getMyAppTitle() {

		return myTitle.getText();
	}
}
