/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.task;

import com.td.base.data.BillMain;
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
         BillMain record = lstbillMain.get(row);
         switch (column) {
             case 0:
                return record.getBillNo();
             case 1:
                return record.getBillDate();
             case 2:
                return record.getName();
             case 3:
                 return record.getMobileNumber();
             case 4:
                 return record.getTotalAmt();
             case 5:
                 return record.getReceivedAmt();
             case 6:
                 return record.getCreatedBy();
                 
             default:
                return new Object();
         }
     }

    @Override
     public void setValueAt(Object value, int row, int column) {
         BillMain record = lstbillMain.get(row);
         switch (column) {
             case 0:
                record.setBillNo((int) value);
                break;
             case 1:
                record.setBillDate((String)value);
                break;
             case 2:
                record.setName((String)value);
                break;
             case 3:
                record.setMobileNumber((String)value);
                 break;
             case 4:
                 record.setTotalAmt((Float)value);
                 break;
             case 5:
                 record.setReceivedAmt((Float)value);
                 break;
             case 6:                 
                 record.setCreatedBy((String)value);
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
