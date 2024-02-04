package com.ME2352.CountriesAPI.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ME2352.CountriesAPI.controllerService.CountryService;
import com.ME2352.CountriesAPI.model.Country;


@RestController
@RequestMapping("/api")
public class CountryController {
	
	private final CountryService countryService = new CountryService();
	
	
    @GetMapping("/all")
    public ResponseEntity<ArrayList<Country>> getAllCountries() {
    	ArrayList<Country> countries = countryService.getAllCountries();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
    
    @GetMapping("/country/{name}")
    public ResponseEntity<ArrayList<Country>> getOddById(@PathVariable(value = "name") String name) {
    	ArrayList<Country> countries = countryService.getCountryByName(name);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
    
    @GetMapping("/language/{language}")
    public ResponseEntity<ArrayList<Country>> getCountriesByLanguage(@PathVariable(value = "language") String language) {
        ArrayList<Country> countries = countryService.getCountryByLanguage(language);
        return new ResponseEntity<>(countries, HttpStatus.OK);
        
    }

    @GetMapping("/currency/{currency}")
    public ResponseEntity<ArrayList<Country>> getCountriesByCurrency(@PathVariable(value = "currency") String currency) {
        ArrayList<Country> countries = countryService.getCountryByCurrency(currency);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }


}
