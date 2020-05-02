import org.openqa.selenium.By;

public class OrderSummary extends BaseTest {

    private By btnIConfirmMyOrder = (By.cssSelector("#columns button[type='submit']"));

    public void confirmOrder () {
        getDriver().findElement(btnIConfirmMyOrder).click();
    }

}
