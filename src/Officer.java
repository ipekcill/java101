public abstract class Officer extends Employee2 {
    private String department;
    private String mesai;

    public Officer(String nameSurname, String phoneNumber, String email, String department, String mesai) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
    public void work(){
        System.out.println(this.getNameSurname() + " started to work");
    }
    public void entering(){
        System.out.println(this.getNameSurname()+ "entered the university from B gate");
    }

}
