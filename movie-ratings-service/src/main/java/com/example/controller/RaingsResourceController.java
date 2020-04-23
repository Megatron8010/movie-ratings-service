package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Rating;
import com.example.entity.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RaingsResourceController {
	@RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }
	@RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
        		new Rating("1234", 3),
                new Rating("5678", 4)
        		);
        		
		UserRating userRating = new UserRating();
        userRating.setRatings(ratings);
        return userRating;

    }
}
