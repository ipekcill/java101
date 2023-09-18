package com.objectOrientedLesson;

public class Course {
    private String courseName;
    private String courseCode;
    private int note;

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public double calcCourseAvg (Student[] notes){
        double sum=0;
        for (Student student : notes) {
            sum += student.getNote1();
        }
        return sum/notes.length;

    }

}
