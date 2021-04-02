package com.countrybackend.CountryDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDetailsRepository extends JpaRepository<CountryDetailsEntity, Integer> {
}
