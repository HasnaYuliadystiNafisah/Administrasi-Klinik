/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicApp;

import Koneksi.Konfig;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
class DefaultTableModel {
    public void tampilkan_data() throws SQLException{
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("no_pendaftaran");
        model.addColumn("nama_pasien");
        model.addColumn("alamat");
        model.addColumn("tempat_lahir");
        model.addColumn("tanggal_lahir");
        model.addColumn("jenis_kelamin");
        model.addColumn("no_telepon");
        
        try{
            int no = 1;
            String sql = "Select * from tb_klinik";
            java.sql.Connection conn =(Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
                
                dataregis.setModel(model);
            
            }
        }catch(SQLException e){
            System.out.println("ERROR :" +e.getMessage());
        }
    }

    DefaultTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addColumn(String no_pendaftaran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addRow(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static class dataregis {

        private static void setModel(DefaultTableModel model) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public dataregis() {
            initComponents();
            try {
                tampilkan_data();
            } catch (SQLException ex) {
                Logger.getLogger(DefaultTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void initComponents() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        }
    }
}


