/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.model;

import com.ms.data.BillMain;
import java.sql.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vmanchala
 */
public class BillDetailsTableModel extends AbstractTableModel{

    protected String[] columnNames = {"Bill No","Bill Date", "Customer Name", "Mobile No.", "Total Amount", "Recived Amount", "Created By"};
    
    private List<BillMain> lstbillMain;
    
    public BillDetailsTableModel(List<BillMain> lstbillMain) {
        this.lstbillMain = lstbillMain;
    }
    
    @Override
     public String getColumnName(int column) {
         return columnNames[column];
     }
     
     public BillMain getObject(int row) {
         return lstbillMain.get(row);
     }

     public Class getColumnClass(String column) {
         switch (column) {
            case "Bill No":
                return Integer.class;
            case "Bill Date":
                return Date.class;
            case "Customer Name":
                return String.class;
            case "Mobile No.":
                return Double.class;
            case "Total Amount":
                return Float.class;
            case "Recived Amount":
                return Float.class;
            case "Created By":
                return String.class;
             default:
                return Object.class;
         }
     }

    @Override
     public Object getValueAt(int row, int column) {
         BillMain billMain = lstbillMain.get(row);
         switch (column) {
             case 0:
                return billMain.getBillNo();
             case 1:
                return billMain.getBillDate();
             case 2:
                return billMain.getName();
             case 3:
                 return billMain.getMobileNumber();
             case 4:
                 return billMain.getTotalAmt();
             case 5:
                 return billMain.getReceivedAmt();
             case 6:
                 return billMain.getCreatedBy();
                 
             default:
                return new Object();
         }
     }

    @Override
     public void setValueAt(Object value, int row, int column) {
         BillMain billMain = lstbillMain.get(row);
         switch (column) {
             case 0:
                billMain.setBillNo((int) value);
                break;
             case 1:
                billMain.setBillDate((String)value);
                break;
             case 2:
                billMain.setName((String)value);
                break;
             case 3:
                billMain.setMobileNumber((String)value);
                 break;
             case 4:
                 billMain.setTotalAmt((Float)value);
                 break;
             case 5:
                 billMain.setReceivedAmt((Float)value);
                 break;
             case 6:                 
                 billMain.setCreatedBy((String)value);
                 break;                 
             default:
                System.out.println("invalid index");
         }
         fireTableCellUpdated(row, column);
     }

    @Override
     public int getRowCount() {
         return lstbillMain.size();
     }

    @Override
     public int getColumnCount() {
         return columnNames.length;
     }
     
     

}
