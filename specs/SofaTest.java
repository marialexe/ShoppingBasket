import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class SofaTest {

  Sofa sofa;
  Discount discount;

  @Before 
  public void before() {
    sofa = new Sofa("Furniture","Sofa", 200.00, "IKEA", "XYZ", 3, "fabric");
    discount = new Discount("£30 off the advertised price", "amount", 30);
  }

  @Test
  public void canGetType() {
    assertEquals("Sofa", sofa.getType());
  }

  @Test
  public void canGetNumberSeats() {
    assertEquals(3, sofa.getNumberSeats());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("fabric", sofa.getMaterial());
  }

  @Test
  public void canGetDiscountLabel() {
    sofa.setDiscount(discount);
    assertEquals("£30 off the advertised price", sofa.getDiscountLabel());
  }

  @Test
  public void canGetDiscountType() {
    sofa.setDiscount(discount);
    assertEquals("amount", sofa.getDiscountType());
  }

  @Test
  public void canGetDiscountValue() {
    sofa.setDiscount(discount);
    assertEquals(30, sofa.getDiscountValue());
  }
}