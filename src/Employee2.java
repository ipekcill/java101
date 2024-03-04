public abstract class Employee2 {
    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Employee2(String nameSurname, String phoneNumber, String email) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void entering(){
        System.out.println(getNameSurname() +" entered the university");
    }
    /*public void entering( String enteringHour){ //Metot overloading
        System.out.println(getNameSurname() + " entered the university at " + enteringHour);
    }*/
    public void leaving(){
        System.out.println(this.getNameSurname()+" left the uniiversity");
    }
    public void diningHall(){
        System.out.println(this.getNameSurname() +" entered the dining hall");
    }
    public static void users (Employee2[] employees){
        for (Employee2 employee : employees) {
            employee.entering();
        }
    }
}
