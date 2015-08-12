package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlValidation {

	public static void main(String[] args) {
		WebDriver dr = new HtmlUnitDriver();
		
		String testCaseId = "TC-01.01";
		String url = "https://recurly.com/company";
		String expectedTitle = "   Company | About Us | Recurly ";
		
		dr.get(url);
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String actualTitle = dr.getTitle();
		
		System.out.println("File name:\t\t\"HtmlValidation.java\"");
		System.out.println("Test CaseID: \t\t" + testCaseId);
		System.out.println("URL: \t\t\t" + url);
		System.out.println("Expected Title: \t" + expectedTitle);
		System.out.println("Actual Title: \t\t" + actualTitle);
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Result: \t" + "PASSED");
		}else {
			System.out.println("Test Case Result: \t" + "FAILED");
		}
			
		dr.quit();

	}

}
