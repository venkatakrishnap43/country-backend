package com.countrybackend.Country;

import com.countrybackend.CountryDetails.CountryDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
    private String countryCode;
    private String countryName;
    private String countryContinent;
    private String countryPopulation;
    private CountryDetails countryDetails;
}
