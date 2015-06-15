package com.shangpin.iog.dto;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * SPU
 */
public class SPU implements Serializable {
    
    
    private String iD;
	
	/**
	 *getter iD
	 */
	public String getID() {
    	return iD;
    }
	
	/**
	 *setter iD
	 */
	public void setID(String iD) {
    	this.iD = iD;
    }
	
    
    private String sUPPLIERID;
	
	/**
	 *getter sUPPLIERID
	 */
	public String getSUPPLIERID() {
    	return sUPPLIERID;
    }
	
	/**
	 *setter sUPPLIERID
	 */
	public void setSUPPLIERID(String sUPPLIERID) {
    	this.sUPPLIERID = sUPPLIERID;
    }
	
    
    private String iD;
	
	/**
	 *getter iD
	 */
	public String getID() {
    	return iD;
    }
	
	/**
	 *setter iD
	 */
	public void setID(String iD) {
    	this.iD = iD;
    }
	
    
    private String nAME;
	
	/**
	 *getter nAME
	 */
	public String getNAME() {
    	return nAME;
    }
	
	/**
	 *setter nAME
	 */
	public void setNAME(String nAME) {
    	this.nAME = nAME;
    }
	
    
    private String cATEGORYID;
	
	/**
	 *getter cATEGORYID
	 */
	public String getCATEGORYID() {
    	return cATEGORYID;
    }
	
	/**
	 *setter cATEGORYID
	 */
	public void setCATEGORYID(String cATEGORYID) {
    	this.cATEGORYID = cATEGORYID;
    }
	
    
    private String cATEGORYNAME;
	
	/**
	 *getter cATEGORYNAME
	 */
	public String getCATEGORYNAME() {
    	return cATEGORYNAME;
    }
	
	/**
	 *setter cATEGORYNAME
	 */
	public void setCATEGORYNAME(String cATEGORYNAME) {
    	this.cATEGORYNAME = cATEGORYNAME;
    }
	
    
    private String bRANDID;
	
	/**
	 *getter bRANDID
	 */
	public String getBRANDID() {
    	return bRANDID;
    }
	
	/**
	 *setter bRANDID
	 */
	public void setBRANDID(String bRANDID) {
    	this.bRANDID = bRANDID;
    }
	
    
    private String bRANDNAME;
	
	/**
	 *getter bRANDNAME
	 */
	public String getBRANDNAME() {
    	return bRANDNAME;
    }
	
	/**
	 *setter bRANDNAME
	 */
	public void setBRANDNAME(String bRANDNAME) {
    	this.bRANDNAME = bRANDNAME;
    }
	
    
    private String sEASONID;
	
	/**
	 *getter sEASONID
	 */
	public String getSEASONID() {
    	return sEASONID;
    }
	
	/**
	 *setter sEASONID
	 */
	public void setSEASONID(String sEASONID) {
    	this.sEASONID = sEASONID;
    }
	
    
    private String sEASONNAME;
	
	/**
	 *getter sEASONNAME
	 */
	public String getSEASONNAME() {
    	return sEASONNAME;
    }
	
	/**
	 *setter sEASONNAME
	 */
	public void setSEASONNAME(String sEASONNAME) {
    	this.sEASONNAME = sEASONNAME;
    }
	
    
    private String pICURL;
	
	/**
	 *getter pICURL
	 */
	public String getPICURL() {
    	return pICURL;
    }
	
	/**
	 *setter pICURL
	 */
	public void setPICURL(String pICURL) {
    	this.pICURL = pICURL;
    }
	
    
    private String mATERIAL;
	
	/**
	 *getter mATERIAL
	 */
	public String getMATERIAL() {
    	return mATERIAL;
    }
	
	/**
	 *setter mATERIAL
	 */
	public void setMATERIAL(String mATERIAL) {
    	this.mATERIAL = mATERIAL;
    }
	
    
    private String pRODUCTORIGIN;
	
	/**
	 *getter pRODUCTORIGIN
	 */
	public String getPRODUCTORIGIN() {
    	return pRODUCTORIGIN;
    }
	
	/**
	 *setter pRODUCTORIGIN
	 */
	public void setPRODUCTORIGIN(String pRODUCTORIGIN) {
    	this.pRODUCTORIGIN = pRODUCTORIGIN;
    }
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cREATETIME;
	
	/**
	 *getter cREATETIME
	 */
	public Date getCREATETIME() {
    	return cREATETIME;
    }
	
	/**
	 *setter cREATETIME
	 */
	public void setCREATETIME(Date cREATETIME) {
    	this.cREATETIME = cREATETIME;
    }
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lASTTIME;
	
	/**
	 *getter lASTTIME
	 */
	public Date getLASTTIME() {
    	return lASTTIME;
    }
	
	/**
	 *setter lASTTIME
	 */
	public void setLASTTIME(Date lASTTIME) {
    	this.lASTTIME = lASTTIME;
    }
	

}
