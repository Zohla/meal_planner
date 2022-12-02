package com.example.meal_planner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class MealPlannerApplicationTests {



	/*@Test
	void contextLoads() {
	}

	}*/

	@Test
	public void isDublicate() {
		int [] array1 = {1,2,3,4,5,6,7} ;
		Assert.assertTrue(MealPlanService.isDublicate(array1,8) );
		Assert.assertTrue(Methods.isPrimeNumber(97));
	}
