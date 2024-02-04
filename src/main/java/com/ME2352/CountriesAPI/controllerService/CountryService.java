package com.ME2352.CountriesAPI.controllerService;

import java.util.ArrayList;

import com.ME2352.CountriesAPI.exception.NotFoundException;
import com.ME2352.CountriesAPI.model.Country;

public class CountryService {

    private final CountryRestClient countryRestController = new CountryRestClient();

    private ArrayList<Country> useService(String path) {

        try {
			return countryRestController.getResource(path);
		} catch (Exception e) {
			e.printStackTrace();
			throw new NotFoundException("Not found");			
		}
    }


    public ArrayList<Country> getAllCountries() {
        return useService("all");
    }

    public ArrayList<Country> getCountryByName(String name) {
        return useService("name/" + name);
    }

    public ArrayList<Country> getCountryByFullName(String name) {
        return useService("name/" + name + "?fulltext=true");
    }

    public ArrayList<Country> getCountryByCode(String code) {
        return useService("alpha/" + code);
    }

    public ArrayList<Country> getCountryByCodeList(String codeList) {
        return useService("alpha?codes=" + codeList);
    }

    public ArrayList<Country> getCountryByCurrency(String currency) {
        return useService("currency/" + currency);
    }

    public ArrayList<Country> getCountryByLanguage(String lang) {
        return useService("lang/" + lang);
    }

    public ArrayList<Country> getCountryByTranslation(String translation) {
        return useService("translation/" + translation);
    }

    public ArrayList<Country> getCountryByCapitalCity(String capital) {
        return useService("capital/" + capital);
    }

    public ArrayList<Country> getCountryByRegion(String region) {
        return useService("region/" + region);
    }

    public ArrayList<Country> getCountryBySubRegion(String subregion) {
        return useService("subregion/" + subregion);
    }

    public ArrayList<Country> getCountryByDemonym(String demonym) {
        return useService("demonym/" + demonym);
    }
}
