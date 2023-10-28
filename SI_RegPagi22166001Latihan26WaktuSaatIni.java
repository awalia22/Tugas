/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Waktu Saat Ini
*/
package si_regpagi.pkg22166001.latihan26.waktusaatini;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class SI_RegPagi22166001Latihan26WaktuSaatIni {
    
    public static void main(String[] args) {
        // Tanggal dan Waktu Saat Ini
        LocalDateTime now = LocalDateTime.now();

        // Format Data Dan Waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMM yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Hari Dalam Seminggu
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        String dayOfWeekName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Print Tanggal dan Waktu
        System.out.println("Hari ini adalah hari " + dayOfWeekName + ", " + formattedDateTime);
    }
}
    
    

