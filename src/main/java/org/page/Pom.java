package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass {
	public Pom() {
PageFactory.initElements(driver, this);

	}

	
	
	
	@FindBy(xpath="//span[text()='MAA']")
	private WebElement from;
	
	@FindBy(xpath="//input[@placeholder='Leaving from']")
	private WebElement fromtype;
	
	@FindBy(xpath="//input[@placeholder='Going to']")
	private WebElement totype;
	
	@FindBy(xpath="//div[@class='background-circle']")
	private WebElement search;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getFromtype() {
		return fromtype;
	}

	public WebElement getTotype() {
		return totype;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
