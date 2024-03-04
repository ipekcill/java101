package com.interview;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Firuz Balkan", "a@gmail.com", "Prof.");
        Teacher teacher2 = new Teacher("Sezgin Kara", "s@gmail.com", "Doç.");
        Course course1 = new Course("Calculus", "101", teacher1);
        Course course2 = new Course("Physics", "102", teacher2);
        Student student1 = new Student("Arlo", course1, course2, 88, 76);
        Student student2 = new Student("Dobi", course1, course2, 68, 73);

        System.out.println(student1.getAverage());
        int[] calculusNotes = {student1.getNote1(), student2.getNote1()};
        int[] physicsNotes = {student1.getNote2(), student2.getNote2()};
        course1.calculateAverage(calculusNotes);
        course2.calculateAverage(physicsNotes);

    }
}
