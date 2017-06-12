import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class FridgeFreezerTest {

  FridgeFreezer fridgeFreezer;

  @Before
  public void before() {
    fridgeFreezer = new FridgeFreezer("HomeElectrics","FridgeFreezer", 280.00, "Indesit", "abc", 3, 4);
  }

  @Test
  public void fridgeFreezerExists() {
    assertThat(fridgeFreezer, instanceOf(FridgeFreezer.class));
  }

  @Test
  public void canGetModel() {
    assertEquals("abc", fridgeFreezer.getModel());
  }

  @Test
  public void canGetFridgeShelves() {
    assertEquals(3, fridgeFreezer.getFridgeShelves());
  }

  @Test
  public void canFreezerShelves() {
    assertEquals(4, fridgeFreezer.getFreezerShelves());
  }

}