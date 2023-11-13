package com.example.sbibank;

import java.sql.Date;

public class Transaction {
    private  String user_login_id;
    private Date transcation_date;
    private String transaction_type;
    private String getTransaction_type_second;

    private double amount;

    private String transfer_id;

    public Transaction() {
    }

    public Transaction(String user_login_id, Date transcation_date, String transaction_type, String getTransaction_type_second, double amount, String transfer_id) {
        this.user_login_id = user_login_id;
        this.transcation_date = transcation_date;
        this.transaction_type = transaction_type;
        this.getTransaction_type_second = getTransaction_type_second;
        this.amount = amount;
        this.transfer_id = transfer_id;
    }

    public String getUser_login_id() {
        return user_login_id;
    }

    public void setUser_login_id(String user_login_id) {
        this.user_login_id = user_login_id;
    }

    public Date getTranscation_date() {
        return transcation_date;
    }

    public void setTranscation_date(Date transcation_date) {
        this.transcation_date = transcation_date;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getGetTransaction_type_second() {
        return getTransaction_type_second;
    }

    public void setGetTransaction_type_second(String getTransaction_type_second) {
        this.getTransaction_type_second = getTransaction_type_second;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransfer_id() {
        return transfer_id;
    }

    public void setTransfer_id(String transfer_id) {
        this.transfer_id = transfer_id;
    }
}
