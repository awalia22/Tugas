/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Perbandingan Dua Buah Nilai
*/
package si_regpagi.pkg22166001.latihan24.perbandinagnduabuahnilai;

import java.util.Scanner;

public class SI_RegPagi22166001Latihan24PerbandinganDuaBuahNilai {

   
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String ulangi = "Ya";
        while (ulangi.equalsIgnoreCase("Ya")) {
            System.out.println("=======Program Perbandingan Nilai-");
            System.out.print("Masukkan nilai pertama : ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            int nilai2 = input.nextInt();
            if (nilai1 > nilai2) {
                System.out.println("Hasil " + nilai1 + " Lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println("Hasil " + nilai1 + " Lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil " + nilai1 + " Sama dengan " + nilai2);
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = input.next();
        }
    }
}
