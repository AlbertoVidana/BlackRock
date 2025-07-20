package com.example.demo.helper;

public class P {
    private double extra;
    private String start;
    private String end;

    public P(double extra, String start, String end) {
        this.extra = extra;
        this.start = start;
        this.end = end;
    } 
    public double getExtra() {
        return extra;
    }
    public void setExtra(double extra) {
        this.extra = extra;
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
