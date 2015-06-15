package com.shangpin.iog.dto;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * PRODUCTSPINAKER
 */
public class PRODUCTSPINAKER implements Serializable {
    
    
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
	
    
    private String producerId;
	
	/**
	 *getter producerId
	 */
	public String getProducerId() {
    	return producerId;
    }
	
	/**
	 *setter producerId
	 */
	public void setProducerId(String producerId) {
    	this.producerId = producerId;
    }
	
    
    private String type;
	
	/**
	 *getter type
	 */
	public String getType() {
    	return type;
    }
	
	/**
	 *setter type
	 */
	public void setType(String type) {
    	this.type = type;
    }
	
    
    private String season;
	
	/**
	 *getter season
	 */
	public String getSeason() {
    	return season;
    }
	
	/**
	 *setter season
	 */
	public void setSeason(String season) {
    	this.season = season;
    }
	
    
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
	
    
    private String productName;
	
	/**
	 *getter productName
	 */
	public String getProductName() {
    	return productName;
    }
	
	/**
	 *setter productName
	 */
	public void setProductName(String productName) {
    	this.productName = productName;
    }
	
    
    private String description;
	
	/**
	 *getter description
	 */
	public String getDescription() {
    	return description;
    }
	
	/**
	 *setter description
	 */
	public void setDescription(String description) {
    	this.description = description;
    }
	
    
    private String category;
	
	/**
	 *getter category
	 */
	public String getCategory() {
    	return category;
    }
	
	/**
	 *setter category
	 */
	public void setCategory(String category) {
    	this.category = category;
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
	
    
    private BigDecimal supplyPrice;
	
	/**
	 *getter supplyPrice
	 */
	public BigDecimal getSupplyPrice() {
    	return supplyPrice;
    }
	
	/**
	 *setter supplyPrice
	 */
	public void setSupplyPrice(BigDecimal supplyPrice) {
    	this.supplyPrice = supplyPrice;
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
	
    
    private String itemSize;
	
	/**
	 *getter itemSize
	 */
	public String getItemSize() {
    	return itemSize;
    }
	
	/**
	 *setter itemSize
	 */
	public void setItemSize(String itemSize) {
    	this.itemSize = itemSize;
    }
	
    
    private String barcode;
	
	/**
	 *getter barcode
	 */
	public String getBarcode() {
    	return barcode;
    }
	
	/**
	 *setter barcode
	 */
	public void setBarcode(String barcode) {
    	this.barcode = barcode;
    }
	
    
    private String color;
	
	/**
	 *getter color
	 */
	public String getColor() {
    	return color;
    }
	
	/**
	 *setter color
	 */
	public void setColor(String color) {
    	this.color = color;
    }
	
    
    private Integer stock;
	
	/**
	 *getter stock
	 */
	public Integer getStock() {
    	return stock;
    }
	
	/**
	 *setter stock
	 */
	public void setStock(Integer stock) {
    	this.stock = stock;
    }
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;
	
	/**
	 *getter createDate
	 */
	public Date getCreateDate() {
    	return createDate;
    }
	
	/**
	 *setter createDate
	 */
	public void setCreateDate(Date createDate) {
    	this.createDate = createDate;
    }
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastDate;
	
	/**
	 *getter lastDate
	 */
	public Date getLastDate() {
    	return lastDate;
    }
	
	/**
	 *setter lastDate
	 */
	public void setLastDate(Date lastDate) {
    	this.lastDate = lastDate;
    }
	

}
