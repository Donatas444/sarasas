package com.todoapp.sarasas.mapper;

import com.todoapp.sarasas.todotable.TableList;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TableListRowMapper implements RowMapper<TableList> {

    @Override
    public TableList mapRow(ResultSet resultSet, int i) throws SQLException {
        TableList tableList = new TableList();

        tableList.setId(resultSet.getString("id"));
        tableList.setRowContent(resultSet.getString("rowContent"));
        tableList.setDeadline(resultSet.getString("deadline"));
       tableList.setRowCondition(resultSet.getString("rowCondition"));

        return tableList;
    }


}
