public class Course2 {
    private String courseName;
    private String code;
    private Instructor instructor;
    int note;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


    public Course2(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor=instructor;

    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public double calcAverage (Student2[] students){  //Course uses a Student : Dependency => Course2 sınıfına ait bir metot başka bir sınıftan (Student2 sınıfından) parametre alıyor.
        double sum=0.0;
        for (Student2 student : students) {
            sum += student.getNote();
        }
        return sum/students.length;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
