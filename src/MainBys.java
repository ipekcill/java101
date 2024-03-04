
public class MainBys {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("İpek", "4444", "MATH");
        Teacher t3 = new Teacher("Azer Bülbül", "999", "KİM");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        Course mat = new Course("Matematik", "102", "MATH", t2);
        Course kimya = new Course("Kimya", "103", "KİM", t3);


        Student s1 = new Student("Onur", "111", tarih, mat, kimya, 4 );
        Student s2=new Student("Seher", "110", tarih, mat, kimya, 4 );

        s1.addBulkExamNote(50,45,69);
        s1.addBulkSNote(90,60,79);
        s1.isPass();
        s1.printNote();

        s2.addBulkExamNote(90,88,56);
        s2.addBulkSNote(100,98,89);
        s2.isPass();






    }
}
