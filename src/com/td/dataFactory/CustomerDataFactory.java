/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.dataFactory;

import com.td.base.data.CustomerBillInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TRANSDYN\ebe
 */
public class CustomerDataFactory {
    
       public static int setBLOBObject(CustomerBillInfo customerBillInfo) throws ClassNotFoundException, SQLException, Exception {
//        int iResult = 0;
  
        try (Connection con = ConnectionFactory.getConnection();) { 
            
//            ByteArrayOutputStream byteArry = new ByteArrayOutputStream();
//            ObjectOutputStream o = new ObjectOutputStream(byteArry);
//            o.writeObject(customerBillInfo);
//            byte[] data =  byteArry.toByteArray();
//            String strQuery = "INSERT INTO APP.CUSTOMER_BILL_DETAILS(CUSTOMER_NAME,MOBILE_NUMBER,CUSTOMER_ADDR,BILL_NUMBER,BILL_DATE_TIME,ACCOUNT_NUMBER,BLOBDATA)VALUES(?,?,?,?,?,?,?)";
//            PreparedStatement ps = con.prepareStatement(strQuery);
//            ps.setString(1, customerBillInfo.getName());
//            ps.setString(2, customerBillInfo.getMobileNum());
//            ps.setString(3,customerBillInfo.getAddress());
//            ps.setInt(4,customerBillInfo.getBillNumber());
//            ps.setString(5,customerBillInfo.getLastBillDate().toString());
//            ps.setInt(6,customerBillInfo.getAccountNumber());
//            ps.setObject(7,data);
//            iResult = ps.executeUpdate();
            String strQuery = "SELECT * FROM billing.users";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ResultSet iResult = ps.executeQuery();
            while(iResult.next()) {
                System.out.println(iResult.getString("UserId"));
            }
        } catch (Exception e) {
            throw e;
        }
        return 0;
    }
       
         public static CustomerBillInfo getBLOBObject(String strName,int iBillNumber, int iAccountNumber) throws ClassNotFoundException, SQLException, Exception {
           ResultSet rs = null;
             CustomerBillInfo customerBillInfo = new CustomerBillInfo();
        try (Connection con = ConnectionFactory.getConnection();) {            
            String strQuery = "select * from APP.CUSTOMER_BILL_DETAILS where CUSTOMER_NAME = '"+strName+"'AND BILL_NUMBER ="+iBillNumber+" AND ACCOUNT_NUMBER = "+iAccountNumber+"";
            PreparedStatement ps = con.prepareStatement(strQuery);
            rs = ps.executeQuery();
            while(rs.next()){
                ByteArrayInputStream byteArry = new ByteArrayInputStream(rs.getBytes(7));
                ObjectInputStream o = new ObjectInputStream(byteArry);
                 customerBillInfo = (CustomerBillInfo) o.readObject();
                
            }
            
        } catch (Exception e) {
            throw e;
        }
        return customerBillInfo;
    }
         
         
    public static int getBillNumbers() throws ClassNotFoundException, SQLException, Exception {
       int MaxBillNumber = 0;
             ResultSet rs = null;
             
        try (Connection con = ConnectionFactory.getConnection();) {  
//             CustomerDataFactory.getBLOBObject("netti",4,1313);
//            byte[] data = lCDASectionsInfo.toByteArray();
            String strQuery = "select MAX(BILL_NUMBER) from APP.CUSTOMER_BILL_DETAILS";
            PreparedStatement ps = con.prepareStatement(strQuery);
            rs = ps.executeQuery();
            while(rs.next()){
              MaxBillNumber = rs.getInt(1);
                
            }
            
        } catch (Exception e) {
            throw e;
        }
        return MaxBillNumber;
    }   
         
    
    
    
}
