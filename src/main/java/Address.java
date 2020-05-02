import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Address extends BaseTest {

    private By txtDeliveryAddress = (By.cssSelector("#address_delivery > li.address_address1.address_address2"));
    private By btnProceedToCheckOut = (By.cssSelector("button[name='processAddress']"));

    public boolean validateAddress (String valAddress) {
        String txtAddress = getDriver().findElement(txtDeliveryAddress).getText();
        assertEquals(valAddress, txtAddress);
        return true;
    }

    public void confirmAddress () {
        getDriver().findElement(btnProceedToCheckOut).click();
    }

}
