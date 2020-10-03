package com.todoapp.sarasas.controller;

import com.todoapp.sarasas.service.TableListService;
import com.todoapp.sarasas.todotable.TableList;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class ApplicationController {


    @Resource
    private TableListService tableListService;

    @GetMapping("/todoList")
    public List<TableList> getEntries() {
        return tableListService.findAll();
    }

    @PostMapping("/create")
    public void createTableList(@RequestBody TableList tableList) {
        tableListService.insertTableList(tableList);
    }

    @DeleteMapping("/delete")
    public void deleteTableList(@RequestBody TableList tableList) {
        tableListService.deleteTableList(tableList);
    }

    @PutMapping("/update")
    public void updateTableList(@RequestBody TableList tableList) {
        tableListService.updateTableList(tableList);
    }

    @PutMapping("/insert")
    public void insertTableList(@RequestBody TableList tableList) {
        tableListService.insertTableList(tableList);
    }
}


