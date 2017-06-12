import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class JewelleryTest {

  Jewellery jewellery;

  @Before
  public void before() {
    jewellery = new Jewellery("Accessories","Jewellery", 75.00, "Pandora", "ghi", "silver");
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

}