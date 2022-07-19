package com.ruangan;

import static com.ruangan.Main.*;
import static com.ruangan.Main.SystemPause;

import java.util.Scanner;

public class Gedung {
    //deklarasi
    private static short pilih;

    // pil gedung
    public static String PilihGedung() {
        Cls();
        String nmGdg = null;
        System.out.println("\t___________________________________________");
        System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
        System.out.println("\t|_________________________________________|");
        System.out.println("\t|____________Pilihan Gedung_______________|");
        System.out.println("\t|                                         |");
        System.out.println("\t|     1. Gedung Teknik Informatika        |");
        System.out.println("\t|     2. Gedung Teknik Elektro            |");
        System.out.println("\t|     3. Gedung Teknik Mesin              |");
        System.out.println("\t|     4. Gedung Teknik Sipil              |");
        System.out.println("\t|     5. Gedung Teknik Grafika Penerbitan |");
        System.out.println("\t|     6. Gedung Akuntansi                 |");
        System.out.println("\t|     7. Gedung Administrasi Niaga        |");
        System.out.println("\t|     8. Kembali Ke Home                  |");
        System.out.println("\t|_________________________________________|");
        System.out.print("\n\t Masukkan pilihan [1-8] : ");
        pilih = getUserInput().nextShort();
        try {
            switch (pilih) {
                case 1:
                    nmGdg = "Teknik Informatika";
                    break;
                case 2:
                    nmGdg = "Teknik Elektro";
                    break;
                case 3:
                    nmGdg = "Teknik Mesin";
                    break;
                case 4:
                    nmGdg = "Teknik Sipil";
                    break;
                case 5:
                    nmGdg = "Teknik Grafika Penerbitan";
                    break;
                case 6:
                    nmGdg = "Akuntansi";
                    break;
                case 7:
                    nmGdg = "Administrasi Niaga";
                    break;
                case 8:
                    Home();
                    break;

                default:
                    System.out.print("\n\n\tInputan anda salah");
                    SystemPause();
                    PilihGedung();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Input yang anda masukkan bukan angka");
            SystemPause();
            PilihGedung();
        }

        return nmGdg;
    }


}
