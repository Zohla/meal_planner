package com.example.meal_planner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealPlannerServiceTest {
    @Test
    public void isDublicate() {
        MealPlanService mealPlanService = new MealPlanService();
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        assertTrue(mealPlanService.isDublicate(array1, 3));
        assertTrue(mealPlanService.isDublicate(array1, 7));

        assertFalse(mealPlanService.isDublicate(array1,9) );


    }
    @Test
    public void numberOfpages()
    {
        MealPlanService mealPlanService = new MealPlanService();

        assertEquals(3,mealPlanService.numberOfPages(5) ) ;
        assertEquals(2,mealPlanService.numberOfPages(9) ) ;

    }
    @Test
    public void getRecipeById()
    {
        MealPlanService mealPlanService = new MealPlanService() ;
        assertEquals("Pizza med reinsdyrbiff",mealPlanService.getRecipeById(1).getName() );
        assertEquals("Grillspyd med laksefilet",mealPlanService.getRecipeById(8).getName() );
        assertEquals("Svinekam",mealPlanService.getRecipeById(13).getName() );

    }
}
