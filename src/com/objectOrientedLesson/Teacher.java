package com.objectOrientedLesson;

public class Teacher {
    private String name;
    private String phoneNumber;
    private String branch;
    private final Course course;

    public Teacher(String name, String phoneNumber, String branch, Course course) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
        this.course=course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
