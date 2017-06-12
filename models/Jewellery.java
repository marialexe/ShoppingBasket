package models;
import java.util.*;
import interfaces.*;

public class Jewellery extends Item implements Discountable {

  private String metal;
  private Discount discount;

  public Jewellery(String category, String type, Double price, String make, String model, String metal) {
    super(category, type, price, make, model);
    this.metal = metal;
  }

  public String getMetal() {
    return this.metal;
  }

  public String getLabel() {
    return discount.getLabel();
  }

  public String getDiscountType() {
    return discount.getType();
  }

  public int getDiscountValue() {
    return discount.getValue();
  }

}