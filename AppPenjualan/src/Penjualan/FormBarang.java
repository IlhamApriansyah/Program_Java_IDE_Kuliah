package Penjualan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
/**
 *
 * @author Administrator
 */
public class FormBarang extends javax.swing.JFrame {

    String user = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost:3306/1904030007_penjualan";
    Boolean isi = true;
    /**
     * Creates new form FormBarang
     */
    public FormBarang() {
        initComponents();
    }

    void aktif(){
        txtkode.setEnabled(true);
        txtnama.setEnabled(true);
        txtHarga.setEnabled(true);
        txtStok.setEnabled(true);
    }
    
    void nonAktif(){
        txtkode.setEnabled(false);
        txtnama.setEnabled(false);
        txtHarga.setEnabled(false);
        txtStok.setEnabled(false);
    }
    
    void bersih(){
        txtkode.setText("");
        txtnama.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        txtCari.setText("");
    }
    
    void otomatis(){
        try{
            Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement();
            String sql = "Select right (KodeBarang,3)+1 from barang";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                rs.last();
                String kode = rs.getString(1);
                while (kode.length()<3){
                    kode="0"+kode;
                    txtkode.setText("BR"+kode);
                }
            }else{
                txtkode.setText("BR001");
            }
            
        }catch(Exception e){
    }
    }
    
        void simpan(){
        try{
          Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            String sql = "insert into barang values ('"+txtkode.getText()+"','"+txtnama.getText()+"','"+txtHarga.getText()+"','"+txtStok.getText()+"')";
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
            String sql =  "Update barang set NamaBarang='"+txtnama.getText()+"',Harga='"+txtHarga.getText()+"',Stok='"+txtStok.getText()+"' where KodeBarang='"+txtkode.getText()+"'";
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
            String sql =  "delete from barang where KodeBarang ='"+txtkode.getText()+"'";
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
            ResultSet rs =  st.executeQuery("Select * from barang where KodeBarang= '"+txtCari.getText()+"'");
             if (rs.next()){
                txtkode.setText(rs.getString("KodeBarang"));
                txtnama.setText(rs.getString("NamaBarang"));
                txtHarga.setText(rs.getString("Harga"));
                txtStok.setText(rs.getString("Stok"));              
             }
        }catch(SQLException e){
            System.out.println("Koneksi gagal"+ e.toString());
        }
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnAdd.setEnabled(true);
    }
      
      private Object[][] getData(){
          Object[][] data1 = null;
          try{
            Connection conn = DriverManager.getConnection(url, user, pwd);
            Statement st = (Statement) conn.createStatement(); 
            ResultSet rs = st.executeQuery("Select * from barang");
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            data1 = new Object[rowCount][4];
            int no=-1;
            while (rs.next()){
                no=no+1;
                data1[no][0]=rs.getString("KodeBarang");
                data1[no][1]=rs.getString("NamaBarang");
                data1[no][2]=rs.getString("Harga");
                data1[no][3]=rs.getString("Stok");
            }
          }catch(SQLException e){
              System.out.println("Koneksi gagal"+ e.toString()); 
          }
          return data1;
      }
      
      void tampil(){
          String[] columnNames = {"Kode Barang","Nama Barang","Harga","Stok"};
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
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBarang = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("FORM BARANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setText("Kode Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("Harga");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("Stok");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, -1));
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, -1));
        getContentPane().add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, -1));

        tbBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 620, 220));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 80, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 80, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 80, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 80, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 90, -1));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 70, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Masukkan Kode Barang");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 11, -1, -1));

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 149, -1));

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 290, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (isi ==true)
            simpan();
        else
            update();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Mau dihapus?", "Informasi", JOptionPane.YES_NO_OPTION);
        if((JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            delete();
            formWindowActivated(null);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        nonAktif();
        bersih();
        tampil();
        btnAdd.setEnabled(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        aktif();
        otomatis();
        txtnama.grabFocus();
        btnAdd.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBarang;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
