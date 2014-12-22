/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ms.data;

import java.util.Date;

/**
 *
 * @author Venugopal
 */
public class Users {
    
    private String strUserId;
    private String strPassword;
    private String strCreatedBy;
    private Date dtupdatedDate;

    /**
     * @return the userId
     */
    public String getUserId() {
        return strUserId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.strUserId = userId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return strPassword;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.strPassword = password;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return strCreatedBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.strCreatedBy = createdBy;
    }

    /**
     * @return the updatedDateTime
     */
    public Date getUpdatedDateTime() {
        return dtupdatedDate;
    }

    /**
     * @param updatedDateTime the updatedDateTime to set
     */
    public void setUpdatedDateTime(Date updatedDateTime) {
        this.dtupdatedDate = updatedDateTime;
    }
    
}
