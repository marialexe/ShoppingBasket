package models;

import java.util.*;

public class Jewellery extends Item {

  private String metal;

  public Jewellery(String category, String type, Double price, String make, String model, String metal) {
    super(category, type, price, make, model);
    this.metal = metal;
  }

  public String getMetal() {
    return this.metal;
  }

}