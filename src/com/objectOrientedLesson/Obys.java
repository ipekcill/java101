package com.objectOrientedLesson;

public class Obys {
    public static void main(String[] args) {
        Course calculus=new Course ( "Calculus", "101");
        Course physics =new Course( " Physics", "102");

        Teacher t1=new Teacher( " Firuz Balkan", " 05555555555", "Science", calculus);
        Teacher t2=new Teacher( " Nilay Gizli", " 05555555551", "Science", physics);

        Student s1=new Student( " Arlo vonBagira", "2", calculus, physics);
        Student s2= new Student("North vonBagira", "2", calculus, physics);
        Student s3= new Student("Onur vonBagira", "2", calculus, physics);




        s1.setNote1(78);
        s1.setNote2(88);

        s2.setNote1(98);
        s2.setNote2(56);

        s3.setNote1(65);
        s3.setNote2(87);
        System.out.println(s1.getAverage());
        Double [] notes1={s1.getNote1(),s2.getNote1(),s3.getNote1()};
        Double [] notes2={s1.getNote2(),s2.getNote2(),s3.getNote2()};
        System.out.println(calculus.calcCourseAvg1(notes1));
        System.out.println(physics.calcCourseAvg2(notes2));








    }

}
