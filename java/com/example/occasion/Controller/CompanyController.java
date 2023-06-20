package com.example.occasion.Controller;

import com.example.occasion.DTO.CompanyDTo;
import com.example.occasion.DTO.CustomerDTO;
import com.example.occasion.Model.Company;
import com.example.occasion.Model.MyUser;
import com.example.occasion.Service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/company")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping("/get")
    public ResponseEntity<List<Company>> getAllCompanys(){
        return ResponseEntity.status(200).body(companyService.getAllCompany());
    }


    @PostMapping("/add")
    public ResponseEntity addCompanyDto(@Valid @RequestBody CompanyDTo companyDTo){
        companyService.addCompany(companyDTo);
        return ResponseEntity.status(200).body("Company added");
    }


    @PutMapping("/update/{id}")
    public ResponseEntity updateCompany(@AuthenticationPrincipal MyUser myUser,@Valid @RequestBody CompanyDTo companyDTo){
        companyService.updateCompany(companyDTo,myUser);
        return ResponseEntity.status(200).body("Company Updated");
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCompany(@AuthenticationPrincipal MyUser myUser,@PathVariable Integer id){
        companyService.deleteCompany(id);
        return ResponseEntity.status(200).body("Company deleted");

    }

    @GetMapping("/get-company/{city}")
    public ResponseEntity getCompanybyCity(@PathVariable String city ) {

        return ResponseEntity.status(200).body(companyService.getCompanyByCity(city));
    }

    @GetMapping("/get-time/{timecatgory}")
    public ResponseEntity getcompanyBytimecatgory(@PathVariable String timecatgory  ) {
        return ResponseEntity.status(200).body(companyService.getCompanybytimecatgory(timecatgory));
    }

}

