/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.task;

import com.td.base.data.ItemDetails;
import com.td.dataFactory.CustomerDataFactory;
import static com.td.dataFactory.CustomerDataFactory.setItemDetails;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vmanchala
 */
public class ItemDetailsForm extends javax.swing.JFrame {

    /**
     * Creates new form ItemDetailsForm
     */
    public ItemDetailsForm() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblItemNumber = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        tfItemName = new javax.swing.JTextField();
        lblPurchasedPrice = new javax.swing.JLabel();
        tfPurchasedPrice = new javax.swing.JTextField();
        lblItemPurchasedShop = new javax.swing.JLabel();
        tfItemPurchasedShop = new javax.swing.JTextField();
        lblItemSellPrice = new javax.swing.JLabel();
        lblItemCode = new javax.swing.JLabel();
        tfItemCode = new javax.swing.JTextField();
        btnInsertItem = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblItemDetail = new javax.swing.JLabel();
        tfItemDetail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tfItemNumber = new javax.swing.JFormattedTextField();
        tfItemSellPrice = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Item Details");

        lblItemNumber.setText("Item Number :");

        lblItemName.setText("Item Name :");

        lblPurchasedPrice.setText("Purchased Price :");

        lblItemPurchasedShop.setText("Item Purchased Shop :");

        lblItemSellPrice.setText("Item Sell Price :");

        lblItemCode.setText("Item Priced Code :");

        btnInsertItem.setText("Insert Item");
        btnInsertItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertItemActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblItemDetail.setText("Item Detail :");

        jButton1.setText("Generate No.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfItemNumber.setEditable(false);
        tfItemNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        tfItemSellPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItemNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemCode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPurchasedPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemPurchasedShop, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemSellPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemDetail, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfItemPurchasedShop)
                            .addComponent(tfItemCode)
                            .addComponent(tfItemName)
                            .addComponent(tfPurchasedPrice)
                            .addComponent(tfItemDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(tfItemNumber)
                            .addComponent(tfItemSellPrice))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemNumber)
                    .addComponent(jButton1)
                    .addComponent(tfItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemCode)
                    .addComponent(tfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemName)
                    .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchasedPrice)
                    .addComponent(tfPurchasedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemPurchasedShop)
                    .addComponent(tfItemPurchasedShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemSellPrice)
                    .addComponent(tfItemSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemDetail)
                    .addComponent(tfItemDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertItem)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertItemActionPerformed
        try {
            ItemDetails  itemDetails = new ItemDetails();
            int itemNumber = Integer.valueOf(tfItemNumber.getValue().toString());
            itemDetails.setItemNumber(itemNumber);
            itemDetails.setItemName(tfItemName.getText());
            itemDetails.setPurchasedPrice(Float.valueOf(tfPurchasedPrice.getText()));
            itemDetails.setPurchasedCompany(tfItemPurchasedShop.getText());
            float salePrice = Float.valueOf(tfItemSellPrice.getValue().toString());
            itemDetails.setSalePrice(salePrice);
            itemDetails.setItemCode(tfItemCode.getText());
            itemDetails.setItemDetail(tfItemDetail.getText());
            int iresult = setItemDetails(itemDetails);
            if(iresult == 1) {
                JOptionPane.showMessageDialog(this, "Item inserted successfully", "Adding New Item", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                ItemDetailsForm itemDet = new ItemDetailsForm();
                itemDet.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnInsertItemActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tfItemNumber.setValue(CustomerDataFactory.getItemNumber()+1);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItemDetailsForm.class.getName()).log(Level.SEVERE, null, ex);
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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ItemDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ItemDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ItemDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ItemDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ItemDetailsForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsertItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JLabel lblItemDetail;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemNumber;
    private javax.swing.JLabel lblItemPurchasedShop;
    private javax.swing.JLabel lblItemSellPrice;
    private javax.swing.JLabel lblPurchasedPrice;
    private javax.swing.JTextField tfItemCode;
    private javax.swing.JTextField tfItemDetail;
    private javax.swing.JTextField tfItemName;
    private javax.swing.JFormattedTextField tfItemNumber;
    private javax.swing.JTextField tfItemPurchasedShop;
    private javax.swing.JFormattedTextField tfItemSellPrice;
    private javax.swing.JTextField tfPurchasedPrice;
    // End of variables declaration//GEN-END:variables
}
