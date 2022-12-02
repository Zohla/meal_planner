package com.example.meal_planner;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {
  private String name;
  private double amount;
  private String unit;

  public Ingredient(String name) {
    this.name = name;
  }
}