package corona.vaccine.service.impl;

import org.springframework.beans.BeanUtils;

import corona.vaccine.dao.VaccinesDao;
import corona.vaccine.data.VaccineData;
import corona.vaccine.model.VaccineModel;
import corona.vaccine.service.VaccinesService;

import java.util.ArrayList;
import java.util.List;

public class VaccineServiceImpl implements VaccinesService {
    private VaccinesDao vaccinesDao;

    @Override
    public List<VaccineData> getAvailableVaccines() {
        List<VaccineModel> vaccineModelList = getVaccinesDao().fetchAvailableVaccines();
        List<VaccineData> VaccineDataList = new ArrayList<>();
        for(VaccineModel vaccine:vaccineModelList){
            VaccineData vaccineData = new VaccineData();
            BeanUtils.copyProperties(vaccine,vaccineData);
            VaccineDataList.add(vaccineData);
    }
        return VaccineDataList;
    }

    public VaccinesDao getVaccinesDao() {
        return vaccinesDao;
    }

    public void setVaccinesDao(VaccinesDao vaccinesDao) {
        this.vaccinesDao = vaccinesDao;
    }
}
