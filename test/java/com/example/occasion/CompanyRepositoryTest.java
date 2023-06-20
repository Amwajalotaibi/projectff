//package com.example.occasion;
//
//import com.example.occasion.Model.Company;
//import com.example.occasion.Repostiroy.CompanyRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//
//@ExtendWith(SpringExtension.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class CompanyRepositoryTest {
//
//    @Autowired
//    CompanyRepository companyRepository;
//
//    Company company1, company2, company3;
//
//    List<Company> companyList;
//
//    @BeforeEach
//    void setUp() {
//        company1 = new Company(null, "WAAD", "1234", "90687", "Riyadh", "available", null, null, null, null);
//        company2 = new Company(null, "RAWAN", "10074", "97897", "geddah", "busy", null, null, null, null);
//        company3 = new Company(null, "RAGHAD", "8739", "4342", "DAMMAM", "available", null, null, null, null);
//
//    }
//
//    @Test
//    public void findCompanyById() {
//        companyRepository.save(company1);
//        company2 = companyRepository.findCompanyById(company1.getId());
//        org.assertj.core.api.Assertions.assertThat(company2.getId()).isEqualTo(company1.getId());
//
//    }
//
//    @Test
//    public void findCompanyByCity() {
//        companyRepository.save(company1);
//        companyList = companyRepository.findCompanyByCity(company1.getCity());
//        Assertions.assertThat(companyList.get(0).getCity()).isEqualTo(company1.getCity());
//
//    }
//}
