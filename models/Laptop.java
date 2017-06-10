package models;

import java.util.*;

public class Laptop extends Item {

  private int screenSize;

  public Laptop(String category, String type, Double price, String make, String model) {
    super(category,type,price,make,model);
    this.screenSize = screenSize;
  }

  public int getScreenSize() {
    return this.screenSize;
  }

}