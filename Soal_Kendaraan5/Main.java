package Soal_Kendaraan5;

// Level 1: Kelas Induk Paling Atas
class KendaraanTugas {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Level 2: Kelas Menengah (Mewarisi KendaraanTugas)
class KendaraanDarat extends KendaraanTugas {
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Level 3: Kelas Turunan Paling Bawah (Mewarisi KendaraanDarat)
class MobilTugas extends KendaraanDarat {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Level 3: Kelas Turunan Paling Bawah (Mewarisi KendaraanDarat)
class MotorTugas extends KendaraanDarat {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

// Kelas Utama untuk Menjalankan Kode
public class Main {
    public static void main(String[] args) {
        MobilTugas mobil = new MobilTugas();
        mobil.nama = "Honda Civic";
        mobil.kecepatan = 200;
        mobil.jumlahRoda = 4; 
        mobil.jumlahPintu = 4; 
        mobil.tampilkanInfo();
        
        System.out.println();
        
        MotorTugas motor = new MotorTugas();
        motor.nama = "Kawasaki";
        motor.kecepatan = 150;
        motor.jumlahRoda = 2; 
        motor.jenisMesin = "4-tak"; 
        motor.tampilkanInfo();
    }
}