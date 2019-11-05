package com.model;

public class Donor {

    private int donorId, userId, stockId, date;

    public Donor() {}
    
    public Donor(int userId, int stockId, int date) {
        this.userId = userId;
        this.stockId = stockId;
        this.date = date;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
}