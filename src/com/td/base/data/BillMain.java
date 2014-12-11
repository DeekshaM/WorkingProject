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
    public int getiBillNo() {
        return iBillNo;
    }

    /**
     * @param iBillNo the iBillNo to set
     */
    public void setiBillNo(int iBillNo) {
        this.iBillNo = iBillNo;
    }

    /**
     * @return the dtBillDate
     */
    public Date getDtBillDate() {
        return dtBillDate;
    }

    /**
     * @param dtBillDate the dtBillDate to set
     */
    public void setDtBillDate(Date dtBillDate) {
        this.dtBillDate = dtBillDate;
    }

    /**
     * @return the strName
     */
    public String getStrName() {
        return strName;
    }

    /**
     * @param strName the strName to set
     */
    public void setStrName(String strName) {
        this.strName = strName;
    }

    /**
     * @return the dMobileNumber
     */
    public double getdMobileNumber() {
        return dMobileNumber;
    }

    /**
     * @param dMobileNumber the dMobileNumber to set
     */
    public void setdMobileNumber(double dMobileNumber) {
        this.dMobileNumber = dMobileNumber;
    }

    /**
     * @return the fTotalAmt
     */
    public float getfTotalAmt() {
        return fTotalAmt;
    }

    /**
     * @param fTotalAmt the fTotalAmt to set
     */
    public void setfTotalAmt(float fTotalAmt) {
        this.fTotalAmt = fTotalAmt;
    }

    /**
     * @return the strBillMainCol
     */
    public String getStrBillMainCol() {
        return strBillMainCol;
    }

    /**
     * @param strBillMainCol the strBillMainCol to set
     */
    public void setStrBillMainCol(String strBillMainCol) {
        this.strBillMainCol = strBillMainCol;
    }

    /**
     * @return the strCreatedBy
     */
    public String getStrCreatedBy() {
        return strCreatedBy;
    }

    /**
     * @param strCreatedBy the strCreatedBy to set
     */
    public void setStrCreatedBy(String strCreatedBy) {
        this.strCreatedBy = strCreatedBy;
    }

    /**
     * @return the fReceivedAmt
     */
    public float getfReceivedAmt() {
        return fReceivedAmt;
    }

    /**
     * @param fReceivedAmt the fReceivedAmt to set
     */
    public void setfReceivedAmt(float fReceivedAmt) {
        this.fReceivedAmt = fReceivedAmt;
    }
    
    
}
