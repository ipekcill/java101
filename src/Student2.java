public class Student2 {
    private String name;
    private String surname;
    private String idno;
    private String adress;
    private Course2 crs1;


    private int note;

    public Student2(String name,String surname, String idno, String adress, int note, Course2 crs1){

        this.name=name;
        this.surname=surname;
        this.idno=idno;
        this.adress=adress;
        this.note=note;
        this.crs1=crs1;
    }

    public Course2 getCrs1() {
        return crs1;
    }

    public void setCrs1(Course2 crs1) {
        this.crs1 = crs1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if(note>100 || note<0){
            note=0;
        }
        this.note = note;

    }



}
