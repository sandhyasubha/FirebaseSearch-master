package com.example.breezil.firebasesearch;

/**
 * Created by breezil on 12/20/2017.
 */

public class Search {

    private String Username;
    private  String Department;
    private String Email;

    public Search() {
    }

    public Search(String Username, String Department, String Email) {

        this.Username = Username;
        this.Department = Department;
        this.Email= Email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
}
