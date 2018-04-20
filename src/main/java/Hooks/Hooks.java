package Hooks;

import cucumber.api.java.Before;

public class Hooks {

	@Before (order = 1)
	public void beforeScenario2() {
		System.out.println("Before1");
	}
	
	@Before (order = 3)
	public void beforeScenario3() {
		System.out.println("Before2");
	}
	
	@Before(value="@First", order=1)
	public void bbeforeScenario() {
		System.out.println("Before main 1");
	}
		
	@Before (value="@First", order=2)
	public void beforeScenario_2() {
		System.out.println("Before main 2");
	}
	
	
}
