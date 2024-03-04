public class Lecturer extends Instructor2 {
    private String roomNumber;

    public Lecturer(String nameSurname, String phoneNumber, String email, String department, String title, String roomNumber) {
        super(nameSurname, phoneNumber, email, department, title);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void exam() {
        System.out.println(this.getNameSurname() + " has an exam");
    }

    @Override
    public void lesson(String hour) {
        System.out.println(this.getNameSurname() + " entered the lesson at " + hour);
    }

    @Override
    public void entering() {
        System.out.println(this.getNameSurname() + " entered the universityyyy");
    }
}