package rdjaramillo.com.store.product.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import rdjaramillo.com.store.product.repository.ProductRepository;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class ProductTest {

    Product product;

    @BeforeEach
    void setUp() {
        System.out.println("Run @Before");
        product = new Product();

    }
    @Test
    public void testGetterSetterId() {
        System.out.println("Run @Test testGetterSetter"); // for illustration
        Long idExample = Long.valueOf(1);
        product.setId(idExample);
        assertEquals(1, idExample, product.getId());
    }
    @Test
    public void testGetterSetterName() {
        System.out.println("Run @Test testGetterSetter"); // for illustration
        String nameExample = "Lapto";
        assertEquals("Lapto", nameExample, product.getName());
    }
    @Test
    public void testGetterSetterDescription() {
        System.out.println("Run @Test testGetterSetter"); // for illustration
        String descriptionExample = "Amd Ryzen";
        product.setDescription(descriptionExample);
        assertEquals("Amd Ryzen", descriptionExample, product.getDescription());
    }
    @Test
    public void testGetterSetterStock() {
        System.out.println("Run @Test testGetterSetter"); // for illustration
        Double stockExample = 2.00;
        product.setStock(stockExample);
        assertEquals(2.00, stockExample, product.getStock());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Run @After"); // for illustration
    }
}