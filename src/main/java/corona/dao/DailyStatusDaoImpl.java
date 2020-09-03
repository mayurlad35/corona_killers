package corona.dao;

import corona.model.DailyStatusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DailyStatusDaoImpl implements DailyStatusDao {
    @Autowired
    JdbcTemplate template;

    @Override
    public int addDailyStatusData(DailyStatusModel statusModel) {
        int totalCases = statusModel.getActiveCases()+statusModel.getTotalRecovered()+statusModel.getTotalDeaths();
        System.out.println(totalCases);
        String query = "insert into coronadailystatus(date,activeCases,totalRecovered,totalDeaths,newCases,totalCases)values('"+statusModel.getDate()+"','"+statusModel.getActiveCases()+"'" +
                ",'"+statusModel.getTotalRecovered()+"','"+statusModel.getTotalDeaths()+"','"+statusModel.getNewCases()+"','"+totalCases+"')";
        return template.update(query);
    }

    @Override
    public List<DailyStatusModel> getDailyStatusData() {
        List<DailyStatusModel> list = template.query("SELECT * FROM coronadailystatus", new RowMapper<DailyStatusModel>() {
            @Override
            public DailyStatusModel mapRow(ResultSet resultSet, int i) throws SQLException {
                DailyStatusModel statusModel = new DailyStatusModel();
                statusModel.setDate(resultSet.getString("date"));
                statusModel.setActiveCases(resultSet.getInt("activeCases"));
                statusModel.setTotalRecovered(resultSet.getInt("totalRecovered"));
                statusModel.setTotalDeaths(resultSet.getInt("totalDeaths"));
                statusModel.setNewCases(resultSet.getInt("newCases"));
                statusModel.setTotalCases(resultSet.getInt("totalCases"));
                return statusModel;
            }
        });
        return list;
    }

}
