package com.hanna.uts.no2;

public class Employee_3109 {
    private String name_3109;
    private int id_3109;

    public Employee_3109() {}

    public Employee_3109(String name_3109, int id_3109) {
        this.name_3109 = name_3109;
        this.id_3109 = id_3109;
    }

    public float getSalary_3109() {
        return 0;
    }

    public void showProfile() {
        System.out.println("Name  : " + getName_3109());
        System.out.println("ID    : " + getId_3109());
        System.out.println("Salary: $" + getSalary_3109());
        System.out.println();
    }

    public String getName_3109() {
        return name_3109;
    }

    public void setName_3109(String name_3109) {
        this.name_3109 = name_3109;
    }

    public int getId_3109() {
        return id_3109;
    }

    public void setId_3109(int id_3109) {
        this.id_3109 = id_3109;
    }
}
