package com.example.meal_planner;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.*;

@Data
@AllArgsConstructor
@Service
public class MealPlanService {
  HashMap<Integer, Recipe> recipes;
  List<Integer> idList;

  public MealPlanService() {
    recipes = new HashMap<>();


    for (int i = 1; i <= 95; i++) {
      recipes.put(i, new Recipe("Recipe " + i));
    }
    idList = new ArrayList<>(recipes.keySet());

  }

  // Method to generate list of 7 random recipes
  public HashMap<Integer, Recipe> generateWeeklyMenu() {

    HashMap<Integer, Recipe> thisWeek = new HashMap<>();

    Random random = new Random();
    Set<Integer> randNum = new HashSet<>();

    while (randNum.size() < 7) {

      int randIndex = random.nextInt(idList.size());
      randNum.add(idList.get(randIndex));

      for (int id : randNum) {
        thisWeek.put(id, recipes.get(id));
      }
    }
      return thisWeek;
  }

    public List<Recipe> replaceRecipe (List < Recipe > recipes,int index){
      List<Recipe> newList = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < index; i++) {
        newList.add(recipes.get(i));
      }
      int recipeNumber = random.nextInt(recipes.size());// MÅ SJEKKES FOR DUPLIKAT
      newList.add(recipes.get(recipeNumber));
      for (int i = index + 1; i < recipes.size(); i++) {
        newList.add(recipes.get(i));
      }

      return newList;
    }

  /*  public void createRecipe()
    {
      Ingredient ingredient1ForPizza= new Ingredient("deig",250,"gram");
      Ingredient ingredient2ForPizza= new Ingredient("ost",300 ,"gram");
      Ingredient ingredient3ForPizza= new Ingredient("pepperoni",50 ,"gram");
      Ingredient ingredient4ForPizza= new Ingredient("pizza saus",50 ,"gram");

      String instruction = "Ha deigen på et stekepanne. Fordel sausen på pizzaen. " +
              "Tilsett ost og pepperoni . Ovnen skal settes på 300 grader. Pizzaen skal stå i
              15minutter"
   */
/*
      List<Ingredient> ingredientListForPizza = new ArrayList<>() ;
      ingredientListForPizza.add(ingredient1ForPizza) ;
      ingredientListForPizza.add(ingredient2ForPizza) ;
      ingredientListForPizza.add(ingredient3ForPizza) ;
      ingredientListForPizza.add(ingredient4ForPizza) ;



    //  Recipe recipe1 = new Recipe("Pizza",ingredientListForPizza, instruction) ;
    }*/

    // Method to add new recipe to list
    public void addRecipe (Recipe recipe){
      // TODO: check if exists
      // TODO: get last used id, set current to id + 1
      //    recipes.put(id, recipe);
    }

    // Method to get recipe by id
    public Recipe getRecipeById ( int id){
      return recipes.get(id);
    }

    // Pagination
    public List<Integer> getIdPageSubList ( int page, int pageSize){
      int from = Math.max(0, page * pageSize);
      int to = Math.min(idList.size(), (page + 1) * pageSize);

      return idList.subList(from, to);
    }

    public int numberOfPages ( int pageSize){
      return (int) Math.ceil((double) recipes.size() / pageSize);
    }

  }