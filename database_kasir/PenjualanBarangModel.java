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
public class PenjualanBarangModel {
    private final Connection koneksi;

    public PenjualanBarangModel() {
        this.koneksi = DBHelper.getConnection();
    }
    
    public void addPenjualanBarang(PenjualanBarang pbrg) {
        String insert = "INSERT INTO penjualan_barang(id_penjualan, listBarang, "
                + "jumlahBarang, stok, pajak) VALUES ('"+pbrg.getId_penjualan()+"',"
                + "'"+pbrg.getBarcode()+"','"+pbrg.getJumlahBarang()+"','"+pbrg.getStok()+"','"+pbrg.getPajak()+"')";
        
        try {
            koneksi.createStatement().executeUpdate(insert);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updPenjualanBarang(PenjualanBarang pbrg) {
        String update = "UPDATE penjualan_barang SET id_penjualan='"+pbrg.getId_penjualan()+"',"
                + "listBarang='"+pbrg.getBarcode()+"',jumlahBarang='"+pbrg.getJumlahBarang()+"',"
                + "stok='"+pbrg.getStok()+"',pajak='"+pbrg.getPajak()+"' WHERE "
                + "id_penjualan='"+pbrg.getId_penjualan()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delPenjualanBarang(PenjualanBarang pbrg) {
        String delete = "DELETE FROM penjualan_barang WHERE id_penjualan='"+pbrg.getId_penjualan()+"'";
        
        try {
            koneksi.createStatement().executeUpdate(delete);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<PenjualanBarang> getPenjualanBarang (){
        String select = "SELECT * FROM `penjualan_barang`";
        ArrayList<PenjualanBarang> pbrg = new ArrayList<PenjualanBarang>();
        
        ResultSet rs;
        try {
            rs = koneksi.createStatement().executeQuery(select);
            while(rs.next()){
                PenjualanBarang temp = new PenjualanBarang(rs.getInt("id_penjualan"),rs.getString("listBarang"),rs.getInt("jumlahBarang"),rs.getInt("stok"),rs.getDouble("pajak"));
                pbrg.add(temp);
            }
            System.out.println("Berhasil menampilkan data");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menampilkan data");
        }
        return pbrg;
    }
}
