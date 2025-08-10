
package com.cognizant.spring_country_service_in.controller;

import com.cognizant.spring_country_service_in.model.Country;
import com.cognizant.spring_country_service_in.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}
