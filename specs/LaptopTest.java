import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import java.util.*;

import models.*;
  
public class LaptopTest {
  Laptop laptop;

  @Before
  public void before(){
    laptop = new Laptop("Technology","Laptop", 800.00, "Macbook", "Pro", 17);
  }

  @Test
  public void doesItemExist() {
    assertThat(laptop, instanceOf(Laptop.class));
  }

  @Test
  public void canGetCategory() {
    assertEquals("Technology", laptop.getCategory());
  }

  @Test
  public void canGetType() {
    assertEquals("Laptop", laptop.getType());
  }

  @Test
  public void canGetPrice() {
    assertEquals(800.00, laptop.getPrice(),0.1);
  }

  @Test
  public void canGetModel() {
    assertEquals("Macbook", laptop.getMake());
  }

  @Test
  public void canGetMake() {
    assertEquals("Pro", laptop.getModel());
  }

  @Test
  public void canGetScreenSize() {
    assertEquals(17, laptop.getScreenSize());
  }
}