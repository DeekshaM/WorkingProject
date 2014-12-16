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
public class BillDetails {
    
    private int billNumber;
    private String itemName;
    private String itemType;
    private float quantity;
    private float pieceRate;
    private float amount;

    /**
     * @return the billNumber
     */
    public int getBillNumber() {
        return billNumber;
    }

    /**
     * @param billNumber the billNumber to set
     */
    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
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
     * @return the itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * @return the quantity
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the pieceRate
     */
    public float getPieceRate() {
        return pieceRate;
    }

    /**
     * @param pieceRate the pieceRate to set
     */
    public void setPieceRate(float pieceRate) {
        this.pieceRate = pieceRate;
    }
    
}
