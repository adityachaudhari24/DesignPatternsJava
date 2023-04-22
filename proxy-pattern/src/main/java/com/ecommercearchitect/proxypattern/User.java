package com.ecommercearchitect.proxypattern;

public class User {
    private String username;
    private String password;
    private int paymentRequestsCount;
    private boolean authorized;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.paymentRequestsCount = 0;
        this.authorized = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPaymentRequestsCount() {
        return paymentRequestsCount;
    }

    public void incrementPaymentRequestsCount() {
        paymentRequestsCount++;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
}
