package com.example.meal_planner;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Service
public class MealPlanService {
  List<Recipe> recipes;

  public MealPlanService() {
    recipes = new ArrayList<>();

    for (int i = 1; i <= 95; i++) {
      recipes.add(new Recipe(i, "Recipe " + i));
    }
  }

  // Method to generate list of 7 random recipes
  public List<Recipe> generateWeeklyMenu() {
    // TODO: Logic to generate random list of 7 unique elements
    return recipes.subList(0, 7);
  }

  // Method to add new recipe to list
  public void addRecipe(Recipe recipe) {
    // TODO: check if exists
    recipes.add(recipe);
  }

  // Method to get recipe by id
  public Recipe getRecipeById(int id) {
    return recipes.stream()
                  .filter(r -> r.getId() == id)
            .findFirst()
            .orElse(null);
  }

}