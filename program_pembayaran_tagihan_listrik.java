/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.percabangan;
import java.util.Scanner;

public class program_pembayaran_tagihan_listrik {
    public static void main(String[] args) {
        
        // Deklarasi
         int kWh;   
         int biaya;
         int biayatotal;
         double total;
         
         System.out.println("__>>Pembayaran_Tagihan_Listrik<<__");
         System.out.print("Masukkan pengeluaran kWh Anda ?");
         Scanner scanner = new Scanner (System.in);
         kWh = scanner.nextInt();
         
         if (kWh < 450) {
             System.out.println("Anda terdeteksi Golongan C");
             biaya = 20000 + (1000 * kWh);
             System.out.println("Biaya : " + biaya);
             System.out.println("\nBiaya total");
             biayatotal = (biaya + (biaya* 15/100));
             System.out.println("Biaya total:" + biayatotal );
             
         }else if (kWh <=900) {
             System.out.println("Anda terdeteksi Golongan B - B aja:v");
             biaya = 35000 + (2500 * kWh);
             System.out.println("Biaya : " + biaya);
         } else if(kWh < 1200 ) {
             System.out.println("Anda terdeteksi Golongan A -  Holkay ");
             biaya = 50000 + (3000 * kWh);
             System.out.println("Biaya : " + biaya);
                     
         
         }
         
         
         
    }
}
