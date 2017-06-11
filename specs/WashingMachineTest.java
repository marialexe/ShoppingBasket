import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class WashingMachineTest {

  WashingMachine washingMachine;

  @Before
  public void before() {
    washingMachine = new WashingMachine("HomeElectrics","WashingMachine", 325.00, "Indesit", "xyz", 14, 1600);
  }

  @Test
  public void washingMachineExists() {
    assertThat(washingMachine, instanceOf(WashingMachine.class));
  }

  @Test
  public void canGetMake() {
    assertEquals("Indesit", washingMachine.getMake());
  }

  @Test
  public void canGetPrograms() {
    assertEquals(14, washingMachine.getPrograms());
  }

  @Test
  public void canGetMaxSpin() {
    assertEquals(1600, washingMachine.getMaxSpin());
  }

}