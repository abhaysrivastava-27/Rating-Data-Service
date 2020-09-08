package com.Demo.RatingDataService.Resource;

import com.Demo.RatingDataService.Model.Rating;
import com.Demo.RatingDataService.Model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingService {
    @RequestMapping("/{userID}")
    public Rating getRating(@PathVariable("userID") int userID){
        return new Rating(userID, 3);

    }
    @RequestMapping("/user/{userID}")
    public UserRating getAllRating(@PathVariable("userID") int userID){
        List<Rating> rating = Arrays.asList(
                new Rating(1234, 1),
                new Rating(1235, 5)
        );
        UserRating usr  = new UserRating();
        usr.setListOfRating(rating);
        return usr;

    }
}
