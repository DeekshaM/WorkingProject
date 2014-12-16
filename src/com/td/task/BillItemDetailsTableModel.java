/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.task;

import com.td.base.data.BillDetails;
import java.sql.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vmanchala
 */
public class BillItemDetailsTableModel extends AbstractTableModel{

    protected String[] columnNames = {"No","Item Name", "Type", "Qty", "Price", "Amount"};
    int i;
    private List<BillDetails> lstBillDetails;
    
    public BillItemDetailsTableModel(List<BillDetails> lstBillDetails) {
        this.lstBillDetails = lstBillDetails;
        i = 1;
    }
    
    @Override
     public String getColumnName(int column) {
         return columnNames[column];
     }
     
     public BillDetails getObject(int row) {
         return lstBillDetails.get(row);
     }

     public Class getColumnClass(String column) {
         switch (column) {   
             case "No":
                 return Integer.class;
            case "Item Name":
                return String.class;
            case "Type":
                return String.class;
            case "Qty":
                return Float.class;
            case "Price":
                return Float.class;
            case "Amount":
                return Float.class;            
             default:
                return Object.class;
         }
     }

    @Override
     public Object getValueAt(int row, int column) {
         BillDetails record = lstBillDetails.get(row);
         switch (column) { 
             case 0:
                 return i++;
             case 1:
                return record.getItemName();
             case 2:
                return record.getItemType();
             case 3:
                 return record.getQuantity();
             case 4:
                 return record.getPieceRate();
             case 5:
                 return record.getAmount();                 
             default:
                return new Object();
         }
     }

    @Override
     public void setValueAt(Object value, int row, int column) {
         BillDetails record = lstBillDetails.get(row);
         switch (column) {             
             case 1:
                record.setItemName((String)value);
                break;
             case 2:
                record.setItemType((String)value);
                break;
             case 3:
                record.setQuantity((Float)value);
                 break;
             case 4:
                 record.setPieceRate((Float)value);
                 break;
             case 5:
                 record.setAmount((Float)value);
                 break;      
             default:
                System.out.println("invalid index");
         }
         fireTableCellUpdated(row, column);
     }

    @Override
     public int getRowCount() {
         return lstBillDetails.size();
     }

    @Override
     public int getColumnCount() {
         return columnNames.length;
     }
     
     

}
