package com.hanna.uts.no2;

public class CommissionEmployee_31093109 extends Employee_3109 {
    private float baseFee_3109;
    private float commisionFee_3109;
    private int totalSales_3109;

    public CommissionEmployee_31093109() {}

    public CommissionEmployee_31093109(String name_3109, int id_3109) {
        super(name_3109, id_3109);
    }

    public CommissionEmployee_31093109(String name, int id, float baseFee_3109, float commisionFee_3109, int totalSales_3109) {
        super(name, id);
        this.baseFee_3109 = baseFee_3109;
        this.commisionFee_3109 = commisionFee_3109;
        this.totalSales_3109 = totalSales_3109;
    }

    @Override
    public float getSalary_3109() {
        return baseFee_3109 + (commisionFee_3109 * totalSales_3109);
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

    public int getTotalSales_3109() {
        return totalSales_3109;
    }

    public void setTotalSales_3109(int totalSales_3109) {
        this.totalSales_3109 = totalSales_3109;
    }
}
