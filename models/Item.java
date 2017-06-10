package models;

import java.util.*;

public abstract class Item {
  private String category;
  private String type;
  private Double price;
  private String make;
  private String model;

public Item(String category, String type, Double price, String make, String model){
  this.category = category;
  this.type = type;
  this.price = price;
  this.make = make;
  this.model = model;
}

public String getCategory() {
  return this.category;
}

public String getType() {
  return this.type;
}

public Double getPrice() {
  return this.price;
}

public String getMake() {
  return this.make;
}

public String getModel() {
  return this.model;
}

}
