package com.example.meal_planner;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class UserRecipeService {

    public Recipe convertInputToRecipe(Recipe r) {
        List<Ingredient> ingredientList = new ArrayList<>();
        String[] ingredientsArray = (r.getIngredientsAsString().split("\r\n"));
        for (String s : ingredientsArray) {
            Ingredient ingredient = new Ingredient(s);
            ingredientList.add(ingredient);
        }
        Recipe recipe = new Recipe(r.getName(), ingredientList, r.getInstructions());

        System.out.println("Recipe ready to be added "+ recipe);
        return recipe;
    }
}
