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
public class PenjualanMakanan implements ProductCounter {
    private int id_penjualan;
    private ArrayList<Makanan> makanan;
    private int jumlahBarang;
    private int stok;
    private double pajak;
    private int id;

    public PenjualanMakanan(int id_penjualan, ArrayList<Makanan> makanan, int jumlahBarang, int stok, double pajak) {
        this.id_penjualan = id_penjualan;
        this.makanan = makanan;
        this.jumlahBarang = jumlahBarang;
        this.stok = stok;
        this.pajak = pajak;
    }
    
    public PenjualanMakanan(int id_penjualan, int id, int jumlahBarang, int stok, double pajak) {
        this.id_penjualan = id_penjualan;
        Makanan mkn = new Makanan(id);
        this.id = id;
        this.jumlahBarang = jumlahBarang;
        this.stok = stok;
        this.pajak = pajak;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public ArrayList<Makanan> getMakanan() {
        return makanan;
    }

    public void setMakanan(ArrayList<Makanan> makanan) {
        this.makanan = makanan;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
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
