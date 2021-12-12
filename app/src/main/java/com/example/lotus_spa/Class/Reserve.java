package com.example.lotus_spa.Class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reserve {

    @SerializedName("resCode")
    @Expose
    private int resCode;

    @SerializedName("resValidity")
    @Expose
    private String resValidity;

    @SerializedName("resAmount")
    @Expose
    private int resAmount;

    @SerializedName("statusReserve")
    @Expose
    private char statusReserve;

    @SerializedName("isDeleted")
    @Expose
    private char isDeleted;

    @SerializedName("custCPF")
    @Expose
    private String custCPF;

    @SerializedName("packCode")
    @Expose
    private int packCode;

    @SerializedName("payDate")
    @Expose
    private String payDate;

    @SerializedName("payValue")
    @Expose
    private String payValue;

    @SerializedName("statusPayment")
    @Expose
    private char statusPayment;

    @SerializedName("payOption")
    @Expose
    private String payOption;

    public Reserve() {
    }

    public Reserve(int resCode, String resValidity, int resAmount, char statusReserve, char isDeleted, String custCPF, int packCode, String payDate, String payValue, char statusPayment, String payOption) {
        this.resCode = resCode;
        this.resValidity = resValidity;
        this.resAmount = resAmount;
        this.statusReserve = statusReserve;
        this.isDeleted = isDeleted;
        this.custCPF = custCPF;
        this.packCode = packCode;
        this.payDate = payDate;
        this.payValue = payValue;
        this.statusPayment = statusPayment;
        this.payOption = payOption;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResValidity() {
        return resValidity;
    }

    public void setResValidity(String resValidity) {
        this.resValidity = resValidity;
    }

    public int getResAmount() {
        return resAmount;
    }

    public void setResAmount(int resAmount) {
        this.resAmount = resAmount;
    }

    public char getStatusReserve() {
        return statusReserve;
    }

    public void setStatusReserve(char statusReserve) {
        this.statusReserve = statusReserve;
    }

    public char getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(char isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCustCPF() {
        return custCPF;
    }

    public void setCustCPF(String custCPF) {
        this.custCPF = custCPF;
    }

    public int getPackCode() {
        return packCode;
    }

    public void setPackCode(int packCode) {
        this.packCode = packCode;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getPayValue() {
        return payValue;
    }

    public void setPayValue(String payValue) {
        this.payValue = payValue;
    }

    public char getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(char statusPayment) {
        this.statusPayment = statusPayment;
    }

    public String getPayOption() {
        return payOption;
    }

    public void setPayOption(String payOption) {
        this.payOption = payOption;
    }
}
