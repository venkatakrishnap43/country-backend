package com.countrybackend.Country;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static com.countrybackend.Country.CountryDataFactory.*;
import static java.util.Collections.singletonList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class CountryControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    CountryService countryService;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getAllCountries() throws Exception {

        Country country = validCountryOnlyCountries();

        when(countryService.getCountries()).thenReturn((singletonList(country)));
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/v1/country/service/get/countries"))
                .andExpect(status().isOk())
                .andReturn();

        String expected = "[\n" +
                "  {\n" +
                "    \"countryCode\": \"IN\",\n" +
                "    \"countryName\": \"India\",\n" +
                "    \"countryContinent\": \"Asia\",\n" +
                "    \"countryPopulation\": \"1.3 B\"\n" +
                "  }\n" +
                "]";
        assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.STRICT);
    }

    @Test
    void getCountryDetails() throws Exception {
        String countryCode = "IN";
        Country country = validCountry();

        when(countryService.getCountryDetails(countryCode)).thenReturn(country);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/v1/country/service/get/{0}/country/details", countryCode)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();

        String expected = "  {\n" +
                "    \"countryCode\": \"IN\",\n" +
                "    \"countryName\": \"India\",\n" +
                "    \"countryContinent\": \"Asia\",\n" +
                "    \"countryPopulation\": \"1.3 B\",\n" +
                "    \"countryDetails\": {\n" +
                "      \"capital\": \"Delhi\",\n" +
                "      \"president\": \"Ram Nad Kovindh\",\n" +
                "      \"independenceDay\": \"15th August\",\n" +
                "      \"noOfStates\": \"29\",\n" +
                "      \"officialLanguage\": \"Hindi\",\n" +
                "      \"independenceYear\": \"1947\",\n" +
                "      \"nationalAnimal\": \"Tiger\",\n" +
                "      \"nationalBird\": \"Peacock\",\n" +
                "      \"nationalSport\": \"Hockey\",\n" +
                "      \"nationalAnthem\": \"Jana Gana Mana\",\n" +
                "      \"nationalAward\": \"Bharata Ratna\",\n" +
                "      \"nationalCurrency\": \"Rupee\",\n" +
                "      \"governmentForm\": \"Democratic\"\n" +
                "    }\n" +
                "  }\n";
        assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.STRICT);
    }
//
//    @Test
//    void getCountryByCode() throws Exception {
//
//        //given
//        String countryCode = "US";
//        Country country = validCountry();
//
//        when(countryService.getCountryByCode(countryCode)).thenReturn(country);
//
//        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/countries/service/get-country-code/{countryCode}", countryCode))
//                .andExpect(status().isOk())
//                .andReturn();
//
//        String expected = "{\n" +
//                "  \"countryCode\": \"US\",\n" +
//                "  \"countryName\": \"USA\",\n" +
//                "  \"population\": \"300000000\",\n" +
//                "  \"capitalName\": \"Washington D.C\",\n" +
//                "  \"independenceYear\": \"1776\"\n" +
//                "}";
//        assertEquals(expected, result.getResponse().getContentAsString(), JSONCompareMode.STRICT);
//    }
//
//    @Test
//    void updateCountryByCode() throws Exception {
//
//        //given
//        String countryCode = "US";
//        Country country = validCountry();
//
//        //when
//        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/countries/service/update-country-code/{countryCode}", countryCode)
//                .contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(country)))
//                .andExpect(status().isOk())
//                .andReturn();
//
//        verify(countryService).updateCountryByCode(countryCode, country);
//    }
}