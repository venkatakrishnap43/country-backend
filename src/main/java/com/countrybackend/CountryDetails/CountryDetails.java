package com.countrybackend.CountryDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryDetails {
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
