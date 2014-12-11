/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.td.base.data;

import java.util.Date;

/**
 *
 * @author Venugopal
 */
public class BillMain {
    
    private int iBillNo;
    private Date dtBillDate;
    private String strName;
    private double dMobileNumber;
    private float fTotalAmt;
    private String strBillMainCol;
    private String strCreatedBy;
    private float fReceivedAmt;

    /**
     * @return the iBillNo
     */
    public int getBillNo() {
        return iBillNo;
    }

    /**
     * @param iBillNo the iBillNo to set
     */
    public void setBillNo(int iBillNo) {
        this.iBillNo = iBillNo;
    }

    /**
     * @return the dtBillDate
     */
    public Date getBillDate() {
        return dtBillDate;
    }

    /**
     * @param dtBillDate the dtBillDate to set
     */
    public void setBillDate(Date dtBillDate) {
        this.dtBillDate = dtBillDate;
    }

    /**
     * @return the strName
     */
    public String getName() {
        return strName;
    }

    /**
     * @param strName the strName to set
     */
    public void setName(String strName) {
        this.strName = strName;
    }

    /**
     * @return the dMobileNumber
     */
    public double getMobileNumber() {
        return dMobileNumber;
    }

    /**
     * @param dMobileNumber the dMobileNumber to set
     */
    public void setMobileNumber(double dMobileNumber) {
        this.dMobileNumber = dMobileNumber;
    }

    /**
     * @return the fTotalAmt
     */
    public float getTotalAmt() {
        return fTotalAmt;
    }

    /**
     * @param fTotalAmt the fTotalAmt to set
     */
    public void setTotalAmt(float fTotalAmt) {
        this.fTotalAmt = fTotalAmt;
    }

    /**
     * @return the strBillMainCol
     */
    public String getBillMainCol() {
        return strBillMainCol;
    }

    /**
     * @param strBillMainCol the strBillMainCol to set
     */
    public void setBillMainCol(String strBillMainCol) {
        this.strBillMainCol = strBillMainCol;
    }

    /**
     * @return the strCreatedBy
     */
    public String getCreatedBy() {
        return strCreatedBy;
    }

    /**
     * @param strCreatedBy the strCreatedBy to set
     */
    public void setCreatedBy(String strCreatedBy) {
        this.strCreatedBy = strCreatedBy;
    }

    /**
     * @return the fReceivedAmt
     */
    public float getReceivedAmt() {
        return fReceivedAmt;
    }

    /**
     * @param fReceivedAmt the fReceivedAmt to set
     */
    public void setReceivedAmt(float fReceivedAmt) {
        this.fReceivedAmt = fReceivedAmt;
    }
    
    
}
