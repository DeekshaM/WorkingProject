/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ms.view;

import com.ms.util.PrintUtilities;
import com.ms.data.BillDetails;
import com.ms.data.BillMain;
import com.ms.data.ItemDetails;
import com.ms.datafactory.CustomerDataFactory;
import static com.ms.datafactory.CustomerDataFactory.getValidUser;
import java.awt.HeadlessException;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author TRANSDYN\ery
 */
public class CustomerBill extends javax.swing.JFrame {

    /**
     * Creates new form ResearchTable
     */
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    List<String> lstUserDetails;
    DocumentFilter filter = new com.ms.util.UppercaseDocumentFilter();
    public static List<ItemDetails> lstItems;
    private List<BillDetails> lstOfTableInfo;
    private BillMain billDetails;
    public static final int defaultRowCount = 10;
    public static float fTotalAmount;

    public CustomerBill() throws ClassNotFoundException, SQLException, Exception {
        initComponents();
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
        int componentCount = pnlParent.getComponentCount();
        lstItems = CustomerDataFactory.getItems();
        setHeader();
        addDetails(componentCount + 1, defaultRowCount);
        lblDate.setText(dateFormat.format(date));
        lblCustomerBno.setText(String.valueOf(CustomerDataFactory.getBillNo() + 1));
        lstUserDetails = getValidUser("venu", "venugopal");
        if (lstUserDetails.isEmpty()) {
            JOptionPane.showMessageDialog(this, "UserName or Password wrong", "LoginUser", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void setHeader() {
        HeaderRow header = new HeaderRow();
        pnlParent.add(header);
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
        jPanel1 = new javax.swing.JPanel();
        lblTotalAmount = new javax.swing.JLabel();
        lblTotalName = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        tfRecivedAmt = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        btnNewBill = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Bill");
        setMaximumSize(new java.awt.Dimension(250, 160));
        setMinimumSize(new java.awt.Dimension(250, 160));
        setPreferredSize(new java.awt.Dimension(527, 363));

        pnlAll.setPreferredSize(new java.awt.Dimension(320, 444));
        pnlAll.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(250, 370));
        jPanel2.setLayout(new java.awt.BorderLayout());

        pnlParent.setBackground(new java.awt.Color(255, 255, 255));
        pnlParent.setPreferredSize(new java.awt.Dimension(100, 100));
        pnlParent.setLayout(new javax.swing.BoxLayout(pnlParent, javax.swing.BoxLayout.Y_AXIS));
        jPanel2.add(pnlParent, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        lblTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalAmount.setText("0.0");

        lblTotalName.setText("Total Amount : ");

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ms/images/print.png"))); // NOI18N
        btnPrint.setToolTipText("Print Bill");
        btnPrint.setBorder(null);
        btnPrint.setContentAreaFilled(false);
        btnPrint.setEnabled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ms/images/add.png"))); // NOI18N
        btnAdd.setMnemonic('A');
        btnAdd.setToolTipText("Add Item Row");
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tfRecivedAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRecivedAmtKeyTyped(evt);
            }
        });

        btnDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ms/images/Done.png"))); // NOI18N
        btnDone.setToolTipText("Insert Data Into Database");
        btnDone.setBorder(null);
        btnDone.setBorderPainted(false);
        btnDone.setContentAreaFilled(false);
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnNewBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ms/images/newBill.png"))); // NOI18N
        btnNewBill.setToolTipText("New Bill");
        btnNewBill.setBorderPainted(false);
        btnNewBill.setContentAreaFilled(false);
        btnNewBill.setDoubleBuffered(true);
        btnNewBill.setEnabled(false);
        btnNewBill.setMaximumSize(new java.awt.Dimension(17, 17));
        btnNewBill.setMinimumSize(new java.awt.Dimension(17, 17));
        btnNewBill.setPreferredSize(new java.awt.Dimension(17, 17));
        btnNewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBillActionPerformed(evt);
            }
        });

        jLabel7.setText("Recived Amount :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addGap(11, 11, 11)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnDone)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRecivedAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalName)
                .addGap(0, 0, 0)
                .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDone)
                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfRecivedAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(btnNewBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.SOUTH);

        pnlAll.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        pnlHeader1.setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("Miriam", 3, 18)); // NOI18N
        lblHeader.setText("Dummy Project for ValueLabs ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Hitech City, Madapur, Hyderabad,  Mobile - 9949493340");

        javax.swing.GroupLayout pnlHeader1Layout = new javax.swing.GroupLayout(pnlHeader1);
        pnlHeader1.setLayout(pnlHeader1Layout);
        pnlHeader1Layout.setHorizontalGroup(
            pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeader1Layout.createSequentialGroup()
                .addGroup(pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeader1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblHeader))
                    .addGroup(pnlHeader1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel9)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        pnlHeader1Layout.setVerticalGroup(
            pnlHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeader1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jLabel9))
        );

        jPanel4.add(pnlHeader1, java.awt.BorderLayout.NORTH);

        pnlDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lblName.setText("Name :");

        lblBno.setText("B.No :");

        jLabel6.setText("Date :");

        lblDate.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        lblDate.setText("0");

        lblCustomerBno.setText("1");

        ((AbstractDocument) tfName.getDocument()).setDocumentFilter(filter);

        lblArea.setText("Mobile No :");

        tfMobileNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMobileNumKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCustomerBno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblArea, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblName))
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBno)
                    .addComponent(lblCustomerBno)
                    .addComponent(jLabel6)
                    .addComponent(lblDate)))
        );

        jPanel4.add(pnlDetails, java.awt.BorderLayout.CENTER);

        pnlAll.add(jPanel4, java.awt.BorderLayout.NORTH);

        getContentPane().add(pnlAll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        PrintMultipleTables printMultipleTables = new PrintMultipleTables(lstOfTableInfo, billDetails);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void setDataInDB() {
        try {
//            if (tfName.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Please Enter Customer Name", "Customer Name Can't be blank", JOptionPane.INFORMATION_MESSAGE);
//                return;
//            }
//            if (tfMobileNum.getText().length() < 10) {
//                JOptionPane.showMessageDialog(this, "Please Enter Customer Mobile No", "Mobile No Can't be blank", JOptionPane.INFORMATION_MESSAGE);
//                return;
//            }
//            if(tfRecivedAmt.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Please Enter Recived Amount", "Recived Amount Can't be blank", JOptionPane.INFORMATION_MESSAGE);
//                return;
//            }
            setItemInfo();
            if (lstOfTableInfo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Item Details", "Item Details Can't be blank", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            setBillInfo();
            CustomerDataFactory.setBillItems(lstOfTableInfo);
            CustomerDataFactory.setBillDetails(billDetails);
            CustomerDataFactory.addTransction(lblDate.getText(), lblCustomerBno.getText() + ", " + tfName.getText(), Float.valueOf(tfRecivedAmt.getText().isEmpty() ? "0" : tfRecivedAmt.getText()));            
            JOptionPane.showMessageDialog(this, "Bill Successfully Inserted in DB", "Bill Inserted Successfully", JOptionPane.INFORMATION_MESSAGE);
            resetButtons();
        } catch (HeadlessException | NumberFormatException | ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addDetails(pnlParent.getComponentCount() + 1, 1);
        setWidth();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfMobileNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMobileNumKeyTyped
        if (!((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || tfMobileNum.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_tfMobileNumKeyTyped

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        setDataInDB();
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnNewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBillActionPerformed
        try {
            this.removeAll();
            this.dispose();
            new CustomerBill().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CustomerBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNewBillActionPerformed

    private void tfRecivedAmtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRecivedAmtKeyTyped
        if (!((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_tfRecivedAmtKeyTyped

    private void addDetails(int iComp, int add) {
        for (int i = iComp; i < iComp + add; i++) {
            AddRow row = new AddRow(this);
            row.tfNo.setValue(i);
            pnlParent.add(row);
        }
    }

    public void setTotalAmount() {
        float fTotalAmountValue = 0.0f;
        for (int i = 1; i < pnlParent.getComponentCount(); i++) {
            String text = ((AddRow) pnlParent.getComponent(i)).tfAmount.getText();
            if (!text.isEmpty()) {
                fTotalAmountValue += Float.valueOf(text);
            }
        }
        lblTotalAmount.setText(fTotalAmountValue + "");
    }

    public void setWidth() {
        this.setSize(this.getWidth(), this.getHeight() + 16 + defaultRowCount - 6);
    }

    private class MyDispatcher implements KeyEventDispatcher {

        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_RELEASED) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    int iComp = pnlParent.getComponentCount();
                    addDetails(iComp + 1, 1);
                    setWidth();
                }
                if (e.getKeyCode() == KeyEvent.VK_F3) {
                    PrintUtilities.printComponent(pnlAll);
                }
                if (e.getKeyCode() == KeyEvent.VK_F4) {
                    setDataInDB();
                }
            }
            return false;
        }
    }
    
    private void setBillInfo() {
        billDetails = new BillMain();
        billDetails.setBillNo(Integer.valueOf(lblCustomerBno.getText()));
        billDetails.setBillDate(lblDate.getText());
        billDetails.setName(tfName.getText());
        billDetails.setMobileNumber(tfMobileNum.getText());
        billDetails.setTotalAmt(Float.valueOf(lblTotalAmount.getText()));
        billDetails.setCreatedBy(lstUserDetails.get(0));
        billDetails.setReceivedAmt(Float.valueOf(tfRecivedAmt.getText().isEmpty() ? "0" : tfRecivedAmt.getText()));
    }

    private void setItemInfo() {
        lstOfTableInfo = new ArrayList<>();
        for (int i = 1; i < pnlParent.getComponentCount(); i++) {
            if (((AddRow) pnlParent.getComponent(i)).tfQuantity.getText().isEmpty() && ((AddRow) pnlParent.getComponent(i)).tfPrice.getText().isEmpty()
                    && ((AddRow) pnlParent.getComponent(i)).tfName.getText().isEmpty()) {
                continue;
            }
            BillDetails tableInfo = new BillDetails();
            if (!((AddRow) pnlParent.getComponent(i)).tfQuantity.getText().isEmpty() && !((AddRow) pnlParent.getComponent(i)).tfPrice.getText().isEmpty()
                    && !((AddRow) pnlParent.getComponent(i)).tfName.getText().isEmpty()) {
                tableInfo.setQuantity(Float.parseFloat(((AddRow) pnlParent.getComponent(i)).tfQuantity.getText()));
                tableInfo.setRate(Float.parseFloat(((AddRow) pnlParent.getComponent(i)).tfPrice.getText()));
                tableInfo.setItemName(((AddRow) pnlParent.getComponent(i)).tfName.getText());
                tableInfo.setNo(Integer.valueOf(((AddRow) pnlParent.getComponent(i)).tfNo.getText().trim()));
                tableInfo.setBillNumber(Integer.valueOf(lblCustomerBno.getText()));
                tableInfo.setItemType(((AddRow) pnlParent.getComponent(i)).tfType.getText());
                tableInfo.setAmount(Float.parseFloat(((AddRow) pnlParent.getComponent(i)).tfAmount.getText()));
                lstOfTableInfo.add(tableInfo);
                continue;
            }
            if (!((AddRow) pnlParent.getComponent(i)).tfQuantity.getText().isEmpty()) {
                tableInfo.setQuantity(Float.parseFloat(((AddRow) pnlParent.getComponent(i)).tfQuantity.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Quantity", "Quantity can't be blank" + i + 1, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!((AddRow) pnlParent.getComponent(i)).tfPrice.getText().isEmpty()) {
                tableInfo.setRate(Float.parseFloat(((AddRow) pnlParent.getComponent(i)).tfPrice.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Price", "Price can't be blank" + i + 1, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!((AddRow) pnlParent.getComponent(i)).tfName.getText().isEmpty()) {
                tableInfo.setItemName(((AddRow) pnlParent.getComponent(i)).tfName.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Item name", "Item Name can't be blank" + i + 1, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }
    
    private void resetButtons() {
        btnPrint.setEnabled(true);
        btnDone.setEnabled(false);
        btnAdd.setEnabled(false);
        btnNewBill.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNewBill;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBno;
    private javax.swing.JLabel lblCustomerBno;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    public javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblTotalName;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlHeader1;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JTextField tfMobileNum;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfRecivedAmt;
    // End of variables declaration//GEN-END:variables

}
