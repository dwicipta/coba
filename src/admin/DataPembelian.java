/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tubes.About;
import tubes.Admin;
import tubes.Login;
import tubes.koneksi;

/**
 *
 * @author ggr
 */
public class DataPembelian extends javax.swing.JFrame {
Connection con = koneksi.getConnection();
private Dimension dmn = Toolkit.getDefaultToolkit().getScreenSize();
private  DefaultTableModel tabMode;
    /**
     * Creates new form Transaksi
     */
    public DataPembelian() {
        initComponents();
        datatabel();
        this.setTitle("Apotek");
        this.setLocation(dmn.width/2-this.getWidth()/2,dmn.height/2-this.getHeight()/2 );
    }
    
        protected void datatabel() {
      Object[] Baris={"Produsen","Nama Barang","Jumlah","Tanggal"};
      tabMode = new DefaultTableModel(null,Baris);
      tabel.setModel(tabMode);
      String sql ="SELECT * FROM pemasok";
      
      try{
          Statement stat = con.createStatement();
          ResultSet hasil = stat.executeQuery(sql);
          while(hasil.next()){
              String namap = hasil.getString("NamaPemasok");
              String namab = hasil.getString("NamaBarang");
              String jml = hasil.getString("Jumlah");
              String tgl = hasil.getString("Tanggal");
              String [] data ={namap,namab,jml,tgl};
              tabMode.addRow(data);
          }
         
      }catch (Exception e){
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cari = new javax.swing.JButton();
        ulang = new javax.swing.JButton();
        mencari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(669, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/button_previous_01.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 610, 230));

        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 30));

        ulang.setText("Ulang");
        ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulangActionPerformed(evt);
            }
        });
        getContentPane().add(ulang, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, 30));

        mencari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mencariKeyPressed(evt);
            }
        });
        getContentPane().add(mencari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("DATA PEMBELIAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/logo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/90580cca18c50e5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Keluar");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tentang");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        About about = new About();
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        if(mencari.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Tidak bisa mencari jika kosong !");
        }else{
            try{
                Statement stat = con.createStatement();
                String search = mencari.getText();
                ResultSet rs = stat.executeQuery("SELECT * FROM pemasok WHERE NamaPemasok like '%"+search+"%' OR Tanggal like '%"+search+"%' OR NamaBarang like '%"+search+"%'");
                DefaultTableModel model = (DefaultTableModel) tabel.getModel();
                model.setRowCount(0);
                String [] data = new String[5];
                while (rs.next()) {
                    data[0] = rs.getString("NamaPemasok");
                    data[2] = rs.getString("NamaBarang");
                    data[3] = rs.getString("Jumlah");
                    data[4] = rs.getString("Tanggal");
                    model.addRow(data);
                }
                rs.close();
                mencari.setText("");
            }catch (Exception e){
            }
        }
    }//GEN-LAST:event_cariActionPerformed

    private void ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulangActionPerformed
        datatabel();
    }//GEN-LAST:event_ulangActionPerformed

    private void mencariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mencariKeyPressed
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ENTER)
        if(mencari.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Tidak bisa mencari jika kosong !");
        }else{
            try{
                Statement stat = con.createStatement();
                String search = mencari.getText();
                ResultSet rs = stat.executeQuery("SELECT * FROM pemasok WHERE NamaPemasok like '%"+search+"%' OR Tanggal like '%"+search+"%' OR NamaBarang like '%"+search+"%'");
                DefaultTableModel model = (DefaultTableModel) tabel.getModel();
                model.setRowCount(0);
                String [] data = new String[5];
                while (rs.next()) {
                    data[0] = rs.getString("NamaPemasok");
                    data[1] = rs.getString("NamaBarang");
                    data[2] = rs.getString("Jumlah");
                    data[3] = rs.getString("Tanggal");
                    model.addRow(data);
                }
                rs.close();
                mencari.setText("");
            }catch (Exception e){
            }
        }
    }//GEN-LAST:event_mencariKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin adm = new Admin();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mencari;
    private javax.swing.JTable tabel;
    private javax.swing.JButton ulang;
    // End of variables declaration//GEN-END:variables
}
