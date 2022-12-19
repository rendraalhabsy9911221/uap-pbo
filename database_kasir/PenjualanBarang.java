/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_kasir;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PenjualanBarang implements ProductCounter {
    private int id_penjualan;
    private ArrayList<Barang> barang;
    private int jumlahBarang;
    private int stok;
    private double pajak;
    private String barcode;

    public PenjualanBarang(int id_penjualan, ArrayList<Barang> barang, int jumlahBarang, int stok, double pajak) {
        this.id_penjualan = id_penjualan;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
        this.stok = stok;
        this.pajak = pajak;
    }
    
    public PenjualanBarang(int id_penjualan, String barcode, int jumlahBarang, int stok, double pajak) {
        this.id_penjualan = id_penjualan;
        Barang ktg = new Barang(barcode);
        this.barcode = barcode;
        this.jumlahBarang = jumlahBarang;
        this.stok = stok;
        this.pajak = pajak;
    }

    public int getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setBarang(ArrayList<Barang> barang) {
        this.barang = barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getPajak() {
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    @Override
    public void hitungJumlahProduk(Barang brg) {
        System.out.println(brg.getBarcode());
    }

    @Override
    public double hitungHargaProduk(Barang brg) {
        return brg.hargaDiskon() * this.jumlahBarang;
    }
}
