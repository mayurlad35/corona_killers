package corona.dao;

import corona.model.DailyStatusModel;

import java.util.List;

public interface DailyStatusDao {
    public int addDailyStatusData(DailyStatusModel statusModel);
    public List<DailyStatusModel> getDailyStatusData();
    public DailyStatusModel getClosestDate();
}
