/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ms.data;

/**
 *
 * @author Venugopal
 */
public class ItemDetails {
    
    private int iItemNo;
    private String strItemName;
    private float fPurchaseRate;
    private float fSellRate;
    private String strPurchasedShop;
    private String strItemCode;
    private String strItemDetail;

    /**
     * @return the itemNumber
     */
    public int getItemNo() {
        return iItemNo;
    }

    /**
     * @param itemNumber the itemNumber to set
     */
    public void setItemNo(int itemNumber) {
        this.iItemNo = itemNumber;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return strItemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.strItemName = itemName;
    }

    /**
     * @return the purchasedPrice
     */
    public float getPurchasedRate() {
        return fPurchaseRate;
    }

    /**
     * @param purchasedPrice the purchasedPrice to set
     */
    public void setPurchasedRate(float purchasedPrice) {
        this.fPurchaseRate = purchasedPrice;
    }

    /**
     * @return the salePrice
     */
    public float getSellRate() {
        return fSellRate;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSellRate(float salePrice) {
        this.fSellRate = salePrice;
    }

    /**
     * @return the purchasedCompany
     */
    public String getPurchasedShop() {
        return strPurchasedShop;
    }

    /**
     * @param purchasedCompany the purchasedCompany to set
     */
    public void setPurchasedShop(String purchasedCompany) {
        this.strPurchasedShop = purchasedCompany;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return strItemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.strItemCode = itemCode;
    }

    /**
     * @return the ItemDetail
     */
    public String getItemDetail() {
        return strItemDetail;
    }

    /**
     * @param ItemDetail the ItemDetail to set
     */
    public void setItemDetail(String ItemDetail) {
        this.strItemDetail = ItemDetail;
    }
    
}
