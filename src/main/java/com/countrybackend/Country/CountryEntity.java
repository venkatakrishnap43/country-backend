package com.countrybackend.Country;

import com.countrybackend.CountryDetails.CountryDetailsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "countries")
@IdClass(CountryKey.class)
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Id
    private String countryCode;
    private String countryName;
    private String countryContinent;
    private String countryPopulation;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = CountryDetailsEntity.class)
    @JoinColumn(name = "country_details_id")
    private CountryDetailsEntity countryDetailsEntity;
}
