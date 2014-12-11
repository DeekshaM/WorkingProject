/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.base.data;

import java.io.Serializable;

/**
 *
 * @author TRANSDYN\ebe
 */
public class TableColumnsInfo implements Serializable{
    
    
    private String strItemName;
    private double dQuantity;
    private double dPriceRate;
    private double dAmount;
    
    
    public TableColumnsInfo(){
        
    }

    public String getItemName() {
        return strItemName;
    }

    public void setItemName(String ItemName) {
        this.strItemName = ItemName;
    }

    public double getQuantity() {
        return dQuantity;
    }

    public void setQuantity(double Quantity) {
        this.dQuantity = Quantity;
    }

    public double getPriceRate() {
        return dPriceRate;
    }

    public void setPriceRate(double PriceRate) {
        this.dPriceRate = PriceRate;
    }

    public double getAmount() {
        return dAmount;
    }

    public void setAmount(double Amount) {
        this.dAmount = Amount;
    }

  
    
    
    
    
}
