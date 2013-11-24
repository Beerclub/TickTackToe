package bjorklubburinn.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class frontpageIT
{	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
  	public void setUp() throws Exception 
  	{
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost:4567/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	}

  	@Test
	public void frontpageIT() throws Exception
	{
		driver.get("localhost:4567");
		assertEquals("TickTackToe", driver.getTitle());
		try 
		{
      		assertEquals("Welcome to this Java Spark test site", driver.findElement(By.cssSelector("h1")).getText());
    	} 
    	catch (Error e) 
    	{
      		verificationErrors.append(e.toString());
    	}
    	try 
    	{
      		assertTrue(isElementPresent(By.cssSelector("img")));
    	} 
    	catch (Error e) 
    	{
      		verificationErrors.append(e.toString());
    	}
    	try 
    	{
      		assertTrue(isElementPresent(By.cssSelector("input")));
    	} 
    	catch (Error e) 
    	{
      	verificationErrors.append(e.toString());
    	}
	}

	@After
 	public void tearDown() throws Exception 
 	{
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) 
	    {
	    	fail(verificationErrorString);
    	}
    }

    private boolean isElementPresent(By by) 
    {
	    try 
	    {
	    	driver.findElement(by);
	    	return true;
	    } 
	    catch (NoSuchElementException e)
	    {
	    	return false;
	    }
	}
}