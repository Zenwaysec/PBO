/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

public class PraktikumPBO_4 {

    public static void main(String[] args) {
        System.out.println("=== UJI KELAS KENDARAAN ===");
        Kendaraan kendaraan = new Kendaraan("Sepeda Motor", 120, "Bensin");
        kendaraan.tampilkanInfoKendaraan();

        System.out.println();

        System.out.println("=== UJI KELAS MOBIL ===");
        Mobil mobil = new Mobil("Mobil Sedan", 180, "Bensin", 4);       
        // Memanggil method dari class induk (Kendaraan)
        mobil.tampilkanInfoKendaraan();       
        // Memanggil method khusus dari subclass (Mobil)
        mobil.tampilkanInfoMobil();
        
        System.out.println();
        System.out.println("=== PERCOBAAN AKSES MODIFIER ===");
        // Atribut public (jenisMesin) -> Bisa diakses langsung
        System.out.println("Jenis Mesin (public): " + mobil.jenisMesin);
        // Atribut protected (kecepatanMaks) -> Bisa diakses langsung karena dalam package yang sama
        System.out.println("Kecepatan Maksimum (protected): " + mobil.kecepatanMaks);
        // Atribut private (nama) -> Harus diakses via getter
        System.out.println("Nama Kendaraan (via getter): " + mobil.getNama());

    }
}