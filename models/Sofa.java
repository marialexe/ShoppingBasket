package models;
import java.util.*;
import interfaces.*;

public class Sofa extends Item implements Discountable {

  private int numberSeats;
  private String material;
  private Discount discount;

  public Sofa(String category, String type, Double price, String make, String model, int numberSeats, String material) {
    super(category,type,price,make,model);
    this.numberSeats = numberSeats;
    this.material = material;
  }

  public int getNumberSeats() {
    return this.numberSeats;
  }

  public String getMaterial() {
    return this.material;
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