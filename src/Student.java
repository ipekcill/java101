public class Student {
    String name;
    String stuNo;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;
    int grade;

    Student(String name, String stuNo, Course c1, Course c2, Course c3, int grade) {
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
        this.grade = grade;
    }
/*    void addCourse(Course c1, Course c2, Course c3){
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

    }*/
     /*void calcAvg( int note1,int note2,int note3){
        average=(note1+note2+note3)/3.0;
     } */
     void addBulkExamNote (int note1,int note2,int note3){
         this.c1.note=note1;
         this.c2.note=note2;
         this.c3.note=note3;
     }
     void addBulkSNote(int not1, int not2, int not3){
         this.c1.sNote=not1;
         this.c2.sNote=not2;
         this.c3.sNote=not3;

     }
     void isPass(){
         this.average=(((this.c1.note*0.8)+(this.c1.sNote*0.2))+((this.c2.note*0.8)+(this.c2.sNote*0.2))+((this.c3.note*0.8)+(this.c3.sNote*0.2)))/3;
         if (this.average>=60){
             System.out.println("Sınıfı geçtiniz");

         }else{
             System.out.println("Sınıf tekrarı");
         }
         printNote();
     }


     void printNote(){
         System.out.println(c1.name + " note: " + c1.note);
         System.out.println(c2.name + " note: " + c2.note);
         System.out.println(c3.name + " note: " + c3.note);
         System.out.println("Average: " + this.average);
     }

}


