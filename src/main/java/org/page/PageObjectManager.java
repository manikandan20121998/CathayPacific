package org.page;

public class PageObjectManager {
	private Pom p;
	private Pom2 p2;
	public Pom getInstanacepom() {

		 return p=new Pom();
	}
	public Pom2 getInstancePom2() {

		 return p2=new Pom2();
	}

}
