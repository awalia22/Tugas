/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Perhitungan Lingkaran
*/
package si_regpagi.pkg22166001.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
public class SI_RegPagi22166001Latihan23NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        String petugas = input.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
        int terbesar = nilai[0];
        int terkecil = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }
        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
        }
        System.out.println("Nilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
        System.out.println("Petugas: " + petugas);
    }
}
