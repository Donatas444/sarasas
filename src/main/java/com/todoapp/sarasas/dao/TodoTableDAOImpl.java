package com.todoapp.sarasas.dao;

import com.todoapp.sarasas.mapper.TableListRowMapper;
import com.todoapp.sarasas.todotable.TableList;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TodoTableDAOImpl implements TodoTableDAO {

    private static final String SELECT_ALL_LIST = "select * from tableList";
    private static final String INSERT_JOB_TO_DO = "insert into tableList(rowId, rowContent, deadline," +
            "rowCondition) values (:rowId,:rowContent,:deadline,:rowCondition)";
    private static final String DELETE_JOB_TO_DO = "delete from tableList where rowId = :rowId";
    private static final String UPDATE_JOB_TO_DO = "update tableList set rowContent=:rowContent, " +
            "rowContent=:rowContent, deadline=:deadline where rowId=:rowId";


    private NamedParameterJdbcTemplate template;
    public TodoTableDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    @Override
    public List<TableList> findAll() {
      return template.query(SELECT_ALL_LIST, new TableListRowMapper());
    }

    @Override
    public void insertInToList(TableList tableList) {
        updateSqlTemplate(tableList, INSERT_JOB_TO_DO);
    }

    @Override
    public void updateList(TableList tableList) {
updateSqlTemplate(tableList, UPDATE_JOB_TO_DO);
    }

    @Override
    public void deleteFromList(TableList tableList) {

        Map<String, Object> map = new HashMap<>();
        map.put("rowId", tableList.getRowId());
        template.execute(DELETE_JOB_TO_DO, map,
                (PreparedStatementCallback<Object>) PreparedStatement::executeUpdate);
    }

    private SqlParameterSource generateInsertSqlParams(TableList tableList) {
        return new MapSqlParameterSource()
                .addValue("rowId", tableList.getRowId())
                .addValue("rowContent", tableList.getRowContent())
                .addValue("deadline", tableList.getDeadline())
                .addValue("rowCondition", tableList.getRowCondition());
    }
    private void updateSqlTemplate(TableList tableList, String sqlString) {
        SqlParameterSource params = generateInsertSqlParams(tableList);
        template.update(sqlString, params, new GeneratedKeyHolder());
    }

}
