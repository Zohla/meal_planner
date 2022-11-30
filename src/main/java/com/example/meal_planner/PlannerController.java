package com.example.meal_planner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlannerController {
  MealPlanService mealPlanService = new MealPlanService();

  @GetMapping("/")
  public String mealPlan(Model model) {
    model.addAttribute("mealPlan", mealPlanService.generateWeeklyMenu());
    return "meal_plan_view";
  }
}