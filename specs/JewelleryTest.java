import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class JewelleryTest {

  Jewellery jewellery;
  Discount discount;

  @Before
  public void before() {
    jewellery = new Jewellery("Accessories","Jewellery", 75.00, "Pandora", "ghi", "silver");
    discount = new Discount("Buy one get one free","percentage", 50);
  }

  @Test
  public void jewelleryExists() {
    assertThat(jewellery, instanceOf(Jewellery.class));
  }

  @Test
  public void canGetType() {
    assertEquals("Jewellery", jewellery.getType());
  }

  @Test
  public void canGetMetal() {
    assertEquals("silver", jewellery.getMetal());
  }

  @Test
  public void canGetDiscountLabel() {
    jewellery.setDiscount(discount);
    assertEquals("Buy one get one free", jewellery.getDiscountLabel());
  }

  @Test
  public void canGetDiscountType() {
    jewellery.setDiscount(discount);
    assertEquals("percentage", jewellery.getDiscountType());
  }

  @Test
  public void canGetDiscountValue() {
    jewellery.setDiscount(discount);
    assertEquals(50, jewellery.getDiscountValue());
  }

}