package com.krishcoder.eatout.repository;

import com.krishcoder.eatout.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long>{
}
