package Penjualan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
import java.awt.event.KeyEvent;

/**
 *
 * @author Administrator
 */
public class FormUser extends javax.swing.JFrame {

    String user = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost:3306/1904030007_penjualan";
    Boolean isi = true;
    
    /**
     * Creates new form FormUser
     */
    public FormUser() {
        initComponents();
    }
    
    void nonaktif(){
        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        txtPass.setEnabled(false);
        cbAkses.setEnabled(false);
    }
    
    void aktif(){
        txtKode.setEnabled(true);
        txtNama.setEnabled(true);
        txtPass.setEnabled(true);
        cbAkses.setEnabled(true);
    }
    
    void bersih(){
        txtKode.setText("");
        txtNama.setText("");
        txtPass.setText("");
        cbAkses.setSelectedIndex(0);
        txtCari.setText("");
    }
    
        void simpan(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            String sql = "insert into user values ('"+txtKode.getText()+"','"+txtNama.getText()+"','"+txtPass.getText()+"','"+cbAkses.getSelectedItem()+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data berhasil Disimpan","informasi", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println("Koneksi gagal"+ e.toString());
        }
        formWindowActivated(null);
    }
        
        void update(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            String sql =  "Update user set NamaUser='"+txtNama.getText()+"',Password='"+txtPass.getText()+"',HakAkses='"+cbAkses.getSelectedItem()+"' where KodeUser='"+txtKode.getText()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data Berhasil di Update", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException e){
            System.out.println("Koneksi gagal"+ e.toString());
        }
        formWindowActivated(null);
    }
        
         void delete(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            String sql =  "delete from barang where KodeUser='"+txtKode.getText()+"'";
            st.executeUpdate(sql);
 
            JOptionPane.showMessageDialog(this, "Data Berhasil di delete", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            System.out.println("Koneksi gagal"+ e.toString());
        }
        formWindowActivated(null);
    }
         
    void cari(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            ResultSet rs =  st.executeQuery("Select * from user where KodeUser= '"+txtCari.getText()+"'");
             if (rs.next()){
                txtKode.setText(rs.getString("KodeUser"));
                txtNama.setText(rs.getString("NamaUser"));
                txtPass.setText(rs.getString("Password"));
                if(rs.getString("HakAkses")=="Admin");
                cbAkses.setSelectedIndex(0);
             }else
             cbAkses.setSelectedIndex(1);
        }
        catch(SQLException e){
            System.out.println("Koneksi gagal"+ e.toString());
        }
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnAdd.setEnabled(false);
    }
    
    private Object[][] getData(){
          Object[][] data1 = null;
          try{
            Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            ResultSet rs = st.executeQuery("Select * from User");
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            
            data1 = new Object[rowCount][4];
            int no=-1;
            while (rs.next()){
                no=no+1;
                data1[no][0]=rs.getString("KodeUser");
                data1[no][1]=rs.getString("NamaUser");
                data1[no][2]=rs.getString("Password");
                data1[no][3]=rs.getString("HakAkses");
            }
          }catch(SQLException e){
              System.out.println("Koneksi gagal"+ e.toString()); 
          }
          return data1;
    }
    
    void tampil(){
          String[] columnNames = {"Kode User","Nama User","Password","HakAkses"};
          JTable table = new JTable(getData(), columnNames);
          table.setEnabled(false);
          jScrollPane1.setViewportView(table);
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        cbAkses = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("FORM USER");

        jLabel2.setText("Kode User");

        jLabel3.setText("Nama User");

        jLabel4.setText("Password");

        jLabel5.setText("Hak Akses");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        txtKode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeKeyPressed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Masukkan Kode User");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 144, -1));

        btnCari.setText("Search");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 43, -1, -1));

        cbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbUser);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(28, 28, 28)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(26, 26, 26)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNama))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(txtKode))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPass)
                                    .addComponent(cbAkses, 0, 94, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnClose))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        aktif();
        txtKode.grabFocus();
        btnAdd.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (isi ==true)
            simpan();
        else
            update();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        nonaktif();
        bersih();
        tampil();
        btnAdd.setEnabled(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

    private void txtKodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        try{
        Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            ResultSet rs = st.executeQuery("Select * from user where KodeUser ='"+txtKode.getText()+"'");
            if(rs.next()){
            JOptionPane.showMessageDialog(this, "Kode User sudah Ada", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_txtKodeKeyPressed
    catch(SQLException e){
                System.out.println("Koneksi gagal"+e.toString());
            } 
        }
    }
    
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        formWindowActivated(null);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        isi=false;
        aktif();
        btnEdit.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
       int result = JOptionPane.showConfirmDialog(this, "Mau dihapus?", "Informasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result== JOptionPane.YES_OPTION){
            delete();
            formWindowActivated(null);
        }
            formWindowActivated(null);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnCariActionPerformed
     
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbAkses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
