package com.countrybackend.Country;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.countrybackend.Country.CountryDataFactory.*;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class CountryTransformerTest {

    @InjectMocks
    CountryTransformer countryTransformer;

    @Test
    void toEntity() {
        //given
        Country country = validCountry();
        CountryEntity countryEntity = validCountryEntity();

        //when
        CountryEntity result = countryTransformer.toEntity(country);

        //then
        assertThat(countryEntity).isEqualTo(result);
    }

    @Test
    void fromEntity() {
        //given
        Country country = validCountry();
        CountryEntity countryEntity = validCountryEntity();

        //when
        Country result = countryTransformer.fromEntity(countryEntity);

        //then
        assertThat(country).isEqualTo(result);
    }

    @Test
    void onlyCountriesToEntity() {
        //given
        Country country = validCountryOnlyCountries();
        CountryEntity countryEntity = validCountryEntityOnlyCountries();

        //when
        CountryEntity result = countryTransformer.onlyCountriesToEntity(country);

        //then
        assertThat(countryEntity).isEqualTo(result);
    }

    @Test
    void onlyCountriesFromEntity() {
        //given
        Country country = validCountryOnlyCountries();
        CountryEntity countryEntity = validCountryEntityOnlyCountries();

        //when
        Country result = countryTransformer.onlyCountriesFromEntity(countryEntity);

        //then
        assertThat(country).isEqualTo(result);
    }
}