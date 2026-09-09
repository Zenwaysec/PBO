/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPBO4;

public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Budi", 30, "Software Engineer", 10000000);

        System.out.println("=== INFORMASI PEKERJA AWAL ===");
        System.out.println(pekerja.toString());

        pekerja.setNama("Budi Santoso");
        System.out.println("\n=== SETELAH NAMA DIUBAH ===");
        System.out.println(pekerja.toString());

        System.out.println("\n=== PERCOBAAN AKSES LANGSUNG ===");
        
        System.out.println("Pekerjaan: " + pekerja.pekerjaan);

        System.out.println("Usia: " + pekerja.usia);

    }
}