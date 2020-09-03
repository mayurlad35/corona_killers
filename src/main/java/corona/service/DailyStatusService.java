package corona.service;

import corona.model.DailyStatusModel;

import java.util.List;

public interface DailyStatusService {
    public String addingCoronaDailyStatus(DailyStatusModel statusModel);
    public List<DailyStatusModel> getDailyStatusData();
}
