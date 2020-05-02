import org.openqa.selenium.By;

public class Product extends BaseTest{

    private By btnAddToCart = (By.cssSelector("#add_to_cart"));
    private By btnProceedToCheckOut = (By.cssSelector("#layer_cart a"));

    public void confirmProduct () {
        getDriver().findElement(btnAddToCart).click();
        getDriver().findElement(btnProceedToCheckOut).click();
    }

}
