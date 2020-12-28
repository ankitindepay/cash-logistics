package com.logistic.indepay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Merchant {

  @Id
  private Long id;
  private String pin;
  private Long delno;
  private String name;
  private String add1;
  private String add2;
  private String add3;
  private String city;
  private String state;
  private Long pincode;
  private Long telephoneno;
  private String status;
  private java.sql.Timestamp ts;
  private java.sql.Timestamp created;
  private String shopname;
  private Long forcePinChange;
  private Long isshared;
  private String blockedmenus;
  private String allowedmenus;
  private String merchanttype;
  private String distributor;
  private Long serviceproviderid;
  private String zone;
  private Long cafno;
  private Long bankformno;
  private Long faxno;
  private Long alternatecontactno;
  private String emailid;
  private java.sql.Timestamp formfilldate;
  private String utsn;
  private String remarks;
  private java.sql.Timestamp pinresetdate;
  private String irctcregstatus;
  private Long faillogincount;
  private String isactivated;
  private String devicetype;
  private Long accountNo;
  private String apkVersion;
  private java.sql.Timestamp apkVersionLastModified;
  private String otp;
  private java.sql.Timestamp otpTs;
  private String accessform;
  private String gstnumber;
  private String pannumber;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }


  public Long getDelno() {
    return delno;
  }

  public void setDelno(Long delno) {
    this.delno = delno;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAdd1() {
    return add1;
  }

  public void setAdd1(String add1) {
    this.add1 = add1;
  }


  public String getAdd2() {
    return add2;
  }

  public void setAdd2(String add2) {
    this.add2 = add2;
  }


  public String getAdd3() {
    return add3;
  }

  public void setAdd3(String add3) {
    this.add3 = add3;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Long getPincode() {
    return pincode;
  }

  public void setPincode(Long pincode) {
    this.pincode = pincode;
  }


  public Long getTelephoneno() {
    return telephoneno;
  }

  public void setTelephoneno(Long telephoneno) {
    this.telephoneno = telephoneno;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public java.sql.Timestamp getTs() {
    return ts;
  }

  public void setTs(java.sql.Timestamp ts) {
    this.ts = ts;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
  }


  public Long getForcePinChange() {
    return forcePinChange;
  }

  public void setForcePinChange(Long forcePinChange) {
    this.forcePinChange = forcePinChange;
  }


  public Long getIsshared() {
    return isshared;
  }

  public void setIsshared(Long isshared) {
    this.isshared = isshared;
  }


  public String getBlockedmenus() {
    return blockedmenus;
  }

  public void setBlockedmenus(String blockedmenus) {
    this.blockedmenus = blockedmenus;
  }


  public String getAllowedmenus() {
    return allowedmenus;
  }

  public void setAllowedmenus(String allowedmenus) {
    this.allowedmenus = allowedmenus;
  }


  public String getMerchanttype() {
    return merchanttype;
  }

  public void setMerchanttype(String merchanttype) {
    this.merchanttype = merchanttype;
  }


  public String getDistributor() {
    return distributor;
  }

  public void setDistributor(String distributor) {
    this.distributor = distributor;
  }


  public Long getServiceproviderid() {
    return serviceproviderid;
  }

  public void setServiceproviderid(Long serviceproviderid) {
    this.serviceproviderid = serviceproviderid;
  }


  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  public Long getCafno() {
    return cafno;
  }

  public void setCafno(Long cafno) {
    this.cafno = cafno;
  }


  public Long getBankformno() {
    return bankformno;
  }

  public void setBankformno(Long bankformno) {
    this.bankformno = bankformno;
  }


  public Long getFaxno() {
    return faxno;
  }

  public void setFaxno(Long faxno) {
    this.faxno = faxno;
  }


  public Long getAlternatecontactno() {
    return alternatecontactno;
  }

  public void setAlternatecontactno(Long alternatecontactno) {
    this.alternatecontactno = alternatecontactno;
  }


  public String getEmailid() {
    return emailid;
  }

  public void setEmailid(String emailid) {
    this.emailid = emailid;
  }


  public java.sql.Timestamp getFormfilldate() {
    return formfilldate;
  }

  public void setFormfilldate(java.sql.Timestamp formfilldate) {
    this.formfilldate = formfilldate;
  }


  public String getUtsn() {
    return utsn;
  }

  public void setUtsn(String utsn) {
    this.utsn = utsn;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public java.sql.Timestamp getPinresetdate() {
    return pinresetdate;
  }

  public void setPinresetdate(java.sql.Timestamp pinresetdate) {
    this.pinresetdate = pinresetdate;
  }


  public String getIrctcregstatus() {
    return irctcregstatus;
  }

  public void setIrctcregstatus(String irctcregstatus) {
    this.irctcregstatus = irctcregstatus;
  }


  public Long getFaillogincount() {
    return faillogincount;
  }

  public void setFaillogincount(Long faillogincount) {
    this.faillogincount = faillogincount;
  }


  public String getIsactivated() {
    return isactivated;
  }

  public void setIsactivated(String isactivated) {
    this.isactivated = isactivated;
  }


  public String getDevicetype() {
    return devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype;
  }


  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public String getApkVersion() {
    return apkVersion;
  }

  public void setApkVersion(String apkVersion) {
    this.apkVersion = apkVersion;
  }


  public java.sql.Timestamp getApkVersionLastModified() {
    return apkVersionLastModified;
  }

  public void setApkVersionLastModified(java.sql.Timestamp apkVersionLastModified) {
    this.apkVersionLastModified = apkVersionLastModified;
  }


  public String getOtp() {
    return otp;
  }

  public void setOtp(String otp) {
    this.otp = otp;
  }


  public java.sql.Timestamp getOtpTs() {
    return otpTs;
  }

  public void setOtpTs(java.sql.Timestamp otpTs) {
    this.otpTs = otpTs;
  }


  public String getAccessform() {
    return accessform;
  }

  public void setAccessform(String accessform) {
    this.accessform = accessform;
  }


  public String getGstnumber() {
    return gstnumber;
  }

  public void setGstnumber(String gstnumber) {
    this.gstnumber = gstnumber;
  }


  public String getPannumber() {
    return pannumber;
  }

  public void setPannumber(String pannumber) {
    this.pannumber = pannumber;
  }

  @Override
  public String toString() {
    return "Merchant{" +
            "id=" + id +
            ", pin='" + pin + '\'' +
            ", delno=" + delno +
            ", name='" + name + '\'' +
            ", add1='" + add1 + '\'' +
            ", add2='" + add2 + '\'' +
            ", add3='" + add3 + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", pincode=" + pincode +
            ", telephoneno=" + telephoneno +
            ", status='" + status + '\'' +
            ", ts=" + ts +
            ", created=" + created +
            ", shopname='" + shopname + '\'' +
            ", forcePinChange=" + forcePinChange +
            ", isshared=" + isshared +
            ", blockedmenus='" + blockedmenus + '\'' +
            ", allowedmenus='" + allowedmenus + '\'' +
            ", merchanttype='" + merchanttype + '\'' +
            ", distributor='" + distributor + '\'' +
            ", serviceproviderid=" + serviceproviderid +
            ", zone='" + zone + '\'' +
            ", cafno=" + cafno +
            ", bankformno=" + bankformno +
            ", faxno=" + faxno +
            ", alternatecontactno=" + alternatecontactno +
            ", emailid='" + emailid + '\'' +
            ", formfilldate=" + formfilldate +
            ", utsn='" + utsn + '\'' +
            ", remarks='" + remarks + '\'' +
            ", pinresetdate=" + pinresetdate +
            ", irctcregstatus='" + irctcregstatus + '\'' +
            ", faillogincount=" + faillogincount +
            ", isactivated='" + isactivated + '\'' +
            ", devicetype='" + devicetype + '\'' +
            ", accountNo=" + accountNo +
            ", apkVersion='" + apkVersion + '\'' +
            ", apkVersionLastModified=" + apkVersionLastModified +
            ", otp='" + otp + '\'' +
            ", otpTs=" + otpTs +
            ", accessform='" + accessform + '\'' +
            ", gstnumber='" + gstnumber + '\'' +
            ", pannumber='" + pannumber + '\'' +
            '}';
  }
}
