/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.data;

import java.util.Date;

/**
 *
 * @author vmanchala
 */
public class Collection {
    
    private Date dtDate;
    private String strInformation;
    private String strTotalAmt;

    /**
     * @return the dtDate
     */
    public Date getDate() {
        return dtDate;
    }

    /**
     * @param dtDate the dtDate to set
     */
    public void setDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    /**
     * @return the strInformation
     */
    public String getInformation() {
        return strInformation;
    }

    /**
     * @param strInformation the strInformation to set
     */
    public void setInformation(String strInformation) {
        this.strInformation = strInformation;
    }

    /**
     * @return the strTotalAmt
     */
    public String getTotalAmt() {
        return strTotalAmt;
    }

    /**
     * @param strTotalAmt the strTotalAmt to set
     */
    public void setTotalAmt(String strTotalAmt) {
        this.strTotalAmt = strTotalAmt;
    }
    
}
