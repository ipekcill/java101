package com.interview;

public class Course {
    private String name;
    private String code;
    private Teacher teacher;
    private double average;
    private int note;

    public Course(String name, String code, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.teacher = teacher;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public int getNote(Student student) {
        return student.getNote1();
    }

    public void setNote(int note) {
        this.note = note;
    }

    public double calculateAverage(int[] notes) {
        double sum = 0;
        for (int note : notes) {
            sum += note;
        }
        double average = sum / notes.length;
        this.average = average;
        return this.average;

    }

    public double getAverage() {
        return this.average;
    }
}
