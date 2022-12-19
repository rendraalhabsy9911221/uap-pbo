/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap.pbo;
import DB.DBHelper;
/**
 *
 * @author acer
 */
public class UAPPBO {

   
    public static void main(String[] args) {
        Barang brg = new Barang("e", "2022-10", "shampoo", 30000, 300, 1000, "alat mandi");
        BarangModel bm = new BarangModel();
        bm.deleteBarang("e");
      }
    
    }
    

