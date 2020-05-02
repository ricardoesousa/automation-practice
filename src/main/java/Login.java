import org.openqa.selenium.By;

public class Login extends BaseTest{

    private By txtEmailAddress = (By.cssSelector("#email_create"));
    private By btnCreateAnAccount = (By.cssSelector("#SubmitCreate"));

    public void createNewAccount (String email) {
        getDriver().findElement(txtEmailAddress).sendKeys(email);
        getDriver().findElement(btnCreateAnAccount).click();
    }
}
