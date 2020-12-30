package com.logistic.indepay.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class CustomDetails {
    @Id
    private Long userId;
    private String customerType;
    private String emailId;
    private String firstName;
    private String lastName;
    private String shopName;
    private String shopCategoryCode;
    private String shopLandmark;
    private String address;
    private String areaCode;
    private String dateOfBirth;
    private String gender;
    private String storeTypeId;
    private String locale;
    private String areaName;
    private String cityName;
    private String shopNo;
    private String blockName;
    private BigInteger docId;
    private String docType;
    private String documentName;
    private BigInteger accountId;
    private Character pmtinstrumentType;
    private String vpa;
    private String accountNumber;
    private String accountHolderName;
    private String ifsc;
    private Character status;
    private BigInteger outletId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopCategoryCode() {
        return shopCategoryCode;
    }

    public void setShopCategoryCode(String shopCategoryCode) {
        this.shopCategoryCode = shopCategoryCode;
    }

    public String getShopLandmark() {
        return shopLandmark;
    }

    public void setShopLandmark(String shopLandmark) {
        this.shopLandmark = shopLandmark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(String storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public BigInteger getDocId() {
        return docId;
    }

    public void setDocId(BigInteger docId) {
        this.docId = docId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public BigInteger getAccountId() {
        return accountId;
    }

    public void setAccountId(BigInteger accountId) {
        this.accountId = accountId;
    }

    public Character getPmtinstrumentType() {
        return pmtinstrumentType;
    }

    public void setPmtinstrumentType(Character pmtinstrumentType) {
        this.pmtinstrumentType = pmtinstrumentType;
    }

    public String getVpa() {
        return vpa;
    }

    public void setVpa(String vpa) {
        this.vpa = vpa;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public BigInteger getOutletId() {
        return outletId;
    }

    public void setOutletId(BigInteger outletId) {
        this.outletId = outletId;
    }

    @Override
    public String toString() {
        return "CustomDetails{" +
                "userId=" + userId +
                ", customerType='" + customerType + '\'' +
                ", emailId='" + emailId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopCategoryCode='" + shopCategoryCode + '\'' +
                ", shopLandmark='" + shopLandmark + '\'' +
                ", address='" + address + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", storeTypeId='" + storeTypeId + '\'' +
                ", locale='" + locale + '\'' +
                ", areaName='" + areaName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", blockName='" + blockName + '\'' +
                ", docId=" + docId +
                ", docType='" + docType + '\'' +
                ", documentName='" + documentName + '\'' +
                ", accountId=" + accountId +
                ", pmtinstrumentType=" + pmtinstrumentType +
                ", vpa='" + vpa + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", status=" + status +
                ", outletId=" + outletId +
                '}';
    }
}
