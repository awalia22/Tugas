/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program menghitung tunjangan
*/
package si_regpagi.pkg22166001.latihan17.progamtunjangan;

public class SI_RegPagi22166001Latihan17ProgamTunjangan {

    public static void main(String[] args) {
        // Gaji pokok
        double gajiPokok = 6000000.0;

        // Status pernikahan
        boolean menikah = true;

        // Persentase tunjangan untuk yang sudah menikah
        double persentaseTunjangan = 36.0; // 36% tunjangan

        // Menghitung tunjangan berdasarkan status pernikahan
        double tunjangan = 0.0;
        if (menikah) {
            tunjangan = (persentaseTunjangan / 100) * gajiPokok;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("Gaji Pokok Younglex: Rp " + gajiPokok);
        System.out.println("Tunjangan Younglex: Rp " + tunjangan);
        System.out.println("Total Gaji Younglex: Rp " + totalGaji);
    }
}