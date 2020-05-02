import org.junit.Test;

import static org.junit.Assert.*;

public class PurchaseTest extends BaseTest{

    private Index index = new Index();
    private Product product = new Product();
    private Cart cart = new Cart();
    private Login login = new Login();
    private Register register = new Register();
    private Address address = new Address();
    private Shipping shipping = new Shipping();
    private Payment payment = new Payment();
    private OrderSummary orderSummary = new OrderSummary();
    private OrderConfirmation orderConfirmation = new OrderConfirmation();

    @Test
    public void test() {
        index.accessApplication();
        index.selectProduct("Printed Dress");
        product.confirmProduct();
        assertTrue(cart.validateProduct("Printed Dress"));
        cart.confirmShoppingCart();
        login.createNewAccount("testestetestestesteste@teste.com.br");
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
