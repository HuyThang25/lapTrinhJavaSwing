/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS TUF
 */
public class FormKhach extends javax.swing.JFrame {

    /**
     * Creates new form FormKhach
     * @throws java.io.IOException
     */
    public FormKhach() throws IOException {
        initComponents();
        d.readFromFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bTimKiem = new javax.swing.JButton();
        lTrong = new javax.swing.JLabel();
        lTimKiem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bTimKiem1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiem1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lTimKiem1 = new javax.swing.JLabel();
        bTimKiem2 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        bVeTrangTru = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        bDangNhap = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nhập \"*\" để hiện thị tất cả");

        bTimKiem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bTimKiem.setText("Tìm kiếm");
        bTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimKiemActionPerformed(evt);
            }
        });

        lTrong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTrong.setForeground(new java.awt.Color(255, 0, 51));

        lTimKiem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "English", "VietNamese"
            }
        ));
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);

        bTimKiem1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bTimKiem1.setText("Reset");
        bTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimKiem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bTimKiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bTimKiem))
                        .addGap(4, 4, 4)
                        .addComponent(lTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bTimKiem1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Tìm kiếm theo tiền tố", jPanel1);

        txtTimKiem1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Tìm kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "English", "VietNamese"
            }
        ));
        jTable2.setRowHeight(24);
        jScrollPane2.setViewportView(jTable2);

        lTimKiem1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTimKiem1.setForeground(new java.awt.Color(255, 0, 51));

        bTimKiem2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bTimKiem2.setText("Reset");
        bTimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimKiem2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(bTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton3))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bTimKiem2)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tìm kiếm một từ", jPanel2);

        jToolBar1.setRollover(true);

        bVeTrangTru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bVeTrangTru.setText("Về trang trủ");
        bVeTrangTru.setFocusable(false);
        bVeTrangTru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVeTrangTru.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bVeTrangTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVeTrangTruActionPerformed(evt);
            }
        });
        jToolBar1.add(bVeTrangTru);
        jToolBar1.add(jSeparator1);

        bDangNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bDangNhap.setText("Đăng nhập");
        bDangNhap.setFocusable(false);
        bDangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDangNhapActionPerformed(evt);
            }
        });
        jToolBar1.add(bDangNhap);
        jToolBar1.add(jSeparator2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static Dictionary d = new Dictionary();
    DefaultTableModel model;
    DefaultTableModel mode2;
    private void bDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDangNhapActionPerformed

        this.setVisible(false);
        FormDangNhap fDangNhap= new FormDangNhap();
        fDangNhap.setVisible(true);
    }//GEN-LAST:event_bDangNhapActionPerformed

    private void bVeTrangTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVeTrangTruActionPerformed

        this.setVisible(false);
        FormTrangChu fTrangChu= new FormTrangChu();
        fTrangChu.setVisible(true);
    }//GEN-LAST:event_bVeTrangTruActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (txtTimKiem1.getText().equals("")){
            lTimKiem1.setText("Vui long nhap");
        }
        else{
            lTimKiem1.setText("");
            if (d.findByEnglish(txtTimKiem1.getText())==-1){
                lTimKiem1.setText("Tu khong ton tai");
            }
            else{
                lTimKiem1.setText("");
                mode2 = (DefaultTableModel) jTable2.getModel();
                mode2.setRowCount(0);
                int i=d.findByEnglish(txtTimKiem1.getText());
                mode2.addRow(new Object[]{
                    i+1, d.getDs().get(i).getEn(),d.getDs().get(i).getVn()
                });
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private char upcase(char c){
        if (c>='a' && c<='z') c-=32;
        return c;
    }
    private boolean laTienTo(String child,String parent){
        if (child.length()>parent.length()) return false;
        else if (child.length()==parent.length()){
            return child.equalsIgnoreCase(parent);
        }
        else {
            for (int i=0; i<child.length(); i++){
                if (upcase(child.charAt(i))!=upcase(parent.charAt(i))) return false;
            }
            return true;
        }
    }
    private void bTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimKiemActionPerformed
        // TODO add your handling code here:
        if (txtTimKiem.getText().equals("")){
            lTrong.setText("Vui long nhap");
        }
        else {
            lTrong.setText("");
            model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            if (txtTimKiem.getText().equals("*")){
                for(int i=0; i< d.getDs().size(); i++){
                    model.addRow(new Object[]{
                        i+1, d.getDs().get(i).getEn(),d.getDs().get(i).getVn()
                    });
                }
            }else{
                boolean tonTai=false;
                for (int i=0; i<d.getDs().size(); i++){
                    if (laTienTo(txtTimKiem.getText(),d.getDs().get(i).getEn())) {
                        tonTai=true;
                        // them vao bang
                        model.addRow(new Object[]{
                            i+1, d.getDs().get(i).getEn(),d.getDs().get(i).getVn()
                        });
                    }
                }
                if(!tonTai) lTimKiem.setText("Khong co tu nao");
                else lTimKiem.setText("");
            }
        }
    }//GEN-LAST:event_bTimKiemActionPerformed

    private void bTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimKiem1ActionPerformed
        // TODO add your handling code here:
        txtTimKiem.setText("");
        lTrong.setText("");
        lTimKiem.setText("");
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_bTimKiem1ActionPerformed

    private void bTimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimKiem2ActionPerformed
        // TODO add your handling code here:
        txtTimKiem1.setText("");
        lTimKiem1.setText("");
        mode2 = (DefaultTableModel) jTable2.getModel();
        mode2.setRowCount(0);
    }//GEN-LAST:event_bTimKiem2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

            try {
                new FormKhach().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(FormKhach.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDangNhap;
    private javax.swing.JButton bTimKiem;
    private javax.swing.JButton bTimKiem1;
    private javax.swing.JButton bTimKiem2;
    private javax.swing.JButton bVeTrangTru;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lTimKiem;
    private javax.swing.JLabel lTimKiem1;
    private javax.swing.JLabel lTrong;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiem1;
    // End of variables declaration//GEN-END:variables
}
