package hook;

import lombok.Getter;
import lombok.Setter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest implements DefaultProperties {

    @Getter @Setter
    private static WebDriver driver;

    @Before
    public void Init() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(DefaultProperties.TIME_OUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void TearDown() { driver.quit(); }

}

