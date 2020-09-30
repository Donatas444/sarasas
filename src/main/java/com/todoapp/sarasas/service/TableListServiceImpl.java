package com.todoapp.sarasas.service;

import com.todoapp.sarasas.dao.TodoTableDAO;
import com.todoapp.sarasas.todotable.TableList;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TableListServiceImpl implements TableListService {

    @Resource
    private TodoTableDAO todoTableDAO;

    @Override
    public List<TableList> findAll() {
        return todoTableDAO.findAll();
    }

    @Override
    public void insertTableList(TableList tableList) {
        todoTableDAO.insertInToList(tableList);
    }

    @Override
    public void updateTableList(TableList tableList) {
        todoTableDAO.updateList(tableList);
    }

    @Override
    public void deleteTableList(TableList tableList) {
        todoTableDAO.deleteFromList(tableList);
    }
}