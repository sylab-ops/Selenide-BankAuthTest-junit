package codeborne.selenide.test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Activity1 {
	
	private final String HOST = "https://www.swedbank.ee/private?language=ENG";

	@Before
	public void openHost() {
		open(HOST);
		//Accept cookies
	}
	
	
	@Test
	public void BankLoginAuth( ) {
		open(HOST);
		$("#SMART_ID.-active").click();
		$("#login-widget-user-id-sid").setValue("5188550");
		$("#login-widget-identity-number-smart-id").setValue("39502150054");
		$("#rememberMeSmartId").isSelected();
		$(".button -positive").click();	
		$("#submit").click();
		
	}	
	


//
//		@Test
//		public void AcceptCokies() {
//			open(HOST);
//			//Accept cookies
//			$(By.className("button ui-cookie-consent__accept-all-button")).click();
//			
//			
	
//		$(By.className(".button ui-cookie-consent__accept-all-button")).shouldHave(text("Consent to all cookies")).click();
//		$("#submit").click();
	
	
////			//SmartID login
////			$("#SMART_ID.-active").click();
//			
//		

////		
//			
////			sleep(2000); // Wait for user to approve Smart ID PIN
////			$(By.tagName("button -positive")).shouldHave(text("Enter")).click();
////			$("#submit").click();
//			
//			
////			$("#loginErrorMessage").shouldBe(visible);
////			$("#loginErrorMessage").shouldHave(text("Error: Please enter user Id"));
//
//	}
		
		

		 @After
		  public void endUp(){
		        sleep(2000);

		    }
} //	END



