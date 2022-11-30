package com.example.meal_planner;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Recipe {
  private final int id;
  private String name;
  private List<String> ingredients;
  private String instructions;

  public Recipe(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public List<Ingredient> getIngredients() {
    return List.of(
            new Ingredient("flour", 350, "g"),
            new Ingredient("eggs", 3, "pc"),
            new Ingredient("milk", 2, "dl"),
            new Ingredient("butter", 100, "g"),
            new Ingredient("sugar", 1,"dl")
                  );
  }

  public String getInstructions() {
    return """
           Add all ingredients to bowl
           
           Mix well
           
           Add to 30 cm round baking tray
           
           Bake in oven at 200 deg C for 40 min.
           """;
  }
}