package com.shangpin.iog.dto;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * SKU
 */
public class SKU implements Serializable {
    
    
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
	
    
    private String sPUID;
	
	/**
	 *getter sPUID
	 */
	public String getSPUID() {
    	return sPUID;
    }
	
	/**
	 *setter sPUID
	 */
	public void setSPUID(String sPUID) {
    	this.sPUID = sPUID;
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
	
    
    private String pRODUCTNAME;
	
	/**
	 *getter pRODUCTNAME
	 */
	public String getPRODUCTNAME() {
    	return pRODUCTNAME;
    }
	
	/**
	 *setter pRODUCTNAME
	 */
	public void setPRODUCTNAME(String pRODUCTNAME) {
    	this.pRODUCTNAME = pRODUCTNAME;
    }
	
    
    private String sUPPLIERPRICE;
	
	/**
	 *getter sUPPLIERPRICE
	 */
	public String getSUPPLIERPRICE() {
    	return sUPPLIERPRICE;
    }
	
	/**
	 *setter sUPPLIERPRICE
	 */
	public void setSUPPLIERPRICE(String sUPPLIERPRICE) {
    	this.sUPPLIERPRICE = sUPPLIERPRICE;
    }
	
    
    private String bARCODE;
	
	/**
	 *getter bARCODE
	 */
	public String getBARCODE() {
    	return bARCODE;
    }
	
	/**
	 *setter bARCODE
	 */
	public void setBARCODE(String bARCODE) {
    	this.bARCODE = bARCODE;
    }
	
    
    private String pRODUCTCODE;
	
	/**
	 *getter pRODUCTCODE
	 */
	public String getPRODUCTCODE() {
    	return pRODUCTCODE;
    }
	
	/**
	 *setter pRODUCTCODE
	 */
	public void setPRODUCTCODE(String pRODUCTCODE) {
    	this.pRODUCTCODE = pRODUCTCODE;
    }
	
    
    private String cOLOR;
	
	/**
	 *getter cOLOR
	 */
	public String getCOLOR() {
    	return cOLOR;
    }
	
	/**
	 *setter cOLOR
	 */
	public void setCOLOR(String cOLOR) {
    	this.cOLOR = cOLOR;
    }
	
    
    private String pRODUCTDESCRIBE;
	
	/**
	 *getter pRODUCTDESCRIBE
	 */
	public String getPRODUCTDESCRIBE() {
    	return pRODUCTDESCRIBE;
    }
	
	/**
	 *setter pRODUCTDESCRIBE
	 */
	public void setPRODUCTDESCRIBE(String pRODUCTDESCRIBE) {
    	this.pRODUCTDESCRIBE = pRODUCTDESCRIBE;
    }
	
    
    private String sALECURRENCY;
	
	/**
	 *getter sALECURRENCY
	 */
	public String getSALECURRENCY() {
    	return sALECURRENCY;
    }
	
	/**
	 *setter sALECURRENCY
	 */
	public void setSALECURRENCY(String sALECURRENCY) {
    	this.sALECURRENCY = sALECURRENCY;
    }
	
    
    private String pRODUCTSIZE;
	
	/**
	 *getter pRODUCTSIZE
	 */
	public String getPRODUCTSIZE() {
    	return pRODUCTSIZE;
    }
	
	/**
	 *setter pRODUCTSIZE
	 */
	public void setPRODUCTSIZE(String pRODUCTSIZE) {
    	this.pRODUCTSIZE = pRODUCTSIZE;
    }
	
    
    private String sTOCK;
	
	/**
	 *getter sTOCK
	 */
	public String getSTOCK() {
    	return sTOCK;
    }
	
	/**
	 *setter sTOCK
	 */
	public void setSTOCK(String sTOCK) {
    	this.sTOCK = sTOCK;
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
