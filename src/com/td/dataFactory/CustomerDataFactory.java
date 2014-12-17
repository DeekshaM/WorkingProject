/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.dataFactory;

import com.td.base.data.BillDetails;
import com.td.base.data.BillMain;
import com.td.base.data.Collection;
import com.td.base.data.CustomerBillInfo;
import com.td.base.data.ItemDetails;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRANSDYN\ebe
 */
public class CustomerDataFactory {

    public static List<String> getValidUser(String strUserName, String strPassword) throws ClassNotFoundException, SQLException {
        List<String> lstUserDetails = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "Select * from billing.users where UserId = '" + strUserName + "' and Password = '" + strPassword + "'";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ResultSet iResult = ps.executeQuery();
            while (iResult.next()) {
                lstUserDetails.add(iResult.getString("UserId"));
                lstUserDetails.add(iResult.getString("Password"));
            }
        } catch (Exception e) {
            throw e;
        }
        return lstUserDetails;
    }

    public static int setBillDetails(BillMain billDetails) throws ClassNotFoundException, SQLException {
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "INSERT INTO bill_main VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setInt(1, billDetails.getBillNo());
            ps.setString(2, billDetails.getBillDate());
            ps.setString(3, billDetails.getName());
            ps.setString(4, billDetails.getMobileNumber());
            ps.setFloat(5, billDetails.getTotalAmt());
            ps.setString(6, billDetails.getBillMainCol());
            ps.setString(7, billDetails.getCreatedBy());
            ps.setFloat(8, billDetails.getReceivedAmt());
            return ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static int setBillItems(List<BillDetails> lstbillItems) throws ClassNotFoundException, SQLException {        
        try (Connection con = ConnectionFactory.getConnection();) {
            con.setAutoCommit(false);
            String strQuery = "INSERT INTO bill_details VALUES (?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(strQuery);
            for (BillDetails billItem : lstbillItems) {
                ps.setInt(1, billItem.getBillNumber());
                ps.setString(2, billItem.getItemType());
                ps.setString(3, billItem.getItemName());
                ps.setFloat(4, billItem.getQuantity());
                ps.setDouble(5, billItem.getPieceRate());
                ps.setFloat(6, billItem.getAmount());
                ps.addBatch();
            }
            int[] count = ps.executeBatch();
            con.commit();
            return count.length;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static List<BillDetails> getBillItems(int billNo) throws ClassNotFoundException, SQLException {        
        List<BillDetails> lstbillItems = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();) {            
            String strQuery = "SELECT * FROM billing.bill_details where bill_no = ?";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setInt(1, billNo);
            ResultSet rSet = ps.executeQuery();
            while(rSet.next()) {
                BillDetails billDetails = new BillDetails();
                billDetails.setItemName(rSet.getString("Item_Name"));
                billDetails.setItemType(rSet.getString("Item_Type"));
                billDetails.setQuantity(rSet.getFloat("Quantity"));
                billDetails.setPieceRate(rSet.getFloat("Price_Rate"));
                billDetails.setAmount(rSet.getFloat("Amount"));
                lstbillItems.add(billDetails);
            }
        } catch (Exception e) {
            throw e;
        }
        return lstbillItems;
    }
    
    public static int getBillNo() throws ClassNotFoundException, SQLException {
        int iBillNo = 0;
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "select Max(Bill_No) Bill_No from billing.bill_main";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ResultSet iResult = ps.executeQuery();
            while (iResult.next()) {
                iBillNo = iResult.getInt("Bill_No");
            }
        } catch (Exception e) {
            throw e;
        }
        return iBillNo;
    }
    
    public static int setItemDetails(ItemDetails itemDetails) throws ClassNotFoundException, SQLException {
        
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "INSERT INTO item_details VALUES (?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setInt(1, itemDetails.getItemNumber());
            ps.setString(2, itemDetails.getItemName());
            ps.setFloat(3, itemDetails.getPurchasedPrice());
            ps.setString(4, itemDetails.getPurchasedCompany());
            ps.setFloat(5, itemDetails.getSalePrice());
            ps.setString(6, itemDetails.getItemCode());
            ps.setString(7, itemDetails.getItemDetail());
            return ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static List<BillMain> getBills(int billNo, Date billDate, String name) throws ClassNotFoundException, SQLException {
        List<BillMain> lstBillMain = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "SELECT * FROM billing.bill_main where Bill_No = ? or Bill_Date = ? or Name like ?";
            String strName = "%"+name+"%";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setInt(1, billNo);
            ps.setDate(2, billDate);
            ps.setString(3, strName);
            ResultSet iResult = ps.executeQuery();
            while (iResult.next()) {
                BillMain billMain = new BillMain();
                billMain.setBillNo(iResult.getInt("Bill_No"));
                billMain.setBillDate(iResult.getString("Bill_Date"));
                billMain.setName(iResult.getString("Name"));
                billMain.setMobileNumber(iResult.getString("Mobile_No"));
                billMain.setTotalAmt(iResult.getFloat("Total_Amount"));
                billMain.setReceivedAmt(iResult.getFloat("Recived_Amount"));
                billMain.setCreatedBy(iResult.getString("Created_By"));
                lstBillMain.add(billMain);
            }
        } catch (Exception e) {
            throw e;
        }
        return lstBillMain;
    }
    
    
    public static List<ItemDetails> getItems() throws ClassNotFoundException, SQLException {
        List<ItemDetails> lstItems = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "SELECT * FROM item_details";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ResultSet rSet = ps.executeQuery();
            while (rSet.next()) {
               ItemDetails itemDetails = new ItemDetails();
               itemDetails.setItemCode(rSet.getString("Item_Code"));
               itemDetails.setItemDetail(rSet.getString("Item_detailscol"));
               itemDetails.setItemName(rSet.getString("Item_Name"));
               itemDetails.setItemNumber(rSet.getInt("Item_Number"));
               itemDetails.setPurchasedCompany(rSet.getString("Item_Purchased_Company"));
               itemDetails.setPurchasedPrice(rSet.getFloat("Purchased_Price"));
               itemDetails.setSalePrice(rSet.getFloat("Sale_Price"));
               lstItems.add(itemDetails);
            }
        } catch (Exception e) {
            throw e;
        }
        return lstItems;
    }
    
    public static int getItemNumber() throws ClassNotFoundException, SQLException {
        int iBillNo = 0;
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "select Max(Item_Number) Item_Number from item_details";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ResultSet iResult = ps.executeQuery();
            while (iResult.next()) {
                iBillNo = iResult.getInt("Item_Number");
            }
        } catch (Exception e) {
            throw e;
        }
        return iBillNo;
    }
        
    public static ItemDetails getItemSearch(int itemNumber) throws ClassNotFoundException, SQLException {
        ItemDetails itemDetails = new ItemDetails();
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "SELECT * FROM billing.item_details where Item_Number = ?";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setInt(1, itemNumber);
            ResultSet iResult = ps.executeQuery();
            while (iResult.next()) {
                itemDetails.setItemCode(iResult.getString("Item_Code"));
                itemDetails.setItemDetail(iResult.getString("Item_detailscol"));
                itemDetails.setItemName(iResult.getString("Item_Name"));
                itemDetails.setItemNumber(iResult.getInt("Item_Number"));
                itemDetails.setPurchasedCompany(iResult.getString("Item_Purchased_Company"));
                itemDetails.setPurchasedPrice(iResult.getFloat("Purchased_Price"));
                itemDetails.setSalePrice(iResult.getFloat("sale_Price"));
            }
        } catch (Exception e) {
            throw e;
        }
        return itemDetails;
    }
    
    public static int addTransction(String dtDate, String strInformation, float fAmount) throws ClassNotFoundException, SQLException {
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "INSERT INTO collection VALUES (?,?,?);";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setString(1, dtDate);
            ps.setString(2, strInformation);
            ps.setFloat(3, fAmount);
            return ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static List<Collection> getCollectionDetails(String Date) throws ClassNotFoundException, SQLException {
        List<Collection> lstCollection = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "SELECT * FROM billing.collection where Transaction_Date = ?";
            PreparedStatement ps = con.prepareStatement(strQuery);
            ps.setString(1, Date);
            ResultSet iResult = ps.executeQuery();
            while (iResult.next()) {
                Collection collection = new Collection();
                collection.setInformation(iResult.getString("Transaction_Info"));
                collection.setTotalAmt(iResult.getString("Transaction_Amount"));
                lstCollection.add(collection);
            }
        } catch (Exception e) {
            throw e;
        }
        return lstCollection;
    }

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
            while (iResult.next()) {
                System.out.println(iResult.getString("UserId"));

            }
        } catch (Exception e) {
            throw e;
        }
        return 0;
    }

    public static CustomerBillInfo getBLOBObject(String strName, int iBillNumber, int iAccountNumber) throws ClassNotFoundException, SQLException, Exception {
        ResultSet rs = null;
        CustomerBillInfo customerBillInfo = new CustomerBillInfo();
        try (Connection con = ConnectionFactory.getConnection();) {
            String strQuery = "select * from APP.CUSTOMER_BILL_DETAILS where CUSTOMER_NAME = '" + strName + "'AND BILL_NUMBER =" + iBillNumber + " AND ACCOUNT_NUMBER = " + iAccountNumber + "";
            PreparedStatement ps = con.prepareStatement(strQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
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
            while (rs.next()) {
                MaxBillNumber = rs.getInt(1);

            }

        } catch (Exception e) {
            throw e;
        }
        return MaxBillNumber;
    }

}
