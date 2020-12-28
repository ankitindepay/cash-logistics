package com.logistic.indepay.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClUserDetails {

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
  private String status;
  private java.sql.Timestamp crtnTs;
  private java.sql.Timestamp lstUpdTs;
  private String pincode;
  private String merchantTncAccepted;
  private String currAppVersion;
  private String corpCode;
  private String storeTypeId;
  private String franchiseTypeId;
  private String kycStatus;
  private java.sql.Timestamp kycUpdatedOn;
  private String avgDailyDepoAmt;
  private String avgDailyDepoAmtUpdUsr;
  private String locale;
  private String areaName;
  private String cityName;
  private String shopNo;
  private String blockName;
  private Long delNo;


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


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public java.sql.Timestamp getCrtnTs() {
    return crtnTs;
  }

  public void setCrtnTs(java.sql.Timestamp crtnTs) {
    this.crtnTs = crtnTs;
  }


  public java.sql.Timestamp getLstUpdTs() {
    return lstUpdTs;
  }

  public void setLstUpdTs(java.sql.Timestamp lstUpdTs) {
    this.lstUpdTs = lstUpdTs;
  }


  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  public String getMerchantTncAccepted() {
    return merchantTncAccepted;
  }

  public void setMerchantTncAccepted(String merchantTncAccepted) {
    this.merchantTncAccepted = merchantTncAccepted;
  }


  public String getCurrAppVersion() {
    return currAppVersion;
  }

  public void setCurrAppVersion(String currAppVersion) {
    this.currAppVersion = currAppVersion;
  }


  public String getCorpCode() {
    return corpCode;
  }

  public void setCorpCode(String corpCode) {
    this.corpCode = corpCode;
  }


  public String getStoreTypeId() {
    return storeTypeId;
  }

  public void setStoreTypeId(String storeTypeId) {
    this.storeTypeId = storeTypeId;
  }


  public String getFranchiseTypeId() {
    return franchiseTypeId;
  }

  public void setFranchiseTypeId(String franchiseTypeId) {
    this.franchiseTypeId = franchiseTypeId;
  }


  public String getKycStatus() {
    return kycStatus;
  }

  public void setKycStatus(String kycStatus) {
    this.kycStatus = kycStatus;
  }


  public java.sql.Timestamp getKycUpdatedOn() {
    return kycUpdatedOn;
  }

  public void setKycUpdatedOn(java.sql.Timestamp kycUpdatedOn) {
    this.kycUpdatedOn = kycUpdatedOn;
  }


  public String getAvgDailyDepoAmt() {
    return avgDailyDepoAmt;
  }

  public void setAvgDailyDepoAmt(String avgDailyDepoAmt) {
    this.avgDailyDepoAmt = avgDailyDepoAmt;
  }


  public String getAvgDailyDepoAmtUpdUsr() {
    return avgDailyDepoAmtUpdUsr;
  }

  public void setAvgDailyDepoAmtUpdUsr(String avgDailyDepoAmtUpdUsr) {
    this.avgDailyDepoAmtUpdUsr = avgDailyDepoAmtUpdUsr;
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


  public Long getDelNo() {
    return delNo;
  }

  public void setDelNo(Long delNo) {
    this.delNo = delNo;
  }

  public ClUserDetails() {
  }
}
