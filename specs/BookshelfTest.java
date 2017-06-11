import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import org.junit.*;

import models.*;

public class BookshelfTest {

  Bookshelf bookshelf;

  @Before
  public void before() {
    bookshelf = new Bookshelf("Furniture","Bookshelf", 125.00, "IKEA", "ABC", 1.80, 1.50);
  }

  @Test
  public void bookshelfExists() {
    assertThat(bookshelf, instanceOf(Bookshelf.class));
  }

  @Test
  public void canGetPrice() {
    assertEquals(125.00, bookshelf.getPrice(),0.1);
  }

  @Test
  public void canGetHeight() {
    assertEquals(1.80, bookshelf.getHeight(),0.1);
  }

  @Test
  public void canGetWidth() {
    assertEquals(1.50, bookshelf.getWidth(),0.1);
  }




}