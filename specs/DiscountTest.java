import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class DiscountTest {

  Discount discount;

  @Before
  public void before() {
    discount = new Discount("Buy one get one free","percentage", 50);
  }

  @Test
  public void discountExists() {
    assertThat(discount, instanceOf(Discount.class));
  }

  @Test
  public void canGetLabel() {
    assertEquals("Buy one get one free", discount.getLabel());
  }

  @Test
  public void canGetType() {
    assertEquals("percentage", discount.getType());
  }

  @Test
  public void canGetValue() {
    assertEquals(50, discount.getValue());
  }

}