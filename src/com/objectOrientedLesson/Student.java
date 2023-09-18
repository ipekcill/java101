package com.objectOrientedLesson;

public class Student {
    private String name;
    private String grade;
    private Course c1;
    private Course c2;
    private double note1;
    private double note2;
    private double average=0;

    public Student(String name, String grade, Course c1, Course c2) {
        this.name = name;
        this.grade = grade;
        this.c1 = c1;
        this.c2 = c2;
        double average=0;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Course getC1() {
        return c1;
    }

    public void setC1(Course c1) {
        this.c1 = c1;
    }

    public Course getC2() {
        return c2;
    }

    public void setC2(Course c2) {
        this.c2 = c2;
    }


    public void calcAverage (){
        this.setAverage((this.getNote1()+this.getNote2()) / 2);
        System.out.println("Average of the"   + this.getName()+ " student " + this.getAverage());
    }
    public boolean isPass(){
        if(this.getAverage()> 55){
            return true;
        }else{
            return false;
        }
    }
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
