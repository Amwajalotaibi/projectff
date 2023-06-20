package com.example.occasion.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Myorder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



//    @NotEmpty(message = "day should be not null")
//    @Column(columnDefinition = "varchar(100)")
    private Integer day;


//    @NotEmpty(message = "data should  be not null")
//    @Column(columnDefinition = "varchar(100)")
    private String date;



//    @NotEmpty(message = "time should be not null")
//    @Column(columnDefinition = "varchar(100)")
    private String time;


//    @NotNull(message = "totalPrice should be not null")
    private Integer totalPrice;



//    @NotEmpty(message = "stutas should be not null ")
//    @Column(columnDefinition = "varchar(100) check(stutas='new' or stutas='inProgress')")
    private String stutas;


//    @NotEmpty(message = "category should be not null ")
//    @Column(columnDefinition = "varchar(100) check(category='daily' or category='weekly' or category='monthly')")
    private String category;

//    private Integer rating1;


//    @NotNull(message = " should be not null")
    private Integer numbarofrepeat;
    private Integer rat;

//    private LocalDateTime createAt;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "company_id")
    @JsonIgnore
    private Company company;


    @ManyToOne
    @JoinColumn(name = "myService_id",referencedColumnName = "id")
    @JsonIgnore
    private MyService myService;



    @OneToOne(cascade =CascadeType.ALL,mappedBy = "myOrder")
    @PrimaryKeyJoinColumn
    private Rating rating;



//    public void setRating(Integer rating) {
//    }
}
