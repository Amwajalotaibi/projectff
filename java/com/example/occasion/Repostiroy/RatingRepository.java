package com.example.occasion.Repostiroy;

import com.example.occasion.Model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,Integer> {
    Rating findRatingById(Integer id);

//    List<Rating>findRatingBy
}
