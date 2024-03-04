public abstract class  Instructor2 extends Employee2 {
    private String department;
    private String title;
    public Instructor2(String nameSurname, String phoneNumber, String email, String department, String title) {
        super(nameSurname, phoneNumber, email);
        this.department=department;
        this.title=title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void lesson(String hour);

    @Override
    public void entering(){
        System.out.println(this.getNameSurname()+ " entered from the second entrance gate");
    }
}
