package com.countrybackend.CountryDetails;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "country_details")
public class CountryDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String capital;
    private String president;
    private String independenceDay;
    private String noOfStates;
    private String officialLanguage;
    private String independenceYear;
    private String nationalAnimal;
    private String nationalBird;
    private String nationalSport;
    private String nationalAnthem;
    private String nationalAward;
    private String nationalCurrency;
    private String governmentForm;
}
