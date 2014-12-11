/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.td.base.data;

/**
 *
 * @author Venugopal
 */
public class ItemDetails {
    
    private String itemNumber;
    private String itemName;
    private float purchasedPrice;
    private float salePrice;
    private String purchasedCompany;
    private String itemCode;

    /**
     * @return the itemNumber
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * @param itemNumber the itemNumber to set
     */
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the purchasedPrice
     */
    public float getPurchasedPrice() {
        return purchasedPrice;
    }

    /**
     * @param purchasedPrice the purchasedPrice to set
     */
    public void setPurchasedPrice(float purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    /**
     * @return the salePrice
     */
    public float getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the purchasedCompany
     */
    public String getPurchasedCompany() {
        return purchasedCompany;
    }

    /**
     * @param purchasedCompany the purchasedCompany to set
     */
    public void setPurchasedCompany(String purchasedCompany) {
        this.purchasedCompany = purchasedCompany;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
}
