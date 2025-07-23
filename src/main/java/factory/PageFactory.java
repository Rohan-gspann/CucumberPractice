package factory;
import pages.LoginPage;

public class PageFactory {
	
	static ThreadLocal<LoginPage> LoginPageTL = new ThreadLocal<LoginPage>();
	
	
	public static LoginPage getLoginPage() {
		if(LoginPageTL.get()==null) {
			LoginPageTL.set(new LoginPage());
		}
		return LoginPageTL.get();
	}
	

}
