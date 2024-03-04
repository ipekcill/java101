public class Run {
    public static void main(String[] args) {
        //Employee2 e1 = new Employee2("Seher Cil", "0850654345", "seher@gmail.com");
        //Employee2 e2 = new Instructor2("Arlo Cil", "08555555555", "arlovonbagira@gmail.com", "HAVHAV", "Prof");
        //Instructor2 instructor = new Instructor2("Ipek", "0850654345", "seher@gmail.com", "CHEMENG", "Proffessor");
        //Instructor2 instructor2 = new Instructor2("Ipeks", "0850654345", "seher@gmail.com", "CHEMENG", "Proffessor");
        //Officer officer = new Officer("Onur Cil", "9387472348", "omoomo", "Computinh", "08.00 - 17.00");
        Lecturer lecturer = new Lecturer("Ayşe Yılmaz", "48534", "jdıuwdw", "CENG", "Prof", "5");


        //Employee2[] employees = {lecturer};
        // Employee2.users(employees);

        lecturer.entering();
        lecturer.leaving();
        lecturer.lesson("14.00");
        lecturer.entering();
       /* e1.entering();
        e2.entering();
        lecturer.entering();
        instructor.entering();
        officer.entering();*/


    }

}

