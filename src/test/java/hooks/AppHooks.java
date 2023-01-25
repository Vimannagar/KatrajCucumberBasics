package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {
	
	
	@Before(order = 2)
	public void beforeHook()
	{
		System.out.println("Before hook");
	}
	
	@BeforeStep(order = 1)
	public void beforeStep()
	{
		System.out.println("before step");
	}
	
	@AfterStep(order = 1)
	public void afterStep()
	{
		System.out.println("After step");
	}
	
	@BeforeStep(order = 2)
	public void beforeStep1()
	{
		System.out.println("before step1");
	}
	
	@AfterStep(order = 2)
	public void afterStep1()
	{
		System.out.println("After step1");
	}
	
	
	@Before(order = 1)
	public void beforeHook1()
	{
		System.out.println("Before hook1");
	}
	
	@After(order = 1)
	public void afterHook()
	{
		System.out.println("After hook");
	}
	
	@After(order = 2)
	public void afterHook1()
	{
		System.out.println("After hook1");
	}

}
