package models;

import java.util.*;

public class Watch extends Item {

  private String watchType;
  private String material;

  public Watch(String category, String type, Double price, String make, String model, String watchType, String material) {
    super(category, type, price, make, model);
    this.watchType = watchType;
    this.material = material;
  }

  public String getWatchType() {
    return this.watchType;
  }

  public String getMaterial() {
    return this.material;
  }
}