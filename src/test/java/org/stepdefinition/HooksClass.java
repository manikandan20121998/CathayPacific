package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.utility.FileReader_Manager_File;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{

	@Before
	public void BeforeClass() throws IOException {

		 chromebrowser();
	     String url = FileReader_Manager_File.getInstance().geturl();
	     urllaunch(url);
	     maximize();
	     implicitywait(10);
	}
	
	@After
	public void AfterClass() {
		quit();
		
	}
	
	
	
	
	
	
	
	
}
