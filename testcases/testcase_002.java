package testcases;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class testcase_002 extends ProjectSpecificMethod{
    
	@Test
	public void runLogout() {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton();
	}
}