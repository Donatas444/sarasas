package com.todoapp.sarasas.mapper;

import com.todoapp.sarasas.todotable.TableList;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TableListRowMapper implements RowMapper<TableList> {

    @Override
    public TableList mapRow(ResultSet resultSet, int i) throws SQLException {
        TableList tableList = new TableList();

        tableList.setRowId(resultSet.getString("Id"));
        tableList.setRowContent(resultSet.getString("Turinys"));
        tableList.setDeadline(resultSet.getString("deadline"));
        tableList.setRowCondition(resultSet.getString("Busena"));

        return tableList;
    }


}
