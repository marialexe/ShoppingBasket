package models;

import java.util.*;

public class Sofa extends Item{

  private int numberSeats;
  private String material;

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
}