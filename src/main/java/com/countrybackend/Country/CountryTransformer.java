package com.countrybackend.Country;

import com.countrybackend.CountryDetails.CountryDetails;
import com.countrybackend.CountryDetails.CountryDetailsEntity;
import org.springframework.stereotype.Component;

@Component
public class CountryTransformer {

    public CountryEntity onlyCountriesToEntity(Country country){
        return CountryEntity.builder()
                .countryCode(country.getCountryCode())
                .countryName(country.getCountryName())
                .countryContinent(country.getCountryContinent())
                .countryPopulation(country.getCountryPopulation())
                .build();
    }

    public Country onlyCountriesFromEntity(CountryEntity countryEntity){
        return Country.builder()
                .countryCode(countryEntity.getCountryCode())
                .countryName(countryEntity.getCountryName())
                .countryContinent(countryEntity.getCountryContinent())
                .countryPopulation(countryEntity.getCountryPopulation())
                .build();
    }

    public CountryEntity toEntity(Country country){
         CountryEntity.CountryEntityBuilder countryEntityBuilder = CountryEntity.builder()
                .countryCode(country.getCountryCode())
                .countryName(country.getCountryName())
                .countryContinent(country.getCountryContinent())
                .countryPopulation(country.getCountryPopulation());
         if(country.getCountryDetails() != null){
             countryEntityBuilder.countryDetailsEntity(CountryDetailsEntity.builder()
                     .capital(country.getCountryDetails().getCapital())
                     .governmentForm(country.getCountryDetails().getGovernmentForm())
                     .independenceDay(country.getCountryDetails().getIndependenceDay())
                     .independenceYear(country.getCountryDetails().getIndependenceYear())
                     .nationalAnimal(country.getCountryDetails().getNationalAnimal())
                     .nationalAnthem(country.getCountryDetails().getNationalAnthem())
                     .nationalAward(country.getCountryDetails().getNationalAward())
                     .nationalBird(country.getCountryDetails().getNationalBird())
                     .nationalCurrency(country.getCountryDetails().getNationalCurrency())
                     .nationalSport(country.getCountryDetails().getNationalSport())
                     .noOfStates(country.getCountryDetails().getNoOfStates())
                     .officialLanguage(country.getCountryDetails().getOfficialLanguage())
                     .president(country.getCountryDetails().getPresident())
                     .build());
         }
         return countryEntityBuilder.build();
    }

    public Country fromEntity(CountryEntity countryEntity){
         Country.CountryBuilder countryBuilder = Country.builder()
                .countryCode(countryEntity.getCountryCode())
                .countryName(countryEntity.getCountryName())
                .countryContinent(countryEntity.getCountryContinent())
                .countryPopulation(countryEntity.getCountryPopulation());
         if(countryEntity.getCountryDetailsEntity() != null){
             countryBuilder.countryDetails(CountryDetails.builder()
                     .capital(countryEntity.getCountryDetailsEntity().getCapital())
                     .governmentForm(countryEntity.getCountryDetailsEntity().getGovernmentForm())
                     .independenceDay(countryEntity.getCountryDetailsEntity().getIndependenceDay())
                     .independenceYear(countryEntity.getCountryDetailsEntity().getIndependenceYear())
                     .nationalAnimal(countryEntity.getCountryDetailsEntity().getNationalAnimal())
                     .nationalAnthem(countryEntity.getCountryDetailsEntity().getNationalAnthem())
                     .nationalAward(countryEntity.getCountryDetailsEntity().getNationalAward())
                     .nationalBird(countryEntity.getCountryDetailsEntity().getNationalBird())
                     .nationalCurrency(countryEntity.getCountryDetailsEntity().getNationalCurrency())
                     .nationalSport(countryEntity.getCountryDetailsEntity().getNationalSport())
                     .noOfStates(countryEntity.getCountryDetailsEntity().getNoOfStates())
                     .officialLanguage(countryEntity.getCountryDetailsEntity().getOfficialLanguage())
                     .president(countryEntity.getCountryDetailsEntity().getPresident())
                     .build());
         }
         return countryBuilder.build();
    }
}
