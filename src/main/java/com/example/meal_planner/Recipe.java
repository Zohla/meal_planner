package com.example.meal_planner;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Recipe {
  private String name;
  private List<Ingredient> ingredients;
  private String instructions;

  public Recipe(String name) {
    this.name = name;
  }

  public List<Ingredient> getIngredients() {
    return ingredients ;
  }

  public String getInstructions() {
    return instructions ;
  }
}