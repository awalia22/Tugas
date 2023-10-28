/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Ejaan Nama
*/
package si_regpagi.pkg22166001.latihan25.ejaannamai;

import java.util.Scanner;


public class SI_RegPagi22166001Latihan25EjaanNama {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String ulangi = "Ya";
        while (ulangi.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan nama depan anda untuk di eja : ");
            String nama = input.nextLine();
            System.out.print("Ejaan untuk \"" + nama + "\" adalah : \n");
            for (int i = 0; i < nama.length(); i++) {
                System.out.println("Huruf ke-" + (i+1) + ": " + nama.charAt(i));
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = input.next();
            input.nextLine();
        }
    }
}
