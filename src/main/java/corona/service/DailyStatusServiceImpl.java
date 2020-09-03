package corona.service;

import corona.dao.DailyStatusDao;
import corona.model.DailyStatusModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DailyStatusServiceImpl implements DailyStatusService {
    @Autowired
    private DailyStatusDao statusDao;
    @Override
    public String addingCoronaDailyStatus(DailyStatusModel statusModel) {
        int count = 0;
        count= statusDao.addDailyStatusData(statusModel);
        if(count==1){
            return "Corona daily status added Successfully";
        }
        else{
            return "Invalid status";
        }
    }

    @Override
    public List<DailyStatusModel> getDailyStatusData() {

        return statusDao.getDailyStatusData();
    }
}
