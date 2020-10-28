/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung tunjangan 
 * bagi yang sudah menikah
 */
public class Tunjangan {
    final double tunjangan = 0.35;        
    final static Scanner scan = new Scanner(System.in);
    double gaji;
    String status;
    
    /**
     * @param args the command line arguments
     */            
    
    private void masukkanTunjangan(){
        System.out.println("=====Program Tunjangan====");        
        System.out.print("Berapa gaji anda perbulan ? \t: Rp. ");
        gaji = scan.nextDouble();        
        System.out.print("Status Anda? (Menikah/Belum) \t: ");        
        status = scan.next().toUpperCase();           
    }
    
    
    private double hitungTunjangan(){                                
        return (status.equals("MENIKAH")) ? gaji * tunjangan : 0;
    }
    
    private void tampilGaji(double tunjangan){
        System.out.println("====Hasil Perhitungan Gaji Anda====");        
        System.out.println("Gaji Pokok\t\t:"+gaji);        
        System.out.println("Tunjanga\t\t:"+tunjangan);        
        System.out.println("Total Gaji\t\t:"+(gaji+tunjangan));        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here                
        Tunjangan data = new Tunjangan();
        data.masukkanTunjangan();    
        double hitung = data.hitungTunjangan();
        data.tampilGaji(hitung);
        System.out.println("(Developed by : Ivan Faathirza)");
    }    
}
