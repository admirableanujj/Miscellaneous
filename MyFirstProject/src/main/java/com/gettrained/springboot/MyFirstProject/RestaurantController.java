package com.gettrained.springboot.MyFirstProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

	@GetMapping("/restaurant")
	public List<Restaurant> getAllRestaurant(){
		return Arrays.asList(new Restaurant(1, "Skyline", "5-Star"));
	}
}
