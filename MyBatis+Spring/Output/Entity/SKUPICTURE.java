package com.shangpin.iog.dto;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * SKUPICTURE
 */
public class SKUPICTURE implements Serializable {
    
    
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
	
    
    private String sKUID;
	
	/**
	 *getter sKUID
	 */
	public String getSKUID() {
    	return sKUID;
    }
	
	/**
	 *setter sKUID
	 */
	public void setSKUID(String sKUID) {
    	this.sKUID = sKUID;
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
	

}
