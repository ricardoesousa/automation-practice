import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CompraTest {

    WebDriver driver;

    @Before
    public void Init() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void TearDown() {
        driver.quit();
    }

    @Test
    public void Comprar() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@data-id-product='2']")).click();
        driver.findElement(By.id("layer_cart")).findElement(By.linkText("Proceed to checkout")).click();

        String produto = driver.findElement(By.cssSelector("#order-detail-content .product-name a")).getText();
        assertEquals("Blouse",produto);

        driver.findElement(By.linkText("Proceed to checkout")).click();
        driver.findElement(By.name("email_create")).sendKeys("ricardo.sousa@teste.com.br");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Ricardo");
        driver.findElement(By.id("customer_lastname")).sendKeys("Sousa");
        driver.findElement(By.id("passwd")).sendKeys("12345");
        driver.findElement(By.id("address1")).sendKeys("Rua Teste, 123");
        driver.findElement(By.id("city")).sendKeys("Teste");
        driver.findElement(By.id("id_state")).sendKeys("New York");
        driver.findElement(By.id("postcode")).sendKeys("00000");
        driver.findElement(By.id("id_country")).sendKeys("United States");
        driver.findElement(By.id("phone_mobile")).sendKeys("+(1)(425) 555-0100");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Lar Doce Lar");
        driver.findElement(By.id("submitAccount")).click();

        String endereco = driver.findElement(By.cssSelector("#address_delivery > li.address_address1.address_address2")).getText();
        assertEquals("Rua Teste, 123", endereco);

        driver.findElement(By.name("processAddress")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.name("processCarrier")).click();

        String valorTotal = driver.findElement(By.cssSelector("#total_price")).getText();
        assertEquals("$29.00", valorTotal);

        driver.findElement(By.className("cheque")).click();
        driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();

        String compraFinalizada = driver.findElement(By.cssSelector("p.alert.alert-success")).getText();
        assertEquals("Your order on My Store is complete.", compraFinalizada);

    }
}
