/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian1;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Ujian1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int total, jumlah_kursi = 0, harga=0 ;
    String nama, rute,kelas = null, fasilitas, rute_bis;
        
        Scanner input=new Scanner(System.in); 
        
        for (int i=1;i<=2;i++)
        {        
       System.out.println ("Data pemesanan tiket ke-"+i);
            
System.out.println("Jurusan Bus Antar Kota");
        System.out.println("1. Jakarta-Bandung");
        System.out.println("Non AC = 90000");
        System.out.println("AC = 130000");
        System.out.println("2. Bandung-Jakarta");
        System.out.println("Non AC = 70000");
        System.out.println("AC = 150000");
        System.out.println("3. Jakarta-Tasikmalaya");
        System.out.println("Non AC = 50000");
        System.out.println("AC = 70000");
        
       
        System.out.print("Nama Pemesan : ");
        nama=input.nextLine();
        
        System.out.print("rute bis (1/2/3) : ");
        rute_bis=input.nextLine();
        
        System.out.print("kelas (AC/NA) : ");
        fasilitas=input.nextLine();
        
        System.out.print("Jumlah Kursi : ");
        jumlah_kursi=input.nextInt();
        
        switch(rute_bis){
            case "1":
                rute="Jakarta-Bandung";
                if ("NA".equals(fasilitas))
                {
                harga=90000;
                kelas="NA";
                }
               else if ("AC".equals(fasilitas)) 
                {
                harga=130000;
                kelas="AC";
                } 
                break;
            case "2": 
                rute="Bandung-Jakarta";
                if ("NA".equals(fasilitas))
                {
                harga=70000;
                kelas="NA";
                }
               else if ("AC".equals(fasilitas)) 
                {
                harga=150000;
                kelas="AC";
                } 
                break;
            case "3": 
                rute="Jakarta-Tasikmalaya";
                if ("NA".equals(fasilitas))
                {
                harga=50000;
                kelas="NA";
                }
               else if ("AC".equals(fasilitas)) 
                {
                harga=170000;
                kelas="AC";
                } 
                break;
            default:
                rute="Maaf silahkan input ulang";
                break;
        }
      
          
        if (jumlah_kursi>=1 && jumlah_kursi<=2) {
            
            total= harga*jumlah_kursi;
        
    System.out.println("Terimakasih telah memesan tiket dengan rincian sebagai berikut: ");
            System.out.println("Nama : "+ nama);
            System.out.println("Rute : "+ rute);
            System.out.println("Jumlah kursi : "+jumlah_kursi);
            System.out.println("Kelas : " +fasilitas);
            System.out.println("Harga satuan : " + harga);
            System.out.println("Total bayar : Rp."+ total);
            System.out.println("silahkan membayar di ALFAMART terdekat");
    System.out.println ("");
        }}}}
            

    

    



   
