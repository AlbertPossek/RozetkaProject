package RozetkaPackage;

//import com.rozetka.RozetkaTest;
import com.rozetka.MainPage;
import com.rozetka.ChromeSettings;
import org.junit.Test;



public class RozetkaTest extends ChromeSettings{
	
//	@Test ()
//	public void login() throws InterruptedException{
//		MainPage mainpage = new MainPage(driver);
//		mainpage.clickSignInButton();
//		mainpage.login(userEmail, userPassword);	
//		mainpage.closeSosialPopUpLocator();
//		mainpage.assertUserName();
//				
//	}
	
	@Test
	public void searchMacbook() throws InterruptedException{
		MainPage mainpage = new MainPage(driver);
		mainpage.clickSignInButton();
		mainpage.login(userEmail, userPassword);	
		mainpage.closeSosialPopUpLocator();
		mainpage.assertUserName();
		mainpage.searchMacbook();
		ResultPage resultPage = mainpage.clickSearchButton();
		resultPage.mouseOver();
		resultPage.addToBasketFirstResult();	
 		resultPage.assertItemName();
	}

}
