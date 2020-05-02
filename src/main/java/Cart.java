import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class Cart extends BaseTest{

    private By lblProduct = (By.cssSelector("#order-detail-content .product-name a"));
    private By btnProceedToCheckOut = (By.cssSelector(".columns-container a[title='Proceed to checkout']"));

    public boolean validateProduct (String valProduct) {
        String txtProduct = getDriver().findElement(lblProduct).getText();
        assertEquals(valProduct, txtProduct);
        return true;
    }

    public void confirmShoppingCart () {
        getDriver().findElement(btnProceedToCheckOut).click();
    }

}
