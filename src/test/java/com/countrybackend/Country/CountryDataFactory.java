package com.countrybackend.Country;

import com.countrybackend.CountryDetails.CountryDetails;
import com.countrybackend.CountryDetails.CountryDetailsEntity;

public class CountryDataFactory {

    private CountryDataFactory(){}

    public static final Country validCountry(){
        return Country.builder()
                .countryPopulation("1.3 B")
                .countryContinent("Asia")
                .countryName("India")
                .countryCode("IN")
                .countryDetails(CountryDetails.builder()
                        .capital("Delhi")
                        .governmentForm("Democratic")
                        .independenceDay("15th August")
                        .independenceYear("1947")
                        .nationalAnimal("Tiger")
                        .nationalAnthem("Jana Gana Mana")
                        .nationalAward("Bharata Ratna")
                        .nationalBird("Peacock")
                        .nationalCurrency("Rupee")
                        .nationalSport("Hockey")
                        .noOfStates("29")
                        .officialLanguage("Hindi")
                        .president("Ram Nad Kovindh")
                        .build())
                .build();
    }

    public static final CountryEntity validCountryEntity(){
        return CountryEntity.builder()
                .countryPopulation("1.3 B")
                .countryContinent("Asia")
                .countryName("India")
                .countryCode("IN")
                .countryDetailsEntity(CountryDetailsEntity.builder()
                        .capital("Delhi")
                        .governmentForm("Democratic")
                        .independenceDay("15th August")
                        .independenceYear("1947")
                        .nationalAnimal("Tiger")
                        .nationalAnthem("Jana Gana Mana")
                        .nationalAward("Bharata Ratna")
                        .nationalBird("Peacock")
                        .nationalCurrency("Rupee")
                        .nationalSport("Hockey")
                        .noOfStates("29")
                        .officialLanguage("Hindi")
                        .president("Ram Nad Kovindh")
                        .build())
                .build();
    }

    public static final Country validCountryOnlyCountries(){
        return Country.builder()
                .countryPopulation("1.3 B")
                .countryContinent("Asia")
                .countryName("India")
                .countryCode("IN")
                .build();
    }

    public static final CountryEntity validCountryEntityOnlyCountries(){
        return CountryEntity.builder()
                .countryPopulation("1.3 B")
                .countryContinent("Asia")
                .countryName("India")
                .countryCode("IN")
                .build();
    }
}
