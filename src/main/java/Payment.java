import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Payment extends BaseTest {

    private By txtTotalPrice = (By.cssSelector("#total_price"));
    private By btnPayByCheck = (By.cssSelector(".cheque"));

    public boolean validateTotalPrice (String valPrice) {
        String txtPrice = getDriver().findElement(txtTotalPrice).getText();
        assertEquals(valPrice, txtPrice);
        return true;
    }
    public void selectPaymentMethod() {
        getDriver().findElement(btnPayByCheck).click();
    }

}
