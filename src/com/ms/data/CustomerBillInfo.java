/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TRANSDYN\ebe
 */
public class CustomerBillInfo implements Serializable{
    
    private String strName;
    private String iMobileNo;
    private int iBillNumber;
    private Date dtBillDate;
    private int iAccountNumber;
    private double dTotalAmt;
    private List<BillDetails> lstOfTableInfo;
    
    
    
    public CustomerBillInfo(){
        
    }

    public String getName() {
        return strName;
    }

    public void setName(String Name) {
        this.strName = Name;
    }

    public String getMobileNum() {
        return iMobileNo;
    }

    public void setMobileNum(String iMobileNum) {
        this.iMobileNo = iMobileNum;
    }

    public int getBillNumber() {
        return iBillNumber;
    }

    public void setBillNumber(int BillNumber) {
        this.iBillNumber = BillNumber;
    }

    public Date getLastBillDate() {
        return dtBillDate;
    }

    public void setLastBillDate(Date lastBillDate) {
        this.dtBillDate = lastBillDate;
    }

    public int getAccountNumber() {
        return iAccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.iAccountNumber = AccountNumber;
    }
    
    public double getTotalAmt() {
        return dTotalAmt;
    }

    public void setTotalAmt(double TotalAmt) {
        this.dTotalAmt = TotalAmt;
    }

    public List<BillDetails> getLstOfTableInfo() {
        return lstOfTableInfo;
    }

    public void setLstOfTableInfo(List<BillDetails> lstOfTableInfo) {
        this.lstOfTableInfo = lstOfTableInfo;
    }
    
    
    
    
    
}
