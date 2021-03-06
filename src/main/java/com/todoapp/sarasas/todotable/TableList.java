package com.todoapp.sarasas.todotable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String id;
    private String rowContent;
    private String deadline;
    private String rowCondition;

    public String getId() {
        return id;
    }

    public void setId(String rowId) {
        this.id = rowId;
    }

    public String getRowContent() {
        return rowContent;
    }

    public void setRowContent(String rowContent) {
        this.rowContent = rowContent;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getRowCondition() {
        return rowCondition;
    }

    public void setRowCondition(String condition) {
        this.rowCondition = condition;
    }
}
