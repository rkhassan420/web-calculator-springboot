package com.percentage.percentage.model;

public class PercentageRequest {

    private double totalMarks;
    private double percentage;
    private double obtainedMarks;
    private double completeMarks;

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(double obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public double getCompleteMarks() {
        return completeMarks;
    }

    public void setCompleteMarks(double completeMarks) {
        this.completeMarks = completeMarks;
    }
}

