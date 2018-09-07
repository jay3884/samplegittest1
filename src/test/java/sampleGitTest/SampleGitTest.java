package sampleGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleGitTest {
	@Test
	public void logintest() throws IOException
	{

	WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("http://www.bing.com/");
	 File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
     // Byte src1=((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
      FileUtils.copyFile(src, new File("C:\\Selenimworkplace\\WebDriverTest\\screenshot\\flipkart.jpeg"));
	

	}

}
