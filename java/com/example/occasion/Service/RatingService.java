package com.example.occasion.Service;

import com.example.occasion.ApiException.ApiException;
import com.example.occasion.DTO.CustomerDTO;
import com.example.occasion.DTO.RatingDTO;
import com.example.occasion.Model.*;
import com.example.occasion.Repostiroy.CompanyRepository;
import com.example.occasion.Repostiroy.CustomerRepository;
import com.example.occasion.Repostiroy.MyorderRepository;
import com.example.occasion.Repostiroy.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RatingService {
    private final RatingRepository ratingRepository;
    private final CompanyRepository companyRepository;
    private final MyorderRepository myorderRepository;

    public List<Rating> getAll() {
        return ratingRepository.findAll();
    }

    public void addRating (Integer companyId,Integer myorderId,RatingDTO ratingDto){
        Company company=companyRepository.findCompanyById(companyId);
        Myorder myorder=myorderRepository.findMyOrderById(myorderId);
        Myorder myorder1=myorderRepository.findMyOrderById(ratingDto.getMyOrder_id());
        if (company.getMyServiceSet()==null|| myorder.getStutas().equalsIgnoreCase("inProgress")){
            throw new ApiException("Sorry YOu do NOT have a Order Or Yor order InProgress You Can't make a rate");}
        myorder.setRat(ratingDto.getRating());
        myorderRepository.save(myorder);
    }

//
//    public void updateRating(RatingDTO dto,Integer id) {
//        Myorder myorder = myorderRepository.findMyOrderById(id);
//        if (myorder == null) {
//            throw new ApiException("Rating not found");
//        }
//
//        Rating rating = ratingRepository.getReferenceById(dto.getMyOrder_id());
//        rating.setContent(dto.getContent());
//        rating.setRating(dto.getRating());
//    }

    public void deleteRating(Integer id) {
        Rating rating = ratingRepository.findRatingById(id);
        if (rating == null) {
            throw new ApiException("Delete Rating");
        }
        ratingRepository.delete(rating);
    }

    }

