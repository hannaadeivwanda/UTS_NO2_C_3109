package com.hanna.uts.no2;

public class ProjectPlanner_3109 extends Employee_3109 {
    private float baseFee_3109;
    private float commisionFee_3109;
    private int totalProjectsDone_3109;

    public ProjectPlanner_3109() {}

    public ProjectPlanner_3109(String name, int id) {
        super(name, id);
    }

    public ProjectPlanner_3109(String name, int id, float baseFee_3109, float commisionFee_3109, int totalProjectsDone_3109) {
        super(name, id);
        this.baseFee_3109 = baseFee_3109;
        this.commisionFee_3109 = commisionFee_3109;
        this.totalProjectsDone_3109 = totalProjectsDone_3109;
    }

    @Override
    public float getSalary_3109() {
        float grossSalary_3109 = baseFee_3109 + (commisionFee_3109 * totalProjectsDone_3109);
        float tax_3109 = grossSalary_3109 * 5 / 100;

        return grossSalary_3109 - tax_3109;
    }

    public float getBaseFee_3109() {
        return baseFee_3109;
    }

    public void setBaseFee_3109(float baseFee_3109) {
        this.baseFee_3109 = baseFee_3109;
    }

    public float getCommisionFee_3109() {
        return commisionFee_3109;
    }

    public void setCommisionFee_3109(float commisionFee_3109) {
        this.commisionFee_3109 = commisionFee_3109;
    }

    public int getTotalProjectsDone_3109() {
        return totalProjectsDone_3109;
    }

    public void setTotalProjectsDone_3109(int totalProjectsDone_3109) {
        this.totalProjectsDone_3109 = totalProjectsDone_3109;
    }
}
