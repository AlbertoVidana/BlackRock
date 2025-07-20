package com.example.demo.helper;

public class Q {
    private double fixed;
    private String start;
    private String end;

    public Q(double fixed, String start, String end) {
        this.fixed = fixed;
        this.start = start;
        this.end = end;
    }
    public double getFixed() {
        return fixed;
    }
    public void setFixed(double fixed) {
        this.fixed = fixed;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
}
