package com.example.managementofbankjspservices;

public class AccountUserRegister {
    private String user_id;
    private String user_password;
    private String name;
    private String address;
    private String city;
    private String email;
    private double balance;

    public AccountUserRegister() {
    }

    public AccountUserRegister(String user_id, String user_password, String name, String address, String city, String email, double balance) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.name = name;
        this.address = address;
        this.city = city;
        this.email = email;
        this.balance = balance;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
