package com.ME2352.CountriesAPI.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country{
	   String cca2;
	    String ccn3;
	    String cca3;
	    String cioc;
	    Boolean independent;
	    String status;
	    Boolean unMember;
	    String region;
	    String subregion;
	    Boolean landlocked;
	    Double area;
	    String flag;
	    Integer population;
	    String fifa;
	    String startOfWeek;
	    PictureResource coatOfArms;
	    PictureResource flags;
	    ArrayList<Double> latlng;
	    CapitalInfo capitalInfo;
	    ArrayList<String> continents;
	    ArrayList<String> timezones;
	    Car car;
	    MapResource maps;
	    ArrayList<String> borders;
	    ArrayList<String> capital;
	    Idd idd;
	    ArrayList<String> altSpellings;
	    ArrayList<String> tld;
	    Name name;
	    ArrayList<Currencies> currencies;
	    ArrayList<Demonyms> demonyms;
	    ArrayList<Languages> languages;
	    ArrayList<NameResource> translations;
	    Gini gini;
	    PostalCode postalCode;
}
