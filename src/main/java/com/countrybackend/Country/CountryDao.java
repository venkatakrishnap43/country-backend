package com.countrybackend.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDao extends JpaRepository<CountryEntity, Integer> {
    CountryEntity findByCountryCode(String countryCode);
}
