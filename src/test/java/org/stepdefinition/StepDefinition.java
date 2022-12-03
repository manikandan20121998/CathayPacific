package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.page.PageObjectManager;
import org.utility.FileReader_Manager_File;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	public static PageObjectManager pom;
	public static Robot r;
	@Given("user has to in verified website")
	public void user_has_to_in_verified_website() throws IOException {
    
     
	}

	@When("user give the from place of take")
	public void user_give_the_from_place_of_take() throws AWTException, InterruptedException {
      pom=new PageObjectManager();
      jeclick(pom.getInstanacepom().getFrom());
       r=new Robot();
      Thread.sleep(2000);
      r.keyPress(KeyEvent.VK_BACK_SPACE);
      sendkeysenter(pom.getInstanacepom().getFromtype(), "DELHI", Keys.ENTER);
    r.keyPress(KeyEvent.VK_ENTER);	  
	}

	

	@When("user give the to place for their destination")
	public void user_give_the_to_place_for_their_destination() {
	 sendkeys(pom.getInstanacepom().getTotype(), "saudi");
	r.keyPress(KeyEvent.VK_ENTER);
	}

	@When("user has to give date of travel")
	public void user_has_to_give_date_of_travel() {

	}

	@When("user has to give date of return")
	public void user_has_to_give_date_of_return() {

	}

	@When("user has to click search button for check available fight lists")
	public void user_has_to_click_search_button_for_check_available_fight_lists() {
		jeclick(pom.getInstanacepom().getSearch());
	}

	@Then("user see the fight list")
	public void user_see_the_fight_list() throws InterruptedException, IOException {
      screenshot("cathay pacific Access Denied");
      
	}

	@When("user have to go till down on website")
	public void user_have_to_go_till_down_on_website() throws InterruptedException {
     Thread.sleep(3000);
		scrolldown(pom.getInstancePom2().getWebinsta());
	}

	@When("User have to click instagram logo")
	public void user_have_to_click_instagram_logo() throws InterruptedException {
		 Thread.sleep(3000);
		click(pom.getInstancePom2().getWebinsta());
	}

	@When("user will see the instagram offi then click follow req")
	public void user_will_see_the_instagram_offi_then_click_follow_req() throws InterruptedException {
		 Thread.sleep(3000);
		pom.getInstancePom2().handle();
     click(pom.getInstancePom2().getFollow());
	}

	@Then("Take a snap for evidence")
	public void take_a_snap_for_evidence() throws IOException, InterruptedException {
		 Thread.sleep(3000);
		screenshot("Instagram");
	}
}
