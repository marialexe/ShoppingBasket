package models;

import java.util.*;

public class SmartPhone extends Item {

  private Boolean touchscreen;

  public SmartPhone(String category, String type, Double price, String make, String model, Boolean touchscreen) {
    super(category,type,price,make,model);
    this.touchscreen = touchscreen;
  }

  public Boolean hasTouchScreen() {
    return this.touchscreen;
  }
}