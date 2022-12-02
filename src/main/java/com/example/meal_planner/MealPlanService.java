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

    RecipeDatabase database = new RecipeDatabase() ;
    recipes = database.getAllRecipes() ;


  }

  // Method to generate list of 7 random recipes
  public HashMap<Integer, Recipe> generateWeeklyMenu() {
    idList = new ArrayList<>(recipes.keySet());

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

    /*public List<Recipe> replaceRecipe (List < Recipe > recipes,int index){
      List<Recipe> newList = new ArrayList<>();
      Random random = new Random();

      for (int i = 0; i < index; i++) {
        newList.add(recipes.get(i));

      int[]numbers = new int[7] ;
      for (int i=0;i<numbers.length;i++) {
        int randIndex = random.nextInt(idList.size());
        System.out.println(randIndex);
        if(isDublicate(numbers,randIndex))  {
          i--;
          System.out.println(i + "etter");
        }
          else
          numbers[i] = idList.get(randIndex) ;
      }
      for(int i=0;i< numbers.length;i++)
      {
        System.out.println("Array: " + numbers[i]);
      }
      for (int i=0;i<numbers.length;i++)
      {
        thisWeek.put(numbers[i], recipes.get(numbers[i])) ;
      }


      return thisWeek ;
      //return recipes.subList(0, 7);
    }*/
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
      newList.add(recipes.get(recipeNumber));
      for (int i = index + 1; i < recipes.size(); i++) {
        newList.add(recipes.get(i));
      }

      return newList;
    }


    // Method to add new recipe to list
    public void addRecipe(Recipe recipe){
      // TODO: check if exists
     // System.out.println(recipes.size());
      int key = recipes.size();
      recipes.put((key+1),recipe);
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