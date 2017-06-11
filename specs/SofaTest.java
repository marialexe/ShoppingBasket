import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class SofaTest {

  Sofa sofa;

  @Before 
  public void before() {
    sofa = new Sofa("Furniture","Sofa", 200.00, "IKEA", "XYZ", 3, "fabric");
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
}