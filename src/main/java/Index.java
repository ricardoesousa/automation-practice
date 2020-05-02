import org.openqa.selenium.By;

public class Index extends BaseTest {

    private By lblProduct;

    public void accessApplication () {
        getDriver().get(URL_BASE);
    }

    public void selectProduct (String productChoosed)
    {
        lblProduct = (By.cssSelector("ul[id='homefeatured'] a[class='product-name'][title='" + productChoosed + "']"));
        getDriver().findElement(lblProduct).click();
    }

}
