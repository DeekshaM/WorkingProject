/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.model;

import com.ms.data.BillDetails;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vmanchala
 */
public class PrintBillItemDetailsTableModel1 extends AbstractTableModel{

    protected String[] columnNames = {"No","Item Name", "Type", "Qty", "Price", "Amount"};
    private List<BillDetails> lstBillDetails;
    
    public PrintBillItemDetailsTableModel1(List<BillDetails> lstBillDetails) {
        this.lstBillDetails = lstBillDetails;    
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
         BillDetails billDetails = lstBillDetails.get(row);
         switch (column) { 
             case 0:
                 return billDetails.getNo();
             case 1:
                return billDetails.getItemName();
             case 2:
                return billDetails.getItemType();
             case 3:
                 return billDetails.getQuantity();
             case 4:
                 return billDetails.getRate();
             case 5:
                 return billDetails.getAmount();                 
             default:
                return new Object();
         }
     }

    @Override
     public void setValueAt(Object value, int row, int column) {
         BillDetails billDetails = lstBillDetails.get(row);
         switch (column) {             
             case 1:
                billDetails.setItemName((String)value);
                break;
             case 2:
                billDetails.setItemType((String)value);
                break;
             case 3:
                billDetails.setQuantity((Float)value);
                 break;
             case 4:
                 billDetails.setRate((Float)value);
                 break;
             case 5:
                 billDetails.setAmount((Float)value);
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
