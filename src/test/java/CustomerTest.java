import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void SetUp(){
        customer = new Customer("Gellila", 900);
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Gellila");
    }

    @Test
    public void canGetWallet() {
        assertThat(customer.getWallet()).isEqualTo(900);
    }

}
