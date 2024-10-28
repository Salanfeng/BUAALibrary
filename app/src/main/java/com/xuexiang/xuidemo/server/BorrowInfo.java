package com.xuexiang.xuidemo.server;

public class BorrowInfo {
    private String borrowerId;
    private String borrowDate;
    private String returnDate;
    // 构造方法
    public BorrowInfo(String borrowerId, String borrowDate, String returnDate, boolean isReturned) {
        this.borrowerId = borrowerId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Getter和Setter方法
    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }


    @Override
    public String toString() {
        return "BorrowInfo{" +
                "borrowerId='" + borrowerId + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}