package models;

import java.util.*;

public class FridgeFreezer extends Item {

  private int fridgeShelves;
  private int freezerShelves;

  public FridgeFreezer(String category, String type, Double price, String make, String model, int fridgeShelves, int freezerShelves) {
    super(category, type, price, make, model);
    this.fridgeShelves = fridgeShelves;
    this.freezerShelves = freezerShelves;
  }

  public int getFridgeShelves() {
    return this.fridgeShelves;
  }

  public int getFreezerShelves() {
    return this.freezerShelves;
  }
}