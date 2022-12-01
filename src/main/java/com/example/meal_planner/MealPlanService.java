package com.example.meal_planner;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Data
@AllArgsConstructor
@Service
public class MealPlanService {
  HashMap<Integer, Recipe> recipes;

  public MealPlanService() {
    recipes = new HashMap<>();

    for (int i = 1; i <= 7; i++) {
      recipes.put(i, new Recipe("Recipe " + i));
    }
  }

  // Method to generate list of 7 random recipes
  public HashMap<Integer, Recipe> generateWeeklyMenu() {
    // TODO: Logic to generate random list of 7 unique elements
//    return recipes.subList(0, 7);
    return recipes;
  }

  // Method to add new recipe to list
  public void addRecipe(Recipe recipe) {
    // TODO: check if exists
    // TODO: get last used id, set current to id + 1
//    recipes.put(id, recipe);
  }

  // Method to get recipe by id
  public Recipe getRecipeById(int id) {
    return recipes.get(id);
  }

}