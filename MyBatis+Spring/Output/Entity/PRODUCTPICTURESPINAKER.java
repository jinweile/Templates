package com.shangpin.iog.dto;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * PRODUCTPICTURESPINAKER
 */
public class PRODUCTPICTURESPINAKER implements Serializable {
    
    
    private Integer id;
	
	/**
	 *getter id
	 */
	public Integer getId() {
    	return id;
    }
	
	/**
	 *setter id
	 */
	public void setId(Integer id) {
    	this.id = id;
    }
	
    
    private Integer productId;
	
	/**
	 *getter productId
	 */
	public Integer getProductId() {
    	return productId;
    }
	
	/**
	 *setter productId
	 */
	public void setProductId(Integer productId) {
    	this.productId = productId;
    }
	
    
    private Integer itemId;
	
	/**
	 *getter itemId
	 */
	public Integer getItemId() {
    	return itemId;
    }
	
	/**
	 *setter itemId
	 */
	public void setItemId(Integer itemId) {
    	this.itemId = itemId;
    }
	
    
    private String url;
	
	/**
	 *getter url
	 */
	public String getUrl() {
    	return url;
    }
	
	/**
	 *setter url
	 */
	public void setUrl(String url) {
    	this.url = url;
    }
	

}
