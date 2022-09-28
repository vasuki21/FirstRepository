package objectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAmazon {
	public LoginPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	private WebElement emailtextfield;
	
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	@FindBy(id = "continue")
	private WebElement continuebutton;

	@FindBy(id = "ap_password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "signInSubmit")
	private WebElement signinbutton;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbar;

	public WebElement getSearchbar() {
		return searchbar;
	}
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement submitbutton;
	
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	@FindBy(xpath= "//span[text()='Apple iPhone 12 (64GB) - Purple']")
	private WebElement productclick;

	public WebElement getProductclick() {
		return productclick;
	}
	
	@FindBy(id="add-to-cart-button")
	private WebElement addtocartbtn;

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}
	
	@FindBy(id="nav-cart-count")
	private WebElement checkcart;

	public WebElement getCheckcart() {
		return checkcart;
	}
	
	@FindBy(id="wishListMainButton")
	private WebElement addtowishlistbtn;
	
	public WebElement getAddtowishlistbtn() {
		return addtowishlistbtn;
	}

	@FindBy(xpath = "//a[text() = 'View Your List']")
	private WebElement viewwishlist;

	public WebElement getViewwishlist() {
		return viewwishlist;
	}
	
	@FindBy(id="nav-orders")
	private WebElement returnsOrderslink;

	public WebElement getReturnsOrderslink() {
		return returnsOrderslink;
	}
	
	@FindBy(id="searchDropdownBox")
	private WebElement searchAllDropdown;

	
	public WebElement getSearchAllDropdown() {
		return searchAllDropdown;
	}

	@FindBy(id="nav-hamburger-menu")
	private WebElement allLink;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getAllLink() {
		return allLink;
	}

	public WebElement getSignout() {
		return signout;
	}
}
