package com.todoapp.sarasas.service;

import com.todoapp.sarasas.todotable.TableList;

import java.util.List;

public interface TableListService {
    List<TableList> findAll();
    void insertTableList(TableList tableList);
    void updateTableList(TableList tableList);
    void deleteTableList(TableList tableList);
}
