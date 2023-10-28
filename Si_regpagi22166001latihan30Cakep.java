/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Deskripsi : Program Cakep
*/
package si_regpagi22166001latihan30cakep;

import java.util.Scanner;


public class Si_regpagi22166001latihan30Cakep {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
        System.out.print("\u001b[34mJawab \u001b[31m(Yoi/Enggak) \u001b[0m: ");
        String jawab = scanner.next();
        
        if (jawab.equals("Yoi")) {
            System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
        }else {
            System.out.println("Keep the code works dude");
        }
    }

    }
