package com.prj.learn.entity;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {

    @Id
    private String taskId;

    private Time time;
    private Date date;

    @Column(length = 10000)
    private String task;
    private String taskType;
    private boolean completed = false;

    @ManyToOne
    private User user;

}
