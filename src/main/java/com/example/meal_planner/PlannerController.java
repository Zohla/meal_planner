package com.example.meal_planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.EnumSet;
import java.util.List;

@Controller
public class PlannerController {
  private final int pageSize = 10; // Number of elements per currentPage
  public final MealPlanService mealPlanService;

  @Autowired
  public PlannerController(MealPlanService mealPlanService) {
    this.mealPlanService = mealPlanService;
  }


  @GetMapping("/")
  public String mealPlan(@RequestParam(defaultValue = "-1", value = "id") int id, Model model) {

    model.addAttribute("mealPlan", mealPlanService.generateWeeklyMenu());
    model.addAttribute("days", EnumSet.allOf(DaysOfTheWeek.class));

    Recipe recipe = id != -1 ? mealPlanService.getRecipeById(id) : null;
    model.addAttribute("recipe", recipe);

    return "meal_plan_view";
  }

  // Recipes pagination


  @GetMapping("/recipes")
  public String displayPage(@RequestParam(defaultValue = "0", value = "page") int page,
                            @RequestParam(defaultValue = "0", value = "id") int id, Model model) {

    List<Integer> recipeIds = mealPlanService.getIdPageSubList(page, pageSize);
    int numberOfPages = mealPlanService.numberOfPages(pageSize);
    Recipe recipe = id != -1 ? mealPlanService.getRecipeById(id) : null;

    model.addAttribute("recipe", recipe);
    model.addAttribute("recipes", mealPlanService.getRecipes());
    model.addAttribute("ids", recipeIds);
    model.addAttribute("currentPage", page);
    model.addAttribute("numberOfPages", numberOfPages);

    return "recipes_view";
  }
  @GetMapping("/add")
  public String showForm(Model model){
    UserRecipe r = new UserRecipe();
    model.addAttribute("recipe", r);
    model.addAttribute("success", "");
    return "add-recipe";
  }
  @PostMapping("/add")
  public String addNewRecipe(@ModelAttribute UserRecipe r, Model model){
   /* System.out.println(r.getIngredients());*/
    System.out.println(r.getName());
    System.out.println(r.getInstructions());
    model.addAttribute("success", "Recipe is added!");
   /* Recipe recipe = new Recipe(r.getName(),)*/
    return "add-recipe";
  }

}