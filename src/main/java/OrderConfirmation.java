import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class OrderConfirmation extends BaseTest {

    private By lblYourOrderOnMyStoreIsComplete = (By.cssSelector("p.alert.alert-success"));

    public boolean validateOrder (String valOrder) {
        String txtOrder = getDriver().findElement(lblYourOrderOnMyStoreIsComplete).getText();
        assertEquals(valOrder, txtOrder);
        return true;
    }

}
