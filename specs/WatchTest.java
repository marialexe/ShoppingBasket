import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class WatchTest {

  Watch watch;

  @Before
  public void before() {
    watch = new Watch("Accessories","Watch", 120.00, "Fossil", "def", "analog", "metal");
  }

  @Test
  public void watchExists() {
    assertThat(watch, instanceOf(Watch.class));
  }

  @Test
  public void canGetCategory() {
    assertEquals("Accessories", watch.getCategory());
  }

  @Test
  public void canGetWatchType() {
    assertEquals("analog", watch.getWatchType());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("metal", watch.getMaterial());
  }

}