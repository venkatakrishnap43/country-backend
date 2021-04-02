package com.countrybackend.Country;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static com.countrybackend.Country.CountryDataFactory.*;
import static com.countrybackend.Country.CountryDataFactory.validCountryEntityOnlyCountries;
import static java.util.Collections.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CountryServiceTest {

    @InjectMocks
    CountryService countryService;

    @Mock
    CountryTransformer countryTransformer;

    @Mock
    CountryDao countryDao;

    @Test
    void getCountries() {
        //given
        Country country = validCountryOnlyCountries();
        CountryEntity countryEntity = validCountryEntityOnlyCountries();

        //when
        when(countryTransformer.onlyCountriesFromEntity(countryEntity)).thenReturn(country);
        when(countryDao.findAll()).thenReturn(singletonList(countryEntity));
        List<Country> result = countryService.getCountries();

        //then
        assertThat(singletonList(country)).isEqualTo(result);
    }

    @Test
    void getCountryDetails(){
        //given
        String countryCode = "IN";
        Country country = validCountry();
        CountryEntity countryEntity = validCountryEntity();

        //when
        when(countryTransformer.fromEntity(countryEntity)).thenReturn(country);
        when(countryDao.findByCountryCode(countryCode)).thenReturn(countryEntity);
        Country result = countryService.getCountryDetails(countryCode);

        //then
        assertThat(country).isEqualTo(result);
    }
}