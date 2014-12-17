/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.view;

import com.ms.data.ItemDetails;
import com.ms.datafactory.CustomerDataFactory;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vmanchala
 */
public class SearchItemDetails extends javax.swing.JFrame {

    /**
     * Creates new form SearchItemDetails
     */
    public SearchItemDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblItemNumber = new javax.swing.JLabel();
        ftItemNumber = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        lblPriceCode = new javax.swing.JLabel();
        lblSellPrice = new javax.swing.JLabel();
        lblPurchasePrice = new javax.swing.JLabel();
        lblPurchaseCompany = new javax.swing.JLabel();
        lblItemDetails = new javax.swing.JLabel();
        tfPriceCode = new javax.swing.JTextField();
        tfSellPrice = new javax.swing.JTextField();
        tfPurchasePrice = new javax.swing.JTextField();
        tfPurchaseCompany = new javax.swing.JTextField();
        tfItemDetails = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Item Details");
        setResizable(false);

        lblItemNumber.setText("Item Number :");

        ftItemNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        ftItemNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftItemNumberKeyTyped(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPriceCode.setText("Price  Code :");

        lblSellPrice.setText("Sell Price :");

        lblPurchasePrice.setText("Purchase Price :");

        lblPurchaseCompany.setText("Purchase Company :");

        lblItemDetails.setText("Item Details :");

        tfPriceCode.setEditable(false);

        tfSellPrice.setEditable(false);

        tfPurchasePrice.setEditable(false);

        tfPurchaseCompany.setEditable(false);

        tfItemDetails.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemDetails, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPurchasePrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPurchaseCompany, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSellPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPriceCode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblItemNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftItemNumber)
                    .addComponent(tfPriceCode, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(tfSellPrice)
                    .addComponent(tfPurchasePrice)
                    .addComponent(tfPurchaseCompany)
                    .addComponent(tfItemDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemNumber)
                    .addComponent(ftItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPriceCode)
                    .addComponent(tfPriceCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSellPrice)
                    .addComponent(tfSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchasePrice)
                    .addComponent(tfPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchaseCompany)
                    .addComponent(tfPurchaseCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemDetails)
                    .addComponent(tfItemDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftItemNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftItemNumberKeyTyped
        if (!((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || ftItemNumber.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_ftItemNumberKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int itemNumber = Integer.valueOf(ftItemNumber.getValue().toString());
            ItemDetails itemDetail = CustomerDataFactory.getItemSearch(itemNumber);
            tfItemDetails.setText(itemDetail.getItemDetail());
            tfPriceCode.setText(itemDetail.getItemCode());
            tfPurchaseCompany.setText(itemDetail.getPurchasedCompany());
            tfPurchasePrice.setText(String.valueOf(itemDetail.getPurchasedPrice()));
            tfSellPrice.setText(String.valueOf(itemDetail.getSalePrice()));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchItemDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Metal".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SearchItemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SearchItemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SearchItemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SearchItemDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SearchItemDetails().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftItemNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblItemDetails;
    private javax.swing.JLabel lblItemNumber;
    private javax.swing.JLabel lblPriceCode;
    private javax.swing.JLabel lblPurchaseCompany;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblSellPrice;
    private javax.swing.JTextField tfItemDetails;
    private javax.swing.JTextField tfPriceCode;
    private javax.swing.JTextField tfPurchaseCompany;
    private javax.swing.JTextField tfPurchasePrice;
    private javax.swing.JTextField tfSellPrice;
    // End of variables declaration//GEN-END:variables
}