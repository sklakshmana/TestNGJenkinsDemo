package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	
	@Test
	public void testCase1()
	{
		System.out.println("This is testCase1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("This is testCase2");
	}
	

}
