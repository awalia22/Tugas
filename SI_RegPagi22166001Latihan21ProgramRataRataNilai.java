/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Rata-Rata Nilai
*/
package si_regpagi.pkg22166001.latihan21.programrata.ratanilai;

import java.util.Scanner;

public class SI_RegPagi22166001Latihan21ProgramRataRataNilai {

    public static void main(String[] args) {

        // Inisialisasi variabel
        int jumlahMahasiswa = 0;
        int banyakMahasiswa;
        double rataRata;
        
        // Input banyak nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai: ");
        banyakMahasiswa = input.nextInt();
        
        // Input nilai dan hitung jumlah nilai
        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = input.nextInt();
            jumlahMahasiswa += nilai;
        }
        
        // Hitung rata-rata
        rataRata = (double) jumlahMahasiswa / banyakMahasiswa;
        
        // Output rata-rata
        System.out.println("Rata-rata nilai adalah " + rataRata);
        
        // Developed by
        System.out.println("Developed by : Awalia");
    }
}
