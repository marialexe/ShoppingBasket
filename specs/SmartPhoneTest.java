import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class SmartPhoneTest {

  SmartPhone smartPhone;

  @Before
  public void before() {
    smartPhone = new SmartPhone("Technology","SmartPhone", 300.00, "Samsung", "S6", true);
  }

  @Test
  public void canGetPrice() {
    assertEquals(300.00, smartPhone.getPrice(),0.1);
  }

  @Test
  public void doesSmartPhoneExist(){
    assertThat(smartPhone, instanceOf(SmartPhone.class));
  }

  @Test 
  public void canGetTouchScreen() {
    assertEquals(true, smartPhone.hasTouchScreen());
  }
}