/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Saldo Tunjangan
*/
package si_regpagi.pkg22166001.latihan19.saldotunjangan;

public class SI_RegPagi22166001Latihan19SaldoTunjangan {

    public static void main(String[] args) {
     // Inisialisasi variabel
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lamaBulan = 6;
        
        // Hitung saldo akhir setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double saldoAkhir = saldoAwal + (saldoAwal * bunga);
            saldoAwal = saldoAkhir;
            System.out.printf("Saldo bulan ke-%d: Rp%,.2f\n", i, saldoAkhir);
        }
    }
        }
    

    

