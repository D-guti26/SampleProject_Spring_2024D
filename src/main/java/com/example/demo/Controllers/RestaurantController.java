package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Restaurant;
import com.example.demo.Repositories.RestaurantRepository;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    
    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping("/{borough}")
    public List<Restaurant> getRestaurantByBorough(
            @PathVariable(value = "borough") String boroughName) {
            
        var result = restaurantRepository.findRestaurantByBorough(boroughName);
        return result;
    }

}
