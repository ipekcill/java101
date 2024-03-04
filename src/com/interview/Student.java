package com.interview;

public class Student {
    private String name;
    private Course course1;
    private Course course2;
    private int note1;
    private int note2;
    private double average;

    public Student(String name, Course course1, Course course2, int note1, int note2) {
        this.name = name;
        this.course1 = course1;
        this.course2 = course2;
        this.note1 = note1;
        this.note2 = note2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public int getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public int getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public double calculateAverage() {
        double Average = (this.getNote1() + this.getNote2()) / 2;
        this.average= Average;
        return this.average;
    }

    public double getAverage() {
        return this.calculateAverage();
    }
}

