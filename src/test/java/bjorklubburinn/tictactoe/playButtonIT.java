package bjorklubburinn.tictactoe;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class playButtonIT 
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
  public void testPlayButton() throws Exception 
  {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("input[type='submit']")).click();
  }

  @After
  public void tearDown() throws Exception 
  {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if(!"".equals(verificationErrorString)) 
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
