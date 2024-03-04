package com.objectOrientedLesson;

public class Course {
    private String courseName;
    private String courseCode;






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

    public double calcCourseAvg2(Double[] notes2) {
        double sum = 0;
        for (Double items : notes2) {
            sum += items;
        }
        return sum / notes2.length;
    }
    public double calcCourseAvg1(Double[] notes1) {
        double sum = 0;
        for (Double items : notes1) {
            sum += items;
        }
        return sum / notes1.length;

    }


}
