
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sNote;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher=teacher;

    }

   /* void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("error");
        }
        //printTeacher();

    }*/

    void printTeacher() {

        this.teacher.print();
    }

}


