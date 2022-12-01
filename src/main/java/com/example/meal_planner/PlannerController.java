package com.example.meal_planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    model.addAttribute("recipes", mealPlanService.getRecipes());
    model.addAttribute("ids", recipeIds);
    model.addAttribute("currentPage", page);
    model.addAttribute("numberOfPages", numberOfPages);

    return "recipes_view";
  }

  @GetMapping("/recipe")
  public String detailView(@RequestParam("id") int id, Model model) {

    Recipe recipe = mealPlanService.getRecipeById(id);
    model.addAttribute("recipe", recipe);
    return "recipes_view";
  }
}