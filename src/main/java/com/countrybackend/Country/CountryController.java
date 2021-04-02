package com.countrybackend.Country;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/country/service")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@AllArgsConstructor
@Slf4j
public class CountryController {

    CountryService countryService;

    @GetMapping(path = "/get/countries")
    public List<Country> getAllCountries(){
        return countryService.getCountries();
    }

    @GetMapping(path = "/get/{countryCode}/country/details", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Country getCountryDetails(@PathVariable("countryCode") String countryCode){
        return countryService.getCountryDetails(countryCode);
    }
}
