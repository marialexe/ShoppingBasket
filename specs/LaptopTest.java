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
    laptop = new Laptop("Technology","Laptop", 800.00, "Macbook", "Pro");
  }

  @Test
  public void doesItemExist() {
    assertThat(laptop, instanceOf(Laptop.class));
  }
  
}