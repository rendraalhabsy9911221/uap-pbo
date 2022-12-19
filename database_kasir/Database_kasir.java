/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_kasir;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Database_kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ADD KATEGORI BARANG
        KategoriBarangModel ktgm = new KategoriBarangModel();
        KategoriBarang ktgb = new KategoriBarang(5, "barang satjw");
        ktgm.updKategori(ktgb);
        //ktgm.delKategori(ktgb);
//          //GO ADD KATEGORI BARANG
       // ktgm.addKategori(ktgb);
//
//        //BUAT MANGGIL KATEGORI
//        ArrayList<KategoriBarang> listKategori = ktgm.getKategori();
//        System.out.println();
//        for(int i = 0; i < listKategori.size(); i++){
//            System.out.println("ID_Kategori: "+listKategori.get(i).getId_kategori());
//            System.out.println("Kategori: "+listKategori.get(i).getNama_kategori());
//            System.out.println();
//        }
//
//        //ADD BARANG
//        BarangModel brgm = new BarangModel();
  //      Barang brg = new Barang("A0004", LocalDate.of(2022, 1, 17), 2, "barang AB", 15000, 7, 1000);
//        
//          //GO ADD BARANG
////        brgm.addBarang(brg);
//        
//        //BUAT MANGGIL BARANG
//        ArrayList<Barang> listBarang = brgm.getBarang();
//        System.out.println();
//        for(int i = 0; i < listBarang.size(); i++){
//            System.out.println(listBarang.get(i).getBarcode());
//            System.out.println(listBarang.get(i).getExpired());
//            System.out.println(listBarang.get(i).getId_kategori());
//            System.out.println(listBarang.get(i).getNama_produk());
//            System.out.println(listBarang.get(i).getHarga());
//            System.out.println(listBarang.get(i).getJumlah());
//            System.out.println(listBarang.get(i).getDiskon());
//            System.out.println();
//        }
//===============================================================================        
//        //ADD KATEGORI MAKANAN
//        KategoriMakananModel ktgm = new KategoriMakananModel();
//        KategoriMakanan ktgb = new KategoriMakanan(2, "Makanan ajaib");
//
//          //GO ADD KATEGORI MAKANAN
//        ktgm.addKategori(ktgb);
//
//
//        //ADD BARANG
//        MakananModel brgm = new MakananModel();
//        Makanan brg = new Makanan(1, LocalDate.of(2022, 1, 17), 2, "barang AB", 15000, 7, 1000);
//        
//        //GO ADD BARANG
//        brgm.addMakanan(brg);
//
//===============================================================================     
//        int jumlahBarang = 1;
//        PenjualanBarang pjlb = new PenjualanBarang(2,"A0002",jumlahBarang,brg.getJumlah()-jumlahBarang,4);
//        PenjualanBarangModel pjlbm = new PenjualanBarangModel();
////        pjlbm.addPenjualanBarang(pjlb);
//        
//        //BUAT MANGGIL BARANG
//        ArrayList<PenjualanBarang> listBarang = pjlbm.getPenjualanBarang();
//        System.out.println();
//        for(int i = 0; i < listBarang.size(); i++){
//            System.out.println(listBarang.get(i).getId_penjualan());
//            System.out.println(listBarang.get(i).getBarcode());
//            System.out.println(listBarang.get(i).getJumlahBarang());
//            System.out.println(listBarang.get(i).getStok());
//            System.out.println(listBarang.get(i).getPajak());
//            System.out.println();
//        }
//===============================================================================         
//        int jumlahBarang = 4;
//        PenjualanMakanan pjlb = new PenjualanMakanan(2,1,jumlahBarang,brg.getJumlah()-jumlahBarang,4);
//        PenjualanMakananModel pjlbm = new PenjualanMakananModel();
//        pjlbm.addPenjualanMakanan(pjlb);
//        
//        //BUAT MANGGIL BARANG
//        ArrayList<PenjualanMakanan> listBarang = pjlbm.getPenjualanMakanan();
//        System.out.println();
//        for(int i = 0; i < listBarang.size(); i++){
//            System.out.println(listBarang.get(i).getId_penjualan());
//            System.out.println(listBarang.get(i).getId());
//            System.out.println(listBarang.get(i).getJumlahBarang());
//            System.out.println(listBarang.get(i).getStok());
//            System.out.println(listBarang.get(i).getPajak());
//            System.out.println();
//        }
//        

//        KategoriBarang ktgb = new KategoriBarang(1, "barang mati");
//        ArrayList <KategoriBarang> ktgb1 = new ArrayList<>();
//        ktgb1.add(ktgb);
//        Barang brg = new Barang("A0002", LocalDate.of(2022, Month.DECEMBER, 17), ktgb1, "barang A", 10000, 3, 2500);
//        BarangModel brgm = new BarangModel();
//        brgm.addBarang(brg, ktgb);

//        KategoriMakanan ktg = new KategoriMakanan(1, "makanan kaleng");
//        KategoriMakananModel ktgm = new KategoriMakananModel();
//        ktgm.addKategori(ktg);

//        KategoriMakanan ktgm = new KategoriMakanan(1, "makanan kaleng");
//        ArrayList <KategoriMakanan> ktgm1 = new ArrayList<>();
//        ktgm1.add(ktgm);
//        Makanan mkn = new Makanan(1, LocalDate.of(2022, Month.SEPTEMBER, 17), ktgm1, "sarden kaleng", 15000, 10, 1000);
//        MakananModel mknm = new MakananModel();
//        mknm.addMakanan(mkn, ktgm);
        






        
//        ArrayList <KategoriBarang> ktgb1 = new ArrayList<>();
//        ktgb1.add(ktgb);

        
//        brg.getBarang(ktgb.getId_kategori(),ktgb.getNama_kategori());

        

        
        
//        ArrayList <Barang> brg1 = new ArrayList<>();
//        brg1.add(brg);
//        PenjualanBarang pbrg = new PenjualanBarang(1, brg1, 1, 2, 0.3);
//        PenjualanBarangModel pbrgm = new PenjualanBarangModel();
//        pbrgm.addPenjualanBarang(pbrg, brg);

//        KategoriMakanan ktgm = new KategoriMakanan(1, "makanan kaleng");
//        ArrayList <KategoriMakanan> ktgm1 = new ArrayList<>();
//        ktgm1.add(ktgm);
//        Makanan mkn = new Makanan(1, LocalDate.of(2022, Month.SEPTEMBER, 17), ktgm1, "sarden kaleng", 15000, 10, 1000);
//        ArrayList<Makanan> mkn1 = new ArrayList<>();
//        mkn1.add(mkn);
//        PenjualanMakanan pmkn = new PenjualanMakanan(1, mkn1, 5, 5, 0.3);
//        PenjualanMakananModel pmknm = new PenjualanMakananModel();
//        pmknm.addPenjualanMakanan(pmkn, mkn);
    }
}
