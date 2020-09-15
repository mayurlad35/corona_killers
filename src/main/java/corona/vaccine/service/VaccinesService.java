package corona.vaccine.service;

import corona.vaccine.data.VaccineData;

import java.util.List;

/*Responsible for getting date from "vaccine" table*/
public interface VaccinesService {
    /*for getting all the vaccins availbe in vaccine table
    * returns {link VaccineData}'s*/
    public List<VaccineData> getAvailableVaccines();
}
