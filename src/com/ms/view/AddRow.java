/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.view;

import com.ms.util.AutoTextComplete;
import com.ms.data.ItemDetails;
import java.awt.event.KeyEvent;
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
    CustomerBill customerBill;
    
    public AddRow(CustomerBill customerBill) {
        this.customerBill = customerBill;
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
        for (ItemDetails item : CustomerBill.lstItems) {
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
        tfQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuantityKeyTyped(evt);
            }
        });

        ((AbstractDocument) tfType.getDocument()).setDocumentFilter(filter);
        tfType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfType.setText("P");
        tfType.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfType.setPreferredSize(new java.awt.Dimension(8, 20));
        tfType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTypeKeyReleased(evt);
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
        tfPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPriceKeyTyped(evt);
            }
        });

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

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            popUpConfiguration.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tfNameMouseClicked

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        String strItem = tfName.getText();
        if (!strItem.isEmpty()) {
            for (ItemDetails idetail : CustomerBill.lstItems) {
                if (idetail.getItemName().equals(strItem)) {
                    tfPrice.setValue(idetail.getSellRate());
                }
            }
        }
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            tfName.transferFocus();
        }
    }//GEN-LAST:event_tfNameKeyReleased

    private void tfTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTypeKeyTyped
        if (tfType.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_tfTypeKeyTyped

    private void tfQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantityKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            tfQuantity.transferFocus();
        }
        if (!((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || evt.getKeyChar() == '.') {
            evt.consume();
        }
        float f = 0.0f;
        if (!tfPrice.getText().equals("") && !tfQuantity.getText().equals("") && !tfQuantity.getText().equals(".")) {
            f = Float.valueOf(tfQuantity.getText()) * Float.valueOf(tfPrice.getText());
        }
        tfAmount.setText(f + "");
        customerBill.setTotalAmount();
    }//GEN-LAST:event_tfQuantityKeyReleased

    private void tfPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPriceKeyTyped
        if ((Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '.' || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            if (evt.getKeyChar() == '.') {
                String text = tfPrice.getText();
                int indexOf = text.indexOf('.', 0);
                if (indexOf != -1) {
                    evt.consume();
                }
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tfPriceKeyTyped

    private void tfPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPriceKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            tfPrice.transferFocus();
        }
        if (!((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || evt.getKeyChar() == '.') {
            evt.consume();
        }
        float f = 0.0f;
        if (!tfQuantity.getText().equals("") && !tfPrice.getText().equals("") && !tfPrice.getText().equals(".")) {
            f = Float.valueOf(tfQuantity.getText()) * Float.valueOf(tfPrice.getText());
        }
        tfAmount.setText(f + "");
        customerBill.setTotalAmount();
    }//GEN-LAST:event_tfPriceKeyReleased

    private void tfQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantityKeyTyped
        if ((Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '.' || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            if (evt.getKeyChar() == '.') {
                String text = tfQuantity.getText();
                int indexOf = text.indexOf('.', 0);
                if (indexOf != -1) {
                    evt.consume();
                }
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tfQuantityKeyTyped

    private void tfTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTypeKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            tfType.transferFocus();
        }
    }//GEN-LAST:event_tfTypeKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem popAdd;
    private javax.swing.JPopupMenu popUpConfiguration;
    public javax.swing.JFormattedTextField tfAmount;
    public javax.swing.JTextField tfName;
    public javax.swing.JFormattedTextField tfNo;
    public javax.swing.JFormattedTextField tfPrice;
    public javax.swing.JTextField tfQuantity;
    public javax.swing.JTextField tfType;
    // End of variables declaration//GEN-END:variables
}
