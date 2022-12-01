package com.example.meal_planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.EnumSet;

@Controller
public class PlannerController {

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

}