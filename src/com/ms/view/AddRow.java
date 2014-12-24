/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.view;

import com.ms.util.AutoTextComplete;
import com.ms.data.ItemDetails;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author TRANSDYN\ery
 */
public class AddRow extends javax.swing.JPanel {

    /**
     * Creates new form AddRow
     */
    List<String> timesArray = new ArrayList<>();
    DocumentFilter filter = new com.ms.util.UppercaseDocumentFilter();
    public AddRow() {
        initComponents();
//        try {
//                File file = new File("D:\\Tomaggo\\TestProject\\WorkingProject\\src\\com\\td\\task\\DictAllWords.txt");
////                File file = new File("F:\\All\\Tasks\\Tasks\\src\\com\\td\\task\\DictAllWords.txt");
//                Scanner scanner = new Scanner(file);
//                while (scanner.hasNext()) {
//                    timesArray.add(scanner.next());
//                }
//            } catch (Exception e) {
//               JOptionPane.showMessageDialog(this,"AddRow_AddRow \n Exception is Occured at Loading..... a File \n"+e.getMessage());
//            }
        for(ItemDetails item : CustomerBill.lstItems) {
            timesArray.add(item.getItemName());
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
        tfType = new javax.swing.JTextField();
        tfAmount = new javax.swing.JFormattedTextField();
        tfPrice = new javax.swing.JFormattedTextField();
        tfNo = new javax.swing.JFormattedTextField();

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
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNameKeyReleased(evt);
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

        ((AbstractDocument) tfType.getDocument()).setDocumentFilter(filter);
        tfType.setText("P");
        tfType.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfType.setPreferredSize(new java.awt.Dimension(8, 20));
        tfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTypeActionPerformed(evt);
            }
        });
        tfType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTypeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTypeKeyTyped(evt);
            }
        });

        tfAmount.setEditable(false);
        tfAmount.setBackground(new java.awt.Color(255, 255, 255));
        tfAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.##"))));
        tfAmount.setFocusable(false);
        tfAmount.setRequestFocusEnabled(false);

        tfPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.##"))));
        tfPrice.setPreferredSize(new java.awt.Dimension(69, 20));

        tfNo.setEditable(false);
        tfNo.setBackground(new java.awt.Color(255, 255, 255));
        tfNo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        tfNo.setFocusable(false);
        tfNo.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        for(ItemDetails idetail: CustomerBill.lstItems) {            
            if(String.valueOf(idetail.getItemNo()).equals(tfName.getText())) {
                tfPrice.setValue(idetail.getSellRate());
            }
        }
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyReleased
        
    }//GEN-LAST:event_tfNameKeyReleased

    private void tfTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTypeKeyPressed

    }//GEN-LAST:event_tfTypeKeyPressed

    private void tfTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTypeKeyTyped
        if(tfType.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_tfTypeKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem popAdd;
    public javax.swing.JPopupMenu popUpConfiguration;
    public javax.swing.JFormattedTextField tfAmount;
    public javax.swing.JTextField tfName;
    public javax.swing.JFormattedTextField tfNo;
    public javax.swing.JFormattedTextField tfPrice;
    public javax.swing.JTextField tfQuantity;
    public javax.swing.JTextField tfType;
    // End of variables declaration//GEN-END:variables
}
