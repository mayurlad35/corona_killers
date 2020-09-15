package corona.vaccine.dao;

import corona.vaccine.model.VaccineModel;

import java.util.List;

/*class responsible for inserting or fetching information from "vaccine" table*/
public interface VaccinesDao {
    /*this method retrives all the vaccines availbe in "vaccine" table
    * returns {@link VaccineModel}'s
    * */
    public List<VaccineModel> fetchAvailableVaccines();
}
