package com.example.meal_planner;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recipe {
  private final int id;
  private String name;
}