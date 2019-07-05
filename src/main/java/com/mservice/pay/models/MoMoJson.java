package com.mservice.pay.models;

import lombok.Builder;

public class MoMoJson {

    private String partnerCode;
    private String partnerRefId;
    private String momoTransId;
    private Long amount;
    private String description;
    private Long transid;
    private String phoneNumber;
    private Integer status;
    private String message;
    private String billId;
    private Long discountAmount;
    private Long fee;
    private String customerName;
    private String storeId;
    private String requestDate;
    private String responseDate;

    @Builder
    public MoMoJson(String partnerCode, String partnerRefId, String momoTransId, Long amount, String description, Long transid, String phoneNumber, Integer status, String message, String billId, Long transId, Long discountAmount, Long fee, String customerName, String storeId, String requestDate, String responseDate) {
        this.partnerCode = partnerCode;
        this.partnerRefId = partnerRefId;
        this.momoTransId = momoTransId;
        this.amount = amount;
        this.description = description;
        this.transid = transid;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.message = message;
        this.billId = billId;
        this.discountAmount = discountAmount;
        this.fee = fee;
        this.customerName = customerName;
        this.storeId = storeId;
        this.requestDate = requestDate;
        this.responseDate = responseDate;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public String getPartnerRefId() {
        return partnerRefId;
    }

    public void setPartnerRefId(String partnerRefId) {
        this.partnerRefId = partnerRefId;
    }

    public String getMomoTransId() {
        return momoTransId;
    }

    public void setMomoTransId(String momoTransId) {
        this.momoTransId = momoTransId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTransid() {
        return transid;
    }

    public void setTransid(Long transid) {
        this.transid = transid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }
}