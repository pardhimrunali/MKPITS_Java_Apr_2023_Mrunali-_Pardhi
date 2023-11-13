package com.example.sbibank;

public class AccountRegister {
    private String login_id;
    private String user_password;
    private String user_name;
    private String user_address;
    private String user_city;
    private String user_email;
    private double user_balance;

    public AccountRegister() {
    }

    public AccountRegister(String login_id, String user_password, String user_name, String user_address, String user_city, String user_email, double user_balance) {

        this.login_id = login_id;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_address = user_address;
        this.user_city = user_city;
        this.user_email = user_email;
        this.user_balance = user_balance;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public double getUser_balance() {
        return user_balance;
    }

    public void setUser_balance(double user_balance) {
        this.user_balance = user_balance;
    }
}
