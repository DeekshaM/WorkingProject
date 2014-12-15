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

    protected String[] columnNames = {"Item Name", "Type", "Qty", "Price", "Amount"};
    int i = 0;
    private List<BillDetails> lstBillDetails;
    
    public BillItemDetailsTableModel(List<BillDetails> lstBillDetails) {
        this.lstBillDetails = lstBillDetails;
    }
    
    @Override
     public String getColumnName(int column) {
         return columnNames[column];
     }

//     public boolean isCellEditable(int row, int column) {
//            return flase;
//     }
     
     public BillDetails getObject(int row) {
         return lstBillDetails.get(row);
     }

     public Class getColumnClass(String column) {
         switch (column) {           
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
                return record.getItemName();
             case 1:
                return record.getItemType();
             case 2:
                 return record.getQuantity();
             case 3:
                 return record.getPieceRate();
             case 4:
                 return record.getAmount();                 
             default:
                return new Object();
         }
     }

    @Override
     public void setValueAt(Object value, int row, int column) {
         BillDetails record = lstBillDetails.get(row);
         switch (column) {             
             case 0:
                record.setItemName((String)value);
                break;
             case 1:
                record.setItemType((String)value);
                break;
             case 2:
                record.setQuantity((Float)value);
                 break;
             case 3:
                 record.setPieceRate((Float)value);
                 break;
             case 4:
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
