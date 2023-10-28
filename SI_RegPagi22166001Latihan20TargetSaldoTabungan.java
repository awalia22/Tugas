/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Target Saldo Tabungan
*/
package si_regpagi.pkg22166001.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;

public class SI_RegPagi22166001Latihan20TargetSaldoTabungan {
    
    public static void main(String[] args) {
       
        // Saldo Awal
        double saldoAwal = 3500000;
        // Bunga per Bulan (dalam persen)
        double BungaPerBulan = 8.0;
        // Lama (bulan)
        double saldoTarget = 6000000;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        // Hitung saldo per bulan
        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (BungaPerBulan / 100);
            saldoAwal += bunga;
            bulan++;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + bulan + ": Rp. " + saldoBulanFormatted);
        }
    }
}
