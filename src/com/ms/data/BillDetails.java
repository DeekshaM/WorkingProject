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
public class BillDetails {
        
    private int iNo;
    private int ibillNumber;
    private String strItemName;
    private String strItemType;
    private float fQuantity;
    private float fRate;
    private float fAmount;

    /**
     * @return the billNumber
     */
    public int getBillNumber() {
        return ibillNumber;
    }

    /**
     * @param billNumber the billNumber to set
     */
    public void setBillNumber(int billNumber) {
        this.ibillNumber = billNumber;
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
     * @return the itemType
     */
    public String getItemType() {
        return strItemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(String itemType) {
        this.strItemType = itemType;
    }

    /**
     * @return the quantity
     */
    public float getQuantity() {
        return fQuantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(float quantity) {
        this.fQuantity = quantity;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return fAmount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.fAmount = amount;
    }

    /**
     * @return the pieceRate
     */
    public float getRate() {
        return fRate;
    }

    /**
     * @param pieceRate the pieceRate to set
     */
    public void setRate(float pieceRate) {
        this.fRate = pieceRate;
    }

    /**
     * @return the iNo
     */
    public int getNo() {
        return iNo;
    }

    /**
     * @param iNo the iNo to set
     */
    public void setNo(int iNo) {
        this.iNo = iNo;
    }
    
}
