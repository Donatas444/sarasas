package com.todoapp.sarasas.dao;

import com.todoapp.sarasas.todotable.TableList;

import java.util.List;

public interface TodoTableDAO {
    List<TableList> findAll();
    void insertInToList(TableList tableList);
    void updateList(TableList tableList);
    void deleteFromList(TableList tableList);

}
