package models;

import java.util.*;

public class Discount {

  private String label;
  private String discountType;
  private int discountValue;

  public Discount(String label, String discountType, int discountValue) {
    this.label = label;
    this.discountType = discountType;
    this.discountValue = discountValue;
  }

  public String getLabel() {
    return this.label;
  }

  public String getType() {
    return this.discountType;
  }

  public int getValue() {
    return this.discountValue;
  }

}