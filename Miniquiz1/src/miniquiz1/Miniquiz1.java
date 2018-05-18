/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniquiz1;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Miniquiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int total, gaji = 0, tunjangan = 0, potongan = 0;
    String nama, nomorinduk,golongan,gol;
        
        Scanner input=new Scanner(System.in); 
        
        for (int i=1;i<=2;i++)
        {        
       System.out.println ("Data pemesanan tiket ke-"+i);
            
System.out.println("GAJI PEGAWAI");
       
        System.out.print("Masukkan Nomer Induk Pegawai : ");
        nomorinduk=input.nextLine();
        
        System.out.print("Masukkan Nama : ");
        nama=input.nextLine();
        
        System.out.print("Masukkan Golongan [1/2/3/4] : ");
        gol=input.nextLine();
    
        switch(gol){
            case "1":
                gaji=2000000;
                tunjangan=gaji*40/100;
                potongan=40000;
                break;
            case "2": 
                gaji=2500000;
                tunjangan=gaji*40/100;
                potongan=40000;
                break;
            case "3": 
                gaji=3000000;
                tunjangan=gaji*50/100;
                potongan=50000;
                break;
            case "4": 
                gaji=4000000;
                tunjangan=gaji*60/100;
                potongan=55000;
                break;
            default:
                System.out.print ("Golongan yang diinputkan tidak tersedia");
                break;
        }
      
    total = gaji + tunjangan - potongan; 
        
    System.out.println("Terimakasih telah memasukkan data sebagai berikut : ");
            System.out.println("Nama : "+ nama);
            System.out.println("Nomor Induk : "+ nomorinduk);
            System.out.println("Golongan : "+gol);
            System.out.println("Gaji Pokok : " +gaji);
            System.out.println("Tunjangan : " + tunjangan);
            System.out.println("Potongan : " + potongan);
            System.out.println("Total gaji: Rp."+ total);
    System.out.println ("");
        }
           
    }
    
}
