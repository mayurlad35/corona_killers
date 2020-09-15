package corona.vaccine.dao.impl;

import corona.vaccine.dao.VaccinesDao;
import corona.vaccine.model.VaccineModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import java.util.List;

public class VaccinesDaoImpl implements VaccinesDao {
    private String QUERY = "SELECT * FROM VACCINE";
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<VaccineModel> fetchAvailableVaccines() {
        List<VaccineModel> vaccineModelList = (List<VaccineModel>) getJdbcTemplate()
                .query(QUERY, new RowMapperResultSetExtractor(new BeanPropertyRowMapper(VaccineModel.class)));
        return vaccineModelList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
