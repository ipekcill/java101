package com.interview;

public class Teacher {
    private String nameSurname;
    private String email;
    private String title;

    public Teacher(String nameSurname, String email, String title) {
        this.nameSurname = nameSurname;
        this.email = email;
        this.title = title;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
