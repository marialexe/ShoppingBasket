package models;
import java.util.*;
import interfaces.*;

public class Laptop extends Item implements Discountable {

  private int screenSize;
  private Discount discount;

  public Laptop(String category, String type, Double price, String make, String model, int screenSize) {
    super(category,type,price,make,model);
    this.screenSize = screenSize;
  }

  public int getScreenSize() {
    return this.screenSize;
  }

  public Discount setDiscount(Discount newDiscount) {
    return this.discount = newDiscount;
  }

  public String getDiscountLabel() {
    return discount.getLabel();
  }

  public String getDiscountType() {
    return discount.getType();
  }

  public int getDiscountValue() {
    return discount.getValue();
  }

}