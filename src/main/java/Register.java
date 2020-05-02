import org.openqa.selenium.By;

public class Register extends BaseTest {

    private By btnGenderMr = (By.cssSelector("#id_gender1"));
    private By txtFirstName = (By.cssSelector("#customer_firstname"));
    private By txtLastName = (By.cssSelector("#customer_lastname"));
    private By txtPassword = (By.cssSelector("#passwd"));
    private By txtAddress = (By.cssSelector("#address1"));
    private By txtCity = (By.cssSelector("#city"));
    private By txtState = (By.cssSelector("#id_state"));
    private By txtPostCode = (By.cssSelector("#postcode"));
    private By txtCountry = (By.cssSelector("#id_country"));
    private By txtPhoneMobile = (By.cssSelector("#phone_mobile"));
    private By txtAlias = (By.cssSelector("#alias"));
    private By btnRegister = (By.cssSelector("#submitAccount"));

    public void fillPersonalInformation (String firstName, String lastName, String password) {
        getDriver().findElement(btnGenderMr).click();
        getDriver().findElement(txtFirstName).sendKeys(firstName);
        getDriver().findElement(txtLastName).sendKeys(lastName);
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public void fillAddress (String address, String city, String state, String postCode, String country, String phoneMobile, String alias) {
        getDriver().findElement((txtAddress)).sendKeys(address);
        getDriver().findElement((txtCity)).sendKeys(city);
        getDriver().findElement((txtState)).sendKeys(state);
        getDriver().findElement((txtPostCode)).sendKeys(postCode);
        getDriver().findElement((txtCountry)).sendKeys(country);
        getDriver().findElement((txtPhoneMobile)).sendKeys(phoneMobile);
        getDriver().findElement((txtAlias)).clear();
        getDriver().findElement((txtAlias)).sendKeys(alias);
    }

    public void confirmRegistration () {
        getDriver().findElement((btnRegister)).click();
    }

}
