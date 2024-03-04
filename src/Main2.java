public class Main2 {
    public static void main(String[] args) {
        Instructor teacher1=new Instructor("Seher", "Cil", "CHEMENG");
        Instructor teacher2=new Instructor("Onur", "Cil", "CHEMENG");
        Course2 crs1 =new Course2("MAT 101", "MAT", teacher1);
        //Course2 crs2=new Course2("FZK101", "FZK", teacher2);
        Student2 st1=new Student2("Ipek", "Cil", "05140000131", "Bornova", 100, crs1);
        Student2 st2= new Student2("Kepi", "Lic",  "13100004105", "Ayancık",89,crs1);
        Student2 st3= new Student2("Osman", "Ç",  "1000000000", "Sinop",86,crs1);

        crs1.setNote(st1.getNote());
        System.out.println(crs1.getNote());


        //Course has a instructor (composition:birleştirme) Aggregation
        System.out.println(crs1.getInstructor().getName());
        Student2 [] stu={st1,st2, st3};
        System.out.println("Average: " + crs1.calcAverage(stu));
    }
}
