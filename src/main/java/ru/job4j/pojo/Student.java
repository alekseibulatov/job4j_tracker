package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String lastName;
    private String group;
    private Date dateEntrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateEntrance() {
        return dateEntrance;
    }

    public void setDateEntrance(Date dateEntrance) {
        this.dateEntrance = dateEntrance;
    }
}
