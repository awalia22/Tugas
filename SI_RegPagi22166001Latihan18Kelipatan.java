/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Kelipatan
*/
package si_regpagi.pkg22166001.latihan18.kelipatan;

public class SI_RegPagi22166001Latihan18Kelipatan {
    
    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 3.5 dari 3.5 hingga 35:");

        for (double i = 3.5; i <= 35; i+= 0.5) {
            // Cek apakah bilangan merupakan kelipatan 3.5 
            if (i % 3.5 == 0) {
                System.out.println(i);
    }
        }
    }
}
