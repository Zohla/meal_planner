package com.example.meal_planner.web;

import com.example.meal_planner.DaysOfTheWeek;
import com.example.meal_planner.MealPlanService;
import com.example.meal_planner.Recipe;
import com.example.meal_planner.UserRecipeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

@Controller
public class PlannerController {
  private final int pageSize = 10; // Number of elements per currentPage
  public final MealPlanService mealPlanService;
  UserRecipeService userRecipeService = new UserRecipeService();


  @Autowired
  public PlannerController(MealPlanService mealPlanService) {
    this.mealPlanService = mealPlanService;
  }


  @GetMapping("/")
  public String mealPlan(@RequestParam(defaultValue = "-1", value = "id") int id, Model model,
                         HttpSession session) {

    HashMap<Integer, Recipe> mealPlan = (HashMap<Integer, Recipe>) session.getAttribute("mealPlan");

    model.addAttribute("mealPlan", mealPlan);
    model.addAttribute("days", EnumSet.allOf(DaysOfTheWeek.class));

    Recipe recipe = id != -1 ? mealPlanService.getRecipeById(id) : null;
    model.addAttribute("recipe", recipe);

    return "meal_plan_view";
  }

  @GetMapping("/newMealPlan")
  public String generateMenu(Model model, HttpSession session) {

    session.setAttribute("mealPlan", mealPlanService.generateWeeklyMenu());

    return "redirect:/";
  }

  // Recipes pagination
  @GetMapping("/recipes")
  public String displayPage(@RequestParam(defaultValue = "0", value = "page") int page,
                            @RequestParam(defaultValue = "-1", value = "id") int id, Model model) {

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
    model.addAttribute("recipe", new Recipe());
    model.addAttribute("success", "");
    return "add-recipe";
  }
  @PostMapping("/add")
  public String addNewRecipe(@ModelAttribute Recipe r, Model model){
    model.addAttribute(new Recipe());
    Recipe formattedRecipe = userRecipeService.convertInputToRecipe(r);
    mealPlanService.addRecipe(formattedRecipe);
    model.addAttribute("success", "Recipe is added!");
    return "add-recipe";
  }

}