/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.task;

import com.td.base.data.BillDetails;
import com.td.base.data.CustomerBillInfo;
import com.td.base.data.TableColumnsInfo;
import com.td.dataFactory.CustomerDataFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author TRANSDYN\ery
 */
public class ResearchTable extends javax.swing.JFrame {

    /**
     * Creates new form ResearchTable
     */
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy:hh:mm:ss aa");
    Date date = new Date();
    public ResearchTable() throws ClassNotFoundException, SQLException, Exception {
        setUIFont (new javax.swing.plaf.FontUIResource("Verdana",Font.PLAIN,11));
        initComponents();
        int componentCount = pnlParent.getComponentCount();
        addDetails(componentCount + 1,5);
        lblDate.setText(dateFormat.format(date) + "");
//        lblCustomerBno.setText(String.valueOf(CustomerDataFactory.getBillNumbers()+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAll = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlParent = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTotalAmount = new javax.swing.JLabel();
        lblTotalName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        pnlHeader1 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlDetails = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblBno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblCustomerBno = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        tfMobileNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 160));
        setMinimumSize(new java.awt.Dimension(250, 160));
        setPreferredSize(new java.awt.Dimension(440, 160));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        pnlAll.setPreferredSize(new java.awt.Dimension(320, 444));
        pnlAll.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(250, 370));
        jPanel2.setLayout(new java.awt.BorderLayout());

        pnlParent.setBackground(new java.awt.Color(255, 255, 255));
        pnlParent.setLayout(new javax.swing.BoxLayout(pnlParent, javax.swing.BoxLayout.Y_AXIS));
        jPanel2.add(pnlParent, java.awt.BorderLayout.CENTER);

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Item Name");

        jLabel3.setText("Qty");

        jLabel4.setText("Price");

        jLabel5.setText("Amount");

        jLabel1.setText("  No.");

        jLabel8.setText("T");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1))
        );

        jPanel2.add(pnlHeader, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        lblTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalAmount.setText("0.0");

        lblTotalName.setText("Total Amount : ");

        jLabel7.setText("Signature");

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/td/task/print.png"))); // NOI18N
        btnPrint.setToolTipText("Print");
        btnPrint.setBorder(null);
        btnPrint.setContentAreaFilled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/td/task/add.png"))); // NOI18N
        btnAdd.setMnemonic('A');
        btnAdd.setToolTipText("Add Rows");
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/td/task/remove.png"))); // NOI18N
        btnRemove.setMnemonic('R');
        btnRemove.setToolTipText("Remove Rows");
        btnRemove.setBorder(null);
        btnRemove.setContentAreaFilled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(btnAdd)
                .addGap(4, 4, 4)
                .addComponent(btnRemove)
                .addGap(4, 4, 4)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalName)
                .addGap(2, 2, 2)
                .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotalAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.SOUTH);

        pnlAll.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        pnlHeader1.setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblHeader.setText("Manchala Shankaraiah & Sons, ");

        jLabel9.setText("Markandaya Street, Sircilla");

        javax.swing.GroupLayout pnlHeader1Layout = new javax.swing.GroupLayout(pnlHeader1);
        pnlHeader1.setLayout(pnlHeader1Layout);
        pnlHeader1Layout.setHorizontalGroup(
            pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeader1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlHeader1Layout.setVerticalGroup(
            pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeader1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2))
        );

        jPanel4.add(pnlHeader1, java.awt.BorderLayout.NORTH);

        pnlDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        pnlDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("Name");
        pnlDetails.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        lblBno.setText("B.No ");
        pnlDetails.add(lblBno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setText("Date ");
        pnlDetails.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, -1));

        lblDate.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        lblDate.setText("0");
        pnlDetails.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 124, -1));

        lblCustomerBno.setText("1");
        pnlDetails.add(lblCustomerBno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 45, -1));
        pnlDetails.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 140, -1));

        lblArea.setText("Mobile No");
        pnlDetails.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        tfMobileNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMobileNumKeyTyped(evt);
            }
        });
        pnlDetails.add(tfMobileNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 125, -1));

        jPanel4.add(pnlDetails, java.awt.BorderLayout.CENTER);

        pnlAll.add(jPanel4, java.awt.BorderLayout.NORTH);

        getContentPane().add(pnlAll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            PrintUtilities.printComponent(pnlAll);
                    CustomerBillInfo cd=new CustomerBillInfo();
                    cd.setName(tfName.getText());
                    cd.setMobileNum(tfMobileNum.getText());
                    cd.setBillNumber(Integer.parseInt(lblCustomerBno.getText()));
                    cd.setTotalAmt(Double.parseDouble(lblTotalAmount.getText()));
                    Date date = dateFormat.parse(lblDate.getText());
                    cd.setLastBillDate(date);
                    List<BillDetails> lstOfTableInfo = new ArrayList<>();
                    
                    
            for (int i = 0; i < pnlParent.getComponentCount(); i++) {
                BillDetails tableInfo = new BillDetails();
                if (!((AddRow)pnlParent.getComponent(i)).tfQuantity.getText().isEmpty() && !((AddRow)pnlParent.getComponent(i)).tfPrice.getText().isEmpty()) {
                    tableInfo.setItemName(((AddRow)pnlParent.getComponent(i)).tfName.getText());
                    tableInfo.setQuantity(Float.parseFloat(((AddRow)pnlParent.getComponent(i)).tfQuantity.getText()));
                    tableInfo.setPieceRate(Float.parseFloat(((AddRow)pnlParent.getComponent(i)).tfPrice.getText()));
                    tableInfo.setAmount(Float.parseFloat(((AddRow)pnlParent.getComponent(i)).tfAmount.getText()));                   
                    lstOfTableInfo.add(tableInfo);
                }

            }
            cd.setLstOfTableInfo(lstOfTableInfo);
          int iResult = CustomerDataFactory.setBLOBObject(cd);
         
          if(iResult > 0){
              System.out.println("inserted successfully");
          }
        } catch (Exception ex) {
            Logger.getLogger(ResearchTable.class.getName()).log(Level.SEVERE, null, ex);
        }
               

    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int iComp = pnlParent.getComponentCount();
        if (iComp < 30) {
            addDetails(iComp + 1,1);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        for (int iCount = pnlParent.getComponentCount() - 1; iCount >= 5; iCount--) {
            AddRow row = ((AddRow) pnlParent.getComponent(iCount));
            if (row.tfName.getText().equals("") && row.tfQuantity.getText().equals("") && row.tfPrice.getText().equals("")) {
                pnlParent.remove(iCount);
            }
        }
        if (pnlParent.getComponentCount() == 0) {
            AddRow row = new AddRow();
            pnlParent.add(row);
        }
        for (int i = 0; i < pnlParent.getComponentCount(); i++) {
            AddRow row = ((AddRow) pnlParent.getComponent(i));
            row.tfNo.setText(" "+(i + 1)+" ");
        }
        int componentCount = pnlParent.getComponentCount();
        int iHeight = 5 * 19 + 6;
        pnlParent.setPreferredSize(new Dimension(654, pnlParent.getHeight() - iHeight));
        pnlParent.setMaximumSize(new Dimension(654, pnlParent.getHeight() - iHeight));
        this.setSize(this.getWidth(), this.getHeight() - iHeight);
        pnlParent.validate();
        pnlParent.repaint();
        this.validate();
        this.repaint();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        System.out.println(this.getHeight());
    }//GEN-LAST:event_formComponentResized

    private void tfMobileNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMobileNumKeyTyped
        
         if (!((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') ||evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) ||tfMobileNum.getText().length()==10) 
         {
             evt.consume();
         }
        
    }//GEN-LAST:event_tfMobileNumKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void addDetails(int iComp,int add ) {
        for (int i = iComp; i < iComp + add; i++) {
            final AddRow row = new AddRow();
            row.tfNo.setText(" " + i + " ");
            if (pnlParent.getComponentCount() != 30) {
                pnlParent.add(row);
            } else {
                break;
            }

            row.tfQuantity.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    float f = 0.0f;
                    if (!row.tfPrice.getText().equals("") && !row.tfQuantity.getText().equals("") && !row.tfQuantity.getText().equals(".")) {
                        f = Float.valueOf(Float.valueOf(row.tfQuantity.getText()) * Float.valueOf(row.tfPrice.getText()));
                        row.tfAmount.setText(f + "");
                    } else {
                        row.tfAmount.setText(f + "");
                    }
                    float fTotalAmountValue = 0.0f;
                    for (int i = 0; i < pnlParent.getComponentCount(); i++) {
                        String text = ((AddRow) pnlParent.getComponent(i)).tfAmount.getText();
                        if (!text.isEmpty()) {
                            fTotalAmountValue += Float.valueOf(text);
                        }
                    }
                    lblTotalAmount.setText(fTotalAmountValue+"");
                }

                @Override
                public void keyTyped(KeyEvent e) {
                    if ((Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                        if (e.getKeyChar() == '.') {
                            String text = row.tfQuantity.getText();
                            int indexOf = text.indexOf('.', 0);
                            if (indexOf != -1) {
                                e.consume();
                            }
                        }
                    } else {
                        e.consume();
                    }
                }
            });

            row.tfPrice.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    float f=0.0f;
                    if (!row.tfQuantity.getText().equals("") && !row.tfPrice.getText().equals("") && !row.tfPrice.getText().equals(".")) {
                         f = Float.valueOf(Float.valueOf(row.tfQuantity.getText()) * Float.valueOf(row.tfPrice.getText()));
                        row.tfAmount.setText(f + "");
                    } else {
                        row.tfAmount.setText(f+"");
                    }
                    float fTotalAmountValue = 0.0f;
                    for (int i = 0; i < pnlParent.getComponentCount(); i++) {
                        String text = ((AddRow) pnlParent.getComponent(i)).tfAmount.getText();
                        if (!text.isEmpty()) {
                            fTotalAmountValue += Float.valueOf(text);
                        }
                    }
                    lblTotalAmount.setText(fTotalAmountValue+"");
                }

                @Override
                public void keyTyped(KeyEvent e) {
                    if ((Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                        if (e.getKeyChar() == '.') {
                            String text = row.tfPrice.getText();
                            int indexOf = text.indexOf('.', 0);
                            if (indexOf != -1) {
                                e.consume();
                            }
                        }
                    } else {
                        e.consume();
                    }
                }
            });
        }
        setWidth(add);
    }

    public void setWidth(int add) {
        int componentCount = pnlParent.getComponentCount();
        System.out.println(pnlParent.getHeight());
        pnlParent.setPreferredSize(new Dimension(654, add * 16 + 5));
        pnlParent.setMaximumSize(new Dimension(654, add * 16 + 5));
        jPanel2.setPreferredSize(new Dimension(654, add * 16 + 5));
        jPanel2.setMaximumSize(new Dimension(654, add * 16 + 5));
        this.setSize(this.getWidth(), this.getHeight() + add * 16 + 5);
        pnlParent.validate();
        pnlParent.repaint();
        this.validate();
        this.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResearchTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResearchTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResearchTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResearchTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ResearchTable().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ResearchTable.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ResearchTable.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ResearchTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private static void setUIFont(javax.swing.plaf.FontUIResource f)
{
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements())
    {
        Object key = keys.nextElement();
        Object value = UIManager.get(key);
        if (value instanceof javax.swing.plaf.FontUIResource)
        {
            UIManager.put(key, f);
        }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBno;
    private javax.swing.JLabel lblCustomerBno;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblTotalName;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHeader1;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JTextField tfMobileNum;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
