package models;

import java.util.*;

public class Bookshelf extends Item {

  private Double height;
  private Double width;

  public Bookshelf(String category, String type, Double price, String make, String model, Double height, Double width) {
    super(category, type, price, make, model);
    this.height = height;
    this.width = width;
  }

  public Double getHeight() {
    return this.height;
  }

  public Double getWidth() {
    return this.width;
  }
}