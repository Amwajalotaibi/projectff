package com.example.occasion.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MyService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


//    @NotEmpty(message = "name should be not null")
//    @Column(columnDefinition = "varchar(10)")
    private String name;

//     @NotEmpty(message = "category should not null")
//     @Pattern(regexp = "(?:bigparty|mediumparty|smallparty)",message = "Category Not Valid")
//     @Column(columnDefinition = "varchar(20) (category='bigparty' or category='mediumparty' or category='smallparty' )")
    private String category;




    @OneToMany(cascade = CascadeType.ALL,mappedBy = "myService")
    private Set<Myorder> myorderSet;


    @ManyToMany (mappedBy = "myServiceSet")
    @JsonIgnore
    private Set<Company> companySet;


    @OneToOne(cascade =CascadeType.ALL,mappedBy = "myService")
    @PrimaryKeyJoinColumn
    private Servicetype servicetype;
}
