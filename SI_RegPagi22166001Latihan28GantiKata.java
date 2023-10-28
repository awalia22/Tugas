/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Ganti Kata
*/
package si_regpagi22166001latihan28gantikata;

import java.util.Scanner;


public class SI_RegPagi22166001Latihan28GantiKata {

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("====Program Mengganti Kata====");
            System.out.print("Masukkan Kalimat: ");
            String sentence = scanner.nextLine();
            
            System.out.print("Ganti Kata: ");
            String oldWord = scanner.nextLine();
            
            System.out.print("Menjadi Kata: ");
            String newWord = scanner.nextLine();
            
            String newSentence = sentence.replaceAll(oldWord, newWord);
            
            System.out.println("====Hasil Formatting====");
            System.out.println("Kalimat awal: " + sentence);
            System.out.println("Kalimat baru: " + newSentence);
        }
    }
}
