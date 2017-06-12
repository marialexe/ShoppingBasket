package models;
import java.util.*;
import interfaces.*;

public class WashingMachine extends Item implements Discountable {

  private int programs;
  private int maxSpin;
  private Discount discount;

  public WashingMachine(String category, String type, Double price, String make, String model, int programs, int maxSpin) {
    super(category, type, price, make, model);
    this.programs = programs;
    this.maxSpin = maxSpin;
  }

  public int getPrograms() {
    return this.programs;
  }

  public int getMaxSpin() {
    return this.maxSpin;
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