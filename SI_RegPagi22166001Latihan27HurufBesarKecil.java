/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Waktu Saat Ini
*/
package si_regpagi22166001latihan27hurufbesarkecil;

import java.util.Scanner;


public class SI_RegPagi22166001Latihan27HurufBesarKecil {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan Kalimat : ");
        String sentence = scanner.nextLine();

        
        String uppercaseSentence = sentence.toUpperCase();
        String lowercaseSentence = sentence.toLowerCase();

        
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + uppercaseSentence);
        System.out.println("Huruf Kecil : " + lowercaseSentence);
    }
}
    
    

