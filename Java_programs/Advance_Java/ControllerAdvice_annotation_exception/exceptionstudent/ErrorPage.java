package com.example.demoRestAPI.exceptionstudent;

public class ErrorPage {
    private int statuscode;
    private String message;
    private long timestap;

    public ErrorPage() {
    }

    public ErrorPage(int statuscode, String message, long timestap) {
        this.statuscode = statuscode;
        this.message = message;
        this.timestap = timestap;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestap() {
        return timestap;
    }

    public void setTimestap(long timestap) {
        this.timestap = timestap;
    }
}
