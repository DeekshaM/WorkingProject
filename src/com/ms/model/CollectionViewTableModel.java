/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.model;

import com.ms.data.Collection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vmanchala
 */
public class CollectionViewTableModel extends AbstractTableModel{
    
     protected String[] columnNames = {"Transaction Information", "Amount"};
     private List<Collection> lstCollection;
    
    public CollectionViewTableModel(List<Collection> lstCollection) {
        this.lstCollection = lstCollection;
    }
    
    @Override
     public String getColumnName(int column) {
         return columnNames[column];
     }
     
     public Collection getObject(int row) {
         return lstCollection.get(row);
     }

     public Class getColumnClass(String column) {
         switch (column) {   
             case "Transaction Information":
                 return String.class;
            case "Amount":
                return Float.class;            
             default:
                return Object.class;
         }
     }

    @Override
     public Object getValueAt(int row, int column) {
         Collection collection = lstCollection.get(row);
         switch (column) { 
             case 0:
                 return collection.getInformation();
             case 1:
                return collection.getTotalAmt();
             default:
                return new Object();
         }
     }

    @Override
     public void setValueAt(Object value, int row, int column) {
         Collection collection = lstCollection.get(row);
         switch (column) {             
             case 0:
                collection.setInformation((String)value);
                break;
             case 1:
                collection.setTotalAmt((String)value);
                break;
             default:
                System.out.println("invalid index");
         }
         fireTableCellUpdated(row, column);
     }

    @Override
     public int getRowCount() {
         return lstCollection.size();
     }

    @Override
     public int getColumnCount() {
         return columnNames.length;
     }
     
    
}
