package models;

import java.util.*;

public class WashingMachine extends Item {

  private int programs;
  private int maxSpin;

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
}