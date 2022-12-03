package org.page;

import java.util.Set;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 extends BaseClass{

	public Pom2() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Instagram']")
	private WebElement webinsta;
	
	@FindBy(xpath="//div[text()='Follow']")
	private WebElement follow;

	public WebElement getWebinsta() {
		return webinsta;
	}

	public WebElement getFollow() {
		return follow;
	}
	
	public void handle() {
         String win = getwindowhandle();
		Set<String> winsid = getwindowhandles();
		for (String x : winsid) {
		if(!x.equals(win)) {
			switchtowindow(x);
		}
		}
		
	}
	
	

	
}
