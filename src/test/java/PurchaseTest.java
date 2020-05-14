import hook.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class PurchaseTest extends BaseTest {

    @Test
    public void test() {

        Index index = PageFactory.initElements(getDriver(), Index.class);
        Product product = PageFactory.initElements(getDriver(), Product.class);
        Cart cart = PageFactory.initElements(getDriver(), Cart.class);
        Login login = PageFactory.initElements(getDriver(), Login.class);
        Register register = PageFactory.initElements(getDriver(), Register.class);
        Address address = PageFactory.initElements(getDriver(), Address.class);
        Shipping shipping = PageFactory.initElements(getDriver(), Shipping.class);
        Payment payment = PageFactory.initElements(getDriver(), Payment.class);
        OrderSummary orderSummary = PageFactory.initElements(getDriver(), OrderSummary.class);
        OrderConfirmation orderConfirmation = PageFactory.initElements(getDriver(), OrderConfirmation.class);

        index.accessApplication();
        index.selectProduct("Printed Dress");
        product.confirmProduct();
        assertTrue(cart.validateProduct("Printed Dress"));
        cart.confirmShoppingCart();
        login.createNewAccount("testestetesy7tyte45h6778tg79g6t7e@teste.com.br");
        register.fillPersonalInformation("Ricardo", "Sousa", "12345");
        register.fillAddress("Rua Teste, 123","Teste","New York","11111","United States","+(1)(425) 555-0100","Lar");
        register.confirmRegistration();
        assertTrue(address.validateAddress("Rua Teste, 123"));
        address.confirmAddress();
        shipping.confirmShipping();
        assertTrue(payment.validateTotalPrice("$28.00"));
        payment.selectPaymentMethod();
        orderSummary.confirmOrder();
        assertTrue(orderConfirmation.validateOrder("Your order on My Store is complete."));
    }

}
