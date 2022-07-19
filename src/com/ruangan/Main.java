package com.ruangan;

import java.util.Scanner;
import static com.ruangan.Gedung.*;

public class Main {

    private static short pilih;

    // menu landing page
    public static void Home() {
        System.out.println("\t___________________________________________");
        System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
        System.out.println("\t|_________________________________________|");
        System.out.println("\t|________________Menu Utama_______________|");
        System.out.println("\t|     1. Tambah Ruangan                   |");
        System.out.println("\t|     2. Lihat Info Ruangan               |");
        System.out.println("\t|     3. Cari Ruangan                     |");
        System.out.println("\t|     4. Edit Data Ruangan                |");
        System.out.println("\t|     5. Hapus Ruangan                    |");
        System.out.println("\t|     6. Pinjam Ruangan                   |");
        System.out.println("\t|     7. Lihat Data Peminjaman            |");
        System.out.println("\t|     8. Keluar                           |");
        System.out.println("\t|_________________________________________|");
        System.out.print("\n\tMasukkan pilihan [1-6] : ");

        try {
            pilih = getUserInput().nextShort();
            switch (pilih) {
                case 1:
                    Ruangan.tambahRuangan();
                    break;
                case 2:
                    Ruangan.LihatRuangan();
                    break;
                case 3:
                    Ruangan.cariRuangan();
                    break;
                case 4:
                    Ruangan.editRuangan();
                    break;
                case 5:
                    Ruangan.hapusRuangan();
                    break;
                case 6:
                    Pinjam.pinjamRuangan();
                    break;
                case 7:
                    Pinjam.LihatDataPeminjaman();
                    break;
                case 8:
                    Cls();
                    System.out.println("\n\n\t\tTerima kasih\n\n");
                    System.exit(0);
                    break;

                default:
                    System.out.print("\n\n\tInputan anda salah\n\n");
                    SystemPause();
                    Home();
                    break;
            }
        } catch (Exception e) {
            System.out.println("\n\n\tInput yang anda masukkan bukan angka\n");
            SystemPause();
            Home();
        }
    }

    // ClearScreen & flush
    public static void Cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // scanner input
    public static Scanner getUserInput() {
        Scanner input = new Scanner(System.in);
        return input;
    }

    // loading
    public static void SystemPause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    //UPPERCASE LOWERCASE
    public static String errorhandling(String word) {
        word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        return word;
    }

    public static void main(String[] args ) {

        //Starting Go To Menu
        Home();

    }
}