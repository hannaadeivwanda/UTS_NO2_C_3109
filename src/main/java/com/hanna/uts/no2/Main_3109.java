package com.hanna.uts.no2;

public class Main_3109 {
    public static void main(String[] args) {
        // Demo Employee
        Employee_3109 em1_3109 = new Employee_3109("Hanna", 101);
        em1_3109.showProfile();

        // Demo Salaried Employee
        SalariedEmployee_3109 em2_3109 = new SalariedEmployee_3109("Hanako", 102, 5.0f);
        em2_3109.showProfile();

        // Demo Commision Employee
        CommissionEmployee_31093109 em3_3109 = new CommissionEmployee_31093109("Hanami", 103, 10.0f, 5.0f, 7);
        em3_3109.showProfile();

        // Demo Project Planner
        ProjectPlanner_3109 em4_3109 = new ProjectPlanner_3109("Hanamura", 104, 20.0f,10.0f,10);
        em4_3109.showProfile();
    }
}
