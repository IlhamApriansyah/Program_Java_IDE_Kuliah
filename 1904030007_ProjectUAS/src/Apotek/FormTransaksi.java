package Apotek;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormTransaksi extends javax.swing.JFrame {
    String user = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost:3306/1904030007_apotek";
    double total = 0;
    
    void aktif(){
        cbKode.setEnabled(true);
        txtQty.setEnabled(true);
        txtBayar.setEnabled(true);
    }
    
    void nonaktif(){
        txtNo.setEnabled(false);
        txtTgl.setEnabled(false);
        txtNamaProduk.setEnabled(false);
        txtHarga.setEnabled(false);
        txtSubTotal.setEnabled(false);
        txtTotal.setEnabled(false);
        txtKembali.setEnabled(false);
        cbKode.setEnabled(false);
        txtQty.setEnabled(false);
        txtBayar.setEnabled(false);
    }
    
    void bersih(){
        cbKode.setSelectedIndex(0);
        txtQty.setText("0");
        txtBayar.setText("0");
        txtNo.setText("");
        txtTgl.setText("");
        txtNamaProduk.setText("");
        txtHarga.setText("0");
        txtSubTotal.setText("0");
        txtTotal.setText("");
        txtKembali.setText("0");
    }
    
    void isiKode(){
        try{
        Connection conn = DriverManager.getConnection(url, user, pwd);
        Statement st = (Statement) conn.createStatement();
        ResultSet rs = st.executeQuery("select * from produk");
        while (rs.next()){
            cbKode.addItem(rs.getString("KodeProduk"));
        }
    }catch (SQLException e){
            System.out.println("Koneksi Gagal"+ e.toString());
        }
    }
    
    void otomatis(){
        try{
        Connection conn = DriverManager.getConnection(url, user, pwd);
        Statement st = (Statement) conn.createStatement();
        String sql = "select right (NoTransaksi,3)+1 from transaksi";
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()){
            rs.last();
            String no = rs.getString(1);
            while (no.length()<3){
                no = "0"+no;
                txtNo.setText("AP"+no);
            }
        }else{
            txtNo.setText("AP001");
        }
        }catch (SQLException e){
            
        }
    }
    
    void Simpan(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
          Statement st = (Statement) conn.createStatement();  
          String sql = "insert into transaksi values ('"+txtNo.getText()+"','"+txtTgl.getText()+"','"+txtTotal.getText()+"')";
          st.executeUpdate(sql);
          JOptionPane.showMessageDialog(this, "Transaksi sukses", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException e){
        System.out.println("Koneksi Gagal"+ e.toString());
        }
        formWindowActivated(null);
    }
    
    private Object[][] getData(){
        Object[][] data1 = null;
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
          Statement st = (Statement) conn.createStatement();
          ResultSet rs = st.executeQuery("select * from sementara");
          rs.last();
          int rowCount = rs.getRow();
          rs.beforeFirst();
          
          data1 = new Object[rowCount][5];
          int no=-1;
          while (rs.next()){
              no = no+1;
              data1[no][0] = rs.getString("KodeProduk");
              data1[no][1] = rs.getString("NamaProduk");
              data1[no][2] = rs.getString("Harga");
              data1[no][3] = rs.getString("Qty");
              data1[no][4] = rs.getString("SubTotal");
          }
        }catch (SQLException e){
            System.out.println("Koneksi Gagal"+ e.toString());
        }
        return data1;
    }
    
    void masukGrid(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
          Statement st = (Statement) conn.createStatement();
          String sql = "insert into sementara values ('"+cbKode.getSelectedItem()+"','"+txtNamaProduk.getText()+"','"+txtHarga.getText()+"','"+txtQty.getText()+"','"+txtSubTotal.getText()+"')";
          st.executeUpdate(sql);
        }catch (SQLException e){
            System.out.println("Koneksi Gagal"+ e.toString());
        }
    }
    
    void tampilGrid(){
        String[] columnNames = {"Kode Produk","Nama Produk","Harga","Qty","Sub Total"};
        JTable table = new JTable(getData(), columnNames);
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);
    }
    
    void hapusGrid(){
    try{
        Connection conn = DriverManager.getConnection(url, user, pwd);
        Statement st = (Statement) conn.createStatement();
        String sql = "delete from sementara";
        st.executeUpdate(sql);
    }catch(SQLException e){
        System.out.println("Koneksi Gagal"+ e.toString());
    }
}
    
     void penguranganStok(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
          Statement st = (Statement) conn.createStatement();
          String sql = "update produk set stock = stock - '"+txtQty.getText()+"' where KodeProduk = '"+cbKode.getSelectedItem()+"'";
          st.executeUpdate(sql);
        }catch (SQLException e){
            System.out.println("Koneksi Gagal"+ e.toString());
        }
    }
     
     
    /**
     * Creates new form FormTransaksi
     */
    public FormTransaksi() {
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

        jPanel1 = new javax.swing.JPanel();
        btnBeli = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtNamaProduk = new javax.swing.JTextField();
        cbKode = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSementara = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNo = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBeli.setText("Beli");
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });
        jPanel1.add(btnBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 50, -1));

        jLabel9.setText("Qty");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 50, -1));
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 110, -1));

        jLabel5.setText("Total Harga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data Produk");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 20));

        jLabel6.setText("Kode Produk");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setText("Harga");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel7.setText("Nama Produk");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 110, -1));

        txtNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProdukActionPerformed(evt);
            }
        });
        jPanel1.add(txtNamaProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        cbKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKodeActionPerformed(evt);
            }
        });
        jPanel1.add(cbKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 620, 110));

        tbSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Produk", "Nama Produk", "Harga", "Qty", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSementara);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 620, 170));

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 80, -1));

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, -1));

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 70, -1));

        jLabel10.setText("Total Harga");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel11.setText("Uang Bayar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel12.setText("Uang Kembali");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));
        getContentPane().add(txtKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 140, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 140, -1));

        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBayarKeyPressed(evt);
            }
        });
        getContentPane().add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("FORM TRANSAKSI PENJUALAN");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setText("APOTEK JAYA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        jPanel3.add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, -1));
        jPanel3.add(txtTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 140, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Transaksi");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tanggal");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 20));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        cbKode.removeAllItems();
        nonaktif();
        isiKode();
        bersih();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        txtTgl.setText(sdf.format(cal.getTime()));
        btnAdd.setEnabled(true);
        btnSave.setEnabled(false);
        btnBeli.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        aktif();
        otomatis();
        cbKode.grabFocus();
        btnBeli.setEnabled(true);
        btnSave.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Simpan();
        hapusGrid();
        tampilGrid();
        btnAdd.setEnabled(true);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKodeActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery("select * from produk where KodeProduk = '"+cbKode.getSelectedItem()+"'");
            if (rs.next()){
                txtNamaProduk.setText(rs.getString("NamaProduk"));
                txtHarga.setText(rs.getString("Harga"));
                txtQty.grabFocus();
            }
        }catch(SQLException e){
            System.out.println("Koneksi Gagal"+ e.toString());
        }
    }//GEN-LAST:event_cbKodeActionPerformed

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(txtQty.getText());
        int harga = Integer.parseInt(txtHarga.getText());
        double subtotal;
        subtotal = harga * qty;
        txtSubTotal.setText(Double.toString(subtotal));
        total = subtotal +total;
        txtTotal .setText(Double.toString(total));
        masukGrid();
        tampilGrid();
        penguranganStok();
    }//GEN-LAST:event_btnBeliActionPerformed

    private void txtBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            total = Double.parseDouble(txtTotal.getText());
            double bayar = Double.parseDouble(txtBayar.getText());
            double kembali;
            kembali = bayar - total;
            txtKembali.setText(Double.toString(kembali));
        }
    }//GEN-LAST:event_txtBayarKeyPressed

    private void txtNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProdukActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbKode;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSementara;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
