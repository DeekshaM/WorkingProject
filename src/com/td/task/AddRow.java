/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.task;

import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TRANSDYN\ery
 */
public class AddRow extends javax.swing.JPanel {

    /**
     * Creates new form AddRow
     */
    List<String> timesArray = new ArrayList<>();
    public AddRow() {
        initComponents();
        try {
                File file = new File("D:\\Tomaggo\\TestProject\\WorkingProject\\src\\com\\td\\task\\DictAllWords.txt");
//                File file = new File("F:\\All\\Tasks\\Tasks\\src\\com\\td\\task\\DictAllWords.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    timesArray.add(scanner.next());
                }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this,"AddRow_AddRow \n Exception is Occured at Loading..... a File \n"+e.getMessage());
            }
        AutoTextComplete atc = new AutoTextComplete(tfName);
        atc.setItems(timesArray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpConfiguration = new javax.swing.JPopupMenu();
        popAdd = new javax.swing.JMenuItem();
        tfName = new javax.swing.JTextField();
        tfQuantity = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfNo = new javax.swing.JTextField();
        tfAmount = new javax.swing.JTextField();
        tfType = new javax.swing.JTextField();

        popAdd.setText("Add Item Name");
        popAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popAddActionPerformed(evt);
            }
        });
        popUpConfiguration.add(popAdd);

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(418, 20));

        tfName.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfName.setMinimumSize(new java.awt.Dimension(6, 19));
        tfName.setPreferredSize(new java.awt.Dimension(2, 20));
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });

        tfQuantity.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfQuantity.setMinimumSize(new java.awt.Dimension(6, 19));
        tfQuantity.setPreferredSize(new java.awt.Dimension(2, 20));
        tfQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantityActionPerformed(evt);
            }
        });

        tfPrice.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfPrice.setMinimumSize(new java.awt.Dimension(6, 19));
        tfPrice.setPreferredSize(new java.awt.Dimension(2, 20));

        tfNo.setEditable(false);
        tfNo.setBackground(new java.awt.Color(255, 255, 255));
        tfNo.setText("1");
        tfNo.setFocusable(false);
        tfNo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfNo.setMinimumSize(new java.awt.Dimension(6, 19));

        tfAmount.setEditable(false);
        tfAmount.setBackground(new java.awt.Color(255, 255, 255));
        tfAmount.setFocusable(false);
        tfAmount.setHighlighter(null);
        tfAmount.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfAmount.setMinimumSize(new java.awt.Dimension(6, 19));

        tfType.setText("P");
        tfType.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfType.setPreferredSize(new java.awt.Dimension(8, 20));
        tfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void popAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popAddActionPerformed

    }//GEN-LAST:event_popAddActionPerformed

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        
        if(evt.getButton()==MouseEvent.BUTTON3)
        {
            popUpConfiguration.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tfNameMouseClicked

    private void tfQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantityActionPerformed

    private void tfTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem popAdd;
    public javax.swing.JPopupMenu popUpConfiguration;
    public javax.swing.JTextField tfAmount;
    public javax.swing.JTextField tfName;
    public javax.swing.JTextField tfNo;
    public javax.swing.JTextField tfPrice;
    public javax.swing.JTextField tfQuantity;
    public javax.swing.JTextField tfType;
    // End of variables declaration//GEN-END:variables
}
