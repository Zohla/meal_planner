package com.example.meal_planner;

import java.util.ArrayList;
import java.util.List;

public class UserRecipe {

    public void convertInputToRecipe(Recipe r) {
        List<Ingredient> ingredientList = new ArrayList<>();
        String[] ingredientsArray = (r.getIngredientsAsString().split("\r\n"));
        for (String s : ingredientsArray) {
            Ingredient ingredient = new Ingredient(s);
            ingredientList.add(ingredient);
        }
        Recipe recipe = new Recipe(r.getName(), ingredientList, r.getInstructions());
        System.out.println("Recipe ready to be added "+ recipe);
    }
}
