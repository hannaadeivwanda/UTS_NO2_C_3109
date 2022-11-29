package com.hanna.uts.no2;

public class SalariedEmployee_3109 extends Employee_3109 {
    private float weeklyPay_3109;

    public SalariedEmployee_3109() {}

    public SalariedEmployee_3109(String name, int id) {
        super(name, id);
    }

    public SalariedEmployee_3109(String name, int id, float weeklyPay_3109) {
        super(name, id);
        this.weeklyPay_3109 = weeklyPay_3109;
    }

    @Override
    public float getSalary_3109() {
        return getWeeklyPay_3109();
    }

    public float getWeeklyPay_3109() {
        return weeklyPay_3109;
    }

    public void setWeeklyPay_3109(float newWeeklyPay) {
        this.weeklyPay_3109 = newWeeklyPay;
    }
}
