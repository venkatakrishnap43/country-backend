package com.countrybackend.Country;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CountryService {

    CountryDao countryDao;
    CountryTransformer countryTransformer;

    public List<Country> getCountries(){
        return countryDao.findAll().stream().map(e -> countryTransformer.onlyCountriesFromEntity(e)).collect(Collectors.toList());
    }

    public Country getCountryDetails(String countryCode) {
        return countryTransformer.fromEntity(countryDao.findByCountryCode(countryCode));
    }
}
