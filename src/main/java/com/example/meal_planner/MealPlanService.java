package com.example.meal_planner;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@Service
public class MealPlanService {
  HashMap<Integer, Recipe> recipes;
  List<Integer> idList ;

  public MealPlanService() {
    recipes = new HashMap<>();


    for (int i = 1; i <= 7; i++) {
      recipes.put(i, new Recipe("Recipe " + i));
    }
    idList = new ArrayList<>(recipes.keySet() );

  }

  // Method to generate list of 7 random recipes
  public HashMap<Integer, Recipe> generateWeeklyMenu() {
    // TODO: Logic to generate random list of 7 unique elements
//    return recipes.subList(0, 7);
    HashMap<Integer, Recipe> thisWeek = new HashMap<>();


      Random random = new Random();
      int[]numbers = new int[7] ;
      for (int i=0;i<numbers.length;i++) {
        int randIndex = random.nextInt(idList.size());
        if(isDublicate(numbers,randIndex) )
          i-- ;
        else
          numbers[i] = idList.get(randIndex) ;
      }
      for (int i=0;i<numbers.length;i++)
      {
        thisWeek.put(numbers[i], recipes.get(numbers[i])) ;
      }

      return thisWeek ;
      //return recipes.subList(0, 7);
    }
    public boolean isDublicate(int[]numbers, int newNumber)
    {
      for(int i=0;i<numbers.length;i++) {
        if (newNumber == numbers[i])
          return true;
      }
      return false ;
    }

    public List<Recipe> replaceRecipe(List<Recipe> recipes, int index){
      List<Recipe> newList = new ArrayList<>() ;
      Random random = new Random() ;
      for (int i=0;i<index;i++)
      {
        newList.add(recipes.get(i) ) ;
      }
      int recipeNumber = random.nextInt(recipes.size());// MÅ SJEKKES FOR DUPLIKAT
      newList.add(recipes.get(recipeNumber)) ;
      for (int i=index+1;i<recipes.size();i++)
      {
        newList.add(recipes.get(i) ) ;
      }

      return newList ;
    }

    public void createRecipe()
    {
      Ingredient ingredient1ForPizza= new Ingredient("deig",250,"gram");
      Ingredient ingredient2ForPizza= new Ingredient("ost",300 ,"gram");
      Ingredient ingredient3ForPizza= new Ingredient("pepperoni",50 ,"gram");
      Ingredient ingredient4ForPizza= new Ingredient("pizza saus",50 ,"gram");

      String instruction = "Ha deigen på et stekepanne. Fordel sausen på pizzaen. " +
              "Tilsett ost og pepperoni . Ovnen skal settes på 300 grader. Pizzaen skal stå i 15minutter"

      List<Ingredient> ingredientListForPizza = new ArrayList<>() ;
      ingredientListForPizza.add(ingredient1ForPizza) ;
      ingredientListForPizza.add(ingredient2ForPizza) ;
      ingredientListForPizza.add(ingredient3ForPizza) ;
      ingredientListForPizza.add(ingredient4ForPizza) ;



      Recipe recipe1 = new Recipe("Pizza",ingredientListForPizza, instruction) ;
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