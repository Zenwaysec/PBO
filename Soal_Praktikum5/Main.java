/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_Praktikum5;

/**
 *
 * @author Infinix
 */
// Kelas Induk
class Hewan {
    String nama;
    String jenis;
    
    public void  tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewaan: " + jenis);
    }
}

// Kelas Turunan Kucing
class Kucing extends Hewan {
    public void suaraKhas(){
         System.out.println("Suara: Miaw Mprrrr" );
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }
}

// Kelas Turunan SepedeMotor
class Anjing extends Hewan {
     public void suaraKhas(){
        System.out.println("Suara: Augh Aughh");
     }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
        
    }
}
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Hilux";
        kucing.jenis = "Anggora";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Purosangue";
        anjing.jenis = "Husky";
        anjing.tampilkanInfo();
    }
}