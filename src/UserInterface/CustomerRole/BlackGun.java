/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Gun.Bullet;
import Business.Gun.BulletInventoryitem;
import Business.Gun.Gun;
import Business.Gun.GunInventoryitem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShopRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reyes
 */
public class BlackGun extends javax.swing.JPanel {
    
    private JPanel display;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public BlackGun(JPanel display, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.display = display;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        poptable1();
        poptable2();
    }
    
    public void poptable1() {
        DefaultTableModel dtm1 = (DefaultTableModel) tbl1.getModel();
        dtm1.setRowCount(0);
        for (GunInventoryitem item : enterprise.getGunInventory()) {
            Object[] row = new Object[2];
            row[0] = item.getGun();
            row[1] = item.getPrice();
            dtm1.addRow(row);
        }
    }
    
    public void poptable2() {
        DefaultTableModel dtm2 = (DefaultTableModel) tbl2.getModel();
        dtm2.setRowCount(0);
        for (BulletInventoryitem item : enterprise.getBulletInventory()) {
            Object[] row = new Object[2];
            row[0] = item.getBullet();
            row[1] = item.getPrice();
            dtm2.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addguntocartbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        addbullettocartbtn = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gun", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl1);

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bullet", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Gun/Bullet Selling");

        addguntocartbtn.setBackground(new java.awt.Color(102, 102, 102));
        addguntocartbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addguntocartbtn.setForeground(new java.awt.Color(245, 245, 245));
        addguntocartbtn.setText("Buy Gun");
        addguntocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addguntocartbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Quantity");

        txt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(102, 102, 102));
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        addbullettocartbtn.setBackground(new java.awt.Color(102, 102, 102));
        addbullettocartbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addbullettocartbtn.setForeground(new java.awt.Color(245, 245, 245));
        addbullettocartbtn.setText("Buy Bullets");
        addbullettocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbullettocartbtnActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(102, 102, 102));
        Back.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(245, 245, 245));
        Back.setText("<<Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(addguntocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addComponent(addbullettocartbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbullettocartbtn, addguntocartbtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addguntocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbullettocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addbullettocartbtn, addguntocartbtn});

    }// </editor-fold>//GEN-END:initComponents

    private void addguntocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addguntocartbtnActionPerformed
        int selrow = tbl1.getSelectedRow();
        if (selrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from gun table!");
            return;
        }
        ShopRequest request = new ShopRequest();
        request.setSender(userAccount);
        Gun gun = (Gun) tbl1.getValueAt(selrow, 0);
        int price = (int) tbl1.getValueAt(selrow, 1);
        request.setGun(gun);
        request.setQuantity(Integer.parseInt(txt1.getText()));
        request.setPrice(price);
        request.setStatus("ILLEGAL");
        enterprise.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_addguntocartbtnActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1KeyTyped

    private void addbullettocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbullettocartbtnActionPerformed
        int selrow = tbl2.getSelectedRow();
        
        if (selrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from bullet table!");
            return;
        }
        ShopRequest request = new ShopRequest();
        request.setSender(userAccount);
        Bullet bullet = (Bullet) tbl2.getValueAt(selrow, 0);
        int price = (int) tbl2.getValueAt(selrow, 1);
        request.setBullet(bullet);
        request.setQuantity(Integer.parseInt(txt1.getText()));
        request.setPrice(price);
        request.setStatus("ILLEGAL");
        enterprise.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_addbullettocartbtnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        display.remove(this);
        CardLayout layout = (CardLayout) display.getLayout();
        layout.previous(display);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton addbullettocartbtn;
    private javax.swing.JButton addguntocartbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
