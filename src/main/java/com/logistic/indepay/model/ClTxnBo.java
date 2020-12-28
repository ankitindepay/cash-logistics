package com.logistic.indepay.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class ClTxnBo {

  @Id
  private String txnId;
  private String txnType;
  private BigInteger custId;  //BigInt
  private String custType;
  private String channelType;
  private String originatingBank;
  private String bankCustId;
  private Double custGeocodeLat;
  private Double custGeocodeLong;
  private Double targetGeocodeLat;
  private Double targetGeocodeLong;
  private String targetAddress;
  private String targetPincode;
  private String custRefId;
  private Float txnAmount;
  private Float grossAmount;
  private String currencyCode;
  private String feeBreakup;
  private String agentList;
  private BigInteger agentDelno;  //BigInt
  private BigInteger subagentDelno;  //BigInt
  private java.sql.Timestamp otpTsCreated;
  private java.sql.Timestamp otpTsMatched;
  private String finTxnId;
  private Float exchangeRate;
  private String baseCurrencyCode;
  private Float baseTxnAmount;
  private Float baseGrossTxnAmount;
  private String status;
  private String responseCode;
  private java.sql.Timestamp tsCreated;
  private java.sql.Timestamp tsModified;
  private String modifiedHost;
  private String modifiedPort;
  private String custPymntInstrType;
  private String custPymntInstr;
  private String timeSlotCode;
  private String remarks;
  private Float uinRequestCount;
  private Float otpRequestCount;
  private java.sql.Timestamp uinTsCreated;
  private java.sql.Timestamp uinTsMatched;
  private String custNmForFinTxn;
  private String rejectnCode;
  private String rejectnText;
  private Float uinMatchGeocodeLat;
  private Float uinMatchGeocodeLong;
  private Float otpMatchGeocodeLat;
  private Float otpMatchGeocodeLong;
  private Character corpCode;
  private String testTxnId;
  private String orderId;
  private Character txnSubtype;
  private BigInteger beneficiaryId;  //BigInt
  private String parentTxnId;


  public String getTxnId() {
    return txnId;
  }

  public void setTxnId(String txnId) {
    this.txnId = txnId;
  }


  public String getTxnType() {
    return txnType;
  }

  public void setTxnType(String txnType) {
    this.txnType = txnType;
  }


  public BigInteger getCustId() {
    return custId;
  }

  public void setCustId(BigInteger custId) {
    this.custId = custId;
  }


  public String getCustType() {
    return custType;
  }

  public void setCustType(String custType) {
    this.custType = custType;
  }


  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public String getOriginatingBank() {
    return originatingBank;
  }

  public void setOriginatingBank(String originatingBank) {
    this.originatingBank = originatingBank;
  }


  public String getBankCustId() {
    return bankCustId;
  }

  public void setBankCustId(String bankCustId) {
    this.bankCustId = bankCustId;
  }


  public Double getCustGeocodeLat() {
    return custGeocodeLat;
  }

  public void setCustGeocodeLat(Double custGeocodeLat) {
    this.custGeocodeLat = custGeocodeLat;
  }


  public Double getCustGeocodeLong() {
    return custGeocodeLong;
  }

  public void setCustGeocodeLong(Double custGeocodeLong) {
    this.custGeocodeLong = custGeocodeLong;
  }


  public Double getTargetGeocodeLat() {
    return targetGeocodeLat;
  }

  public void setTargetGeocodeLat(Double targetGeocodeLat) {
    this.targetGeocodeLat = targetGeocodeLat;
  }


  public Double getTargetGeocodeLong() {
    return targetGeocodeLong;
  }

  public void setTargetGeocodeLong(Double targetGeocodeLong) {
    this.targetGeocodeLong = targetGeocodeLong;
  }


  public String getTargetAddress() {
    return targetAddress;
  }

  public void setTargetAddress(String targetAddress) {
    this.targetAddress = targetAddress;
  }


  public String getTargetPincode() {
    return targetPincode;
  }

  public void setTargetPincode(String targetPincode) {
    this.targetPincode = targetPincode;
  }


  public String getCustRefId() {
    return custRefId;
  }

  public void setCustRefId(String custRefId) {
    this.custRefId = custRefId;
  }


  public Float getTxnAmount() {
    return txnAmount;
  }

  public void setTxnAmount(Float txnAmount) {
    this.txnAmount = txnAmount;
  }


  public Float getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(Float grossAmount) {
    this.grossAmount = grossAmount;
  }


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public String getFeeBreakup() {
    return feeBreakup;
  }

  public void setFeeBreakup(String feeBreakup) {
    this.feeBreakup = feeBreakup;
  }


  public String getAgentList() {
    return agentList;
  }

  public void setAgentList(String agentList) {
    this.agentList = agentList;
  }


  public BigInteger getAgentDelno() {
    return agentDelno;
  }

  public void setAgentDelno(BigInteger agentDelno) {
    this.agentDelno = agentDelno;
  }


  public BigInteger getSubagentDelno() {
    return subagentDelno;
  }

  public void setSubagentDelno(BigInteger subagentDelno) {
    this.subagentDelno = subagentDelno;
  }


  public java.sql.Timestamp getOtpTsCreated() {
    return otpTsCreated;
  }

  public void setOtpTsCreated(java.sql.Timestamp otpTsCreated) {
    this.otpTsCreated = otpTsCreated;
  }


  public java.sql.Timestamp getOtpTsMatched() {
    return otpTsMatched;
  }

  public void setOtpTsMatched(java.sql.Timestamp otpTsMatched) {
    this.otpTsMatched = otpTsMatched;
  }


  public String getFinTxnId() {
    return finTxnId;
  }

  public void setFinTxnId(String finTxnId) {
    this.finTxnId = finTxnId;
  }


  public Float getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(Float exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public String getBaseCurrencyCode() {
    return baseCurrencyCode;
  }

  public void setBaseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
  }


  public Float getBaseTxnAmount() {
    return baseTxnAmount;
  }

  public void setBaseTxnAmount(Float baseTxnAmount) {
    this.baseTxnAmount = baseTxnAmount;
  }


  public Float getBaseGrossTxnAmount() {
    return baseGrossTxnAmount;
  }

  public void setBaseGrossTxnAmount(Float baseGrossTxnAmount) {
    this.baseGrossTxnAmount = baseGrossTxnAmount;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  public java.sql.Timestamp getTsCreated() {
    return tsCreated;
  }

  public void setTsCreated(java.sql.Timestamp tsCreated) {
    this.tsCreated = tsCreated;
  }


  public java.sql.Timestamp getTsModified() {
    return tsModified;
  }

  public void setTsModified(java.sql.Timestamp tsModified) {
    this.tsModified = tsModified;
  }


  public String getModifiedHost() {
    return modifiedHost;
  }

  public void setModifiedHost(String modifiedHost) {
    this.modifiedHost = modifiedHost;
  }


  public String getModifiedPort() {
    return modifiedPort;
  }

  public void setModifiedPort(String modifiedPort) {
    this.modifiedPort = modifiedPort;
  }


  public String getCustPymntInstrType() {
    return custPymntInstrType;
  }

  public void setCustPymntInstrType(String custPymntInstrType) {
    this.custPymntInstrType = custPymntInstrType;
  }


  public String getCustPymntInstr() {
    return custPymntInstr;
  }

  public void setCustPymntInstr(String custPymntInstr) {
    this.custPymntInstr = custPymntInstr;
  }


  public String getTimeSlotCode() {
    return timeSlotCode;
  }

  public void setTimeSlotCode(String timeSlotCode) {
    this.timeSlotCode = timeSlotCode;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Float getUinRequestCount() {
    return uinRequestCount;
  }

  public void setUinRequestCount(Float uinRequestCount) {
    this.uinRequestCount = uinRequestCount;
  }


  public Float getOtpRequestCount() {
    return otpRequestCount;
  }

  public void setOtpRequestCount(Float otpRequestCount) {
    this.otpRequestCount = otpRequestCount;
  }


  public java.sql.Timestamp getUinTsCreated() {
    return uinTsCreated;
  }

  public void setUinTsCreated(java.sql.Timestamp uinTsCreated) {
    this.uinTsCreated = uinTsCreated;
  }


  public java.sql.Timestamp getUinTsMatched() {
    return uinTsMatched;
  }

  public void setUinTsMatched(java.sql.Timestamp uinTsMatched) {
    this.uinTsMatched = uinTsMatched;
  }


  public String getCustNmForFinTxn() {
    return custNmForFinTxn;
  }

  public void setCustNmForFinTxn(String custNmForFinTxn) {
    this.custNmForFinTxn = custNmForFinTxn;
  }


  public String getRejectnCode() {
    return rejectnCode;
  }

  public void setRejectnCode(String rejectnCode) {
    this.rejectnCode = rejectnCode;
  }


  public String getRejectnText() {
    return rejectnText;
  }

  public void setRejectnText(String rejectnText) {
    this.rejectnText = rejectnText;
  }


  public Float getUinMatchGeocodeLat() {
    return uinMatchGeocodeLat;
  }

  public void setUinMatchGeocodeLat(Float uinMatchGeocodeLat) {
    this.uinMatchGeocodeLat = uinMatchGeocodeLat;
  }


  public Float getUinMatchGeocodeLong() {
    return uinMatchGeocodeLong;
  }

  public void setUinMatchGeocodeLong(Float uinMatchGeocodeLong) {
    this.uinMatchGeocodeLong = uinMatchGeocodeLong;
  }


  public Float getOtpMatchGeocodeLat() {
    return otpMatchGeocodeLat;
  }

  public void setOtpMatchGeocodeLat(Float otpMatchGeocodeLat) {
    this.otpMatchGeocodeLat = otpMatchGeocodeLat;
  }


  public Float getOtpMatchGeocodeLong() {
    return otpMatchGeocodeLong;
  }

  public void setOtpMatchGeocodeLong(Float otpMatchGeocodeLong) {
    this.otpMatchGeocodeLong = otpMatchGeocodeLong;
  }


  public Character getCorpCode() {
    return corpCode;
  }

  public void setCorpCode(Character corpCode) {
    this.corpCode = corpCode;
  }


  public String getTestTxnId() {
    return testTxnId;
  }

  public void setTestTxnId(String testTxnId) {
    this.testTxnId = testTxnId;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Character getTxnSubtype() {
    return txnSubtype;
  }

  public void setTxnSubtype(Character txnSubtype) {
    this.txnSubtype = txnSubtype;
  }


  public BigInteger getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(BigInteger beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  public String getParentTxnId() {
    return parentTxnId;
  }

  public void setParentTxnId(String parentTxnId) {
    this.parentTxnId = parentTxnId;
  }

}
