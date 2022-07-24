package org.test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class BankAuth {
	private final String HOST = "https://www.swedbank.ee/private?language=ENG";
	
	@Before
	public void openHost() {
		open(HOST);	
	}
	
	@Test
	public void cookiesPageHandler(){
		//Cookies handler
		$("button.ui-cookie-consent__accept-all-button").click();
	}
	@Test
	public void canAuthLogin() {
				//SmartID login
				$("#SMART_ID.-active").click();
				//Enter your "Bank User ID" in the setValue bracket
				$("#login-widget-user-id-sid").setValue("");
				sleep(1000);
				//Enter your personal ID code in the setValue bracket
				$("#login-widget-identity-number-smart-id").setValue("");
				$(By.name("rememberMe")).shouldBe(checked);
				sleep(1000);
				$("button.-positive").click(); //Remember to authenticate your login via Smart_ID App
				sleep(5000);
	}
	
	 @After
	  public void endUp(){
	        sleep(2000);

	    }

}
