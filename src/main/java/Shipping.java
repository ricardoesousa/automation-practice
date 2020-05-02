import org.openqa.selenium.By;

public class Shipping extends BaseTest{

    private By btnTermsOfService = (By.cssSelector("#cgv"));
    private By btnProceedToCheckOut = (By.cssSelector("button[name='processCarrier']"));

    public void confirmShipping () {
        getDriver().findElement(btnTermsOfService).click();
        getDriver().findElement(btnProceedToCheckOut).click();
    }

}
