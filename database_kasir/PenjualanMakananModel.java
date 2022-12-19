/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_kasir;

import db.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class PenjualanMakananModel {
    private final Connection koneksi;

    public PenjualanMakananModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addPenjualanMakanan(PenjualanMakanan pmkn) {
        String insert = "INSERT INTO penjualan_makanan(id_penjualan, listMakanan, "
                + "jumlahMakanan, stok, pajak) VALUES ('"+pmkn.getId_penjualan()+"',"
                + "'"+pmkn.getId()+"','"+pmkn.getJumlahBarang()+"','"+pmkn.getStok()+"','"+pmkn.getPajak()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updPenjualanMakanan(PenjualanMakanan pmkn) {
        String update = "UPDATE penjualan_makanan SET id_penjualan='"+pmkn.getId_penjualan()+"',"
                + "listMakanan='"+pmkn.getId()+"',jumlahMakanan='"+pmkn.getJumlahBarang()+"',"
                + "stok='"+pmkn.getStok()+"',pajak='"+pmkn.getPajak()+"' WHERE "
                + "id_penjualan='"+pmkn.getId_penjualan()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delPenjualanMakanan(PenjualanMakanan pmkn) {
        String delete = "DELETE FROM penjualan_makanan WHERE id_penjualan='"+pmkn.getId_penjualan()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<PenjualanMakanan> getPenjualanMakanan (){
        String select = "SELECT * FROM `penjualan_makanan`";
        ArrayList<PenjualanMakanan> pmkn = new ArrayList<PenjualanMakanan>();
        
        ResultSet rs;
        try {
            rs = koneksi.createStatement().executeQuery(select);
            while(rs.next()){
                PenjualanMakanan temp = new PenjualanMakanan(rs.getInt("id_penjualan"),rs.getInt("listMakanan"),rs.getInt("jumlahMakanan"),rs.getInt("stok"),rs.getDouble("pajak"));
                pmkn.add(temp);
            }
            System.out.println("Berhasil menampilkan data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menampilkan data");
        }
        return pmkn;
    }
}
