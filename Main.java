/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Lamborghini", "Urus", 2024, "Hitam");
        Mobil mobil2 = new Mobil("Porcshe", "911 GTR", 2025, "HItam");
        
        mobil1.startEngine();
        mobil2.startEngine();
        
        System.out.println("Informasi Awal");
        mobil1.displayInfo();
        mobil2.displayInfo();

        mobil1.setWarna("Hijau");
        mobil2.setWarna("Biru");

        System.out.println("Setelah Perubahan Warna");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}
