/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicApp;

import Koneksi.Konfig;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class FormPendaftaranPasien extends javax.swing.JFrame {

    public void Kosongkan_Form(){
        txtnoreg.setText(null);
        txtnama.setText(null);
        txtalamat.setText(null);
        txttempat.setText(null);
        txttanggal.setText(null);
        cmbjk.setSelectedIndex(0);
        txthp.setText(null);
    /**
     * Creates new form FormPendaftaranPasien
     */
    public void FormPendaftaranPasien() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnoreg = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txttempat = new javax.swing.JTextField();
        cmbjk = new javax.swing.JComboBox<>();
        txttanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataregis = new javax.swing.JTable();
        txthp = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("No. Telepon");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("No. Registrasi");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 90, 40));

        txtnoreg.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtnoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoregActionPerformed(evt);
            }
        });
        jPanel2.add(txtnoreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, -1));

        txtnama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel2.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 230, -1));

        txtalamat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 230, -1));

        txttempat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(txttempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 230, -1));

        cmbjk.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbjk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 230, -1));

        txttanggal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 230, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nama Pasien");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Tempat Lahir");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Tanggal Lahir");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 40));

        btnsimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 190, -1));

        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        jPanel2.add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Modern Healthcare Clinic Logodj.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 90));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setText("Klinik \" Helgi \"");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 350, 60));

        jLabel24.setFont(new java.awt.Font("Cambria", 2, 16)); // NOI18N
        jLabel24.setText("Mitra Pelayanan Kesehatan Yang Menjamin Kepuasan Pasien");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 20));

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 110));

        jPanel6.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Form Pendaftaran");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, -1));

        jPanel7.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 10));

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        dataregis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Registrasi", "Nama Pasien", "Alamat", "Tempat Lahir", "Tanggal Lahir", "No. Telepon", "Jenis Kelamin"
            }
        ));
        jScrollPane1.setViewportView(dataregis);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 730, 320));

        txthp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txthp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthpActionPerformed(evt);
            }
        });
        jPanel2.add(txthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 230, -1));

        btnedit.setText("Edit");
        jPanel2.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));

        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        jPanel2.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 140, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoregActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO tb_klinik VALUES ('"+txtnoreg.getText()+"','"+ txtnama.getText()+"','"+ txtalamat.getText()+"','"+ txttempat.getText()+"','"+ txttanggal.getText()+"','"+ cmbjk.getSelectedIndex()+"','"+ txthp.getText()+"')";
            java.sql.Connection con = (java.sql.Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        Kosongkan_Form();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txthpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthpActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FormBeranda().setVisible(true);
    }//GEN-LAST:event_btnkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaranPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbjk;
    private javax.swing.JTable dataregis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnoreg;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txttempat;
    // End of variables declaration//GEN-END:variables

}
