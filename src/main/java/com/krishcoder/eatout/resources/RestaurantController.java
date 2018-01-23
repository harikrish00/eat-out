package com.krishcoder.eatout.resources;

import com.krishcoder.eatout.model.Restaurant;
import com.krishcoder.eatout.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/restaurants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class RestaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;

    @GET
    public List<Restaurant> getRestaurants(){
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    @POST
    public Restaurant createRestaurant(@Valid Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

}
