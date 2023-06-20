package com.example.occasion.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Content should be not null")
    @Column(columnDefinition = "varchar(100)")
    private String content;


    @NotNull(message = "Rating should be not null")
//    @Positive
//    @Min(value=1)
//    @Max(value = 5)
    private Integer rating;


    @OneToOne
    @MapsId
    @JsonIgnore
    private Myorder myOrder;


//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "rating")
//    private Set<Company> companySet;

}
