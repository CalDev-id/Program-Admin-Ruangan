package com.ruangan;

import java.util.ArrayList;

class Pinjam {
    //DEKLARASI
    private String nama;
    private String NIM;
    private String nmRuangan;
    private String JamMulai;
    private String JamAkhir;
    private String keperluan;

    private static ArrayList<Pinjam> listPinjam = new ArrayList<Pinjam>();

    //constructor
    Pinjam(String nama, String nmRuangan, String JM, String JA, String nim, String keperluan) {
        this.nama = nama;
        this.nmRuangan = nmRuangan;
        this.JamMulai = JM;
        this.JamAkhir = JA;
        this.NIM = nim;
        this.keperluan = keperluan;
        listPinjam.add(this);
    }

    //fungsi pinjam ruangan
    public static void pinjamRuangan() {

        String nama, nim, JM, JA, keperluan;

        Ruangan.getRuangan();

            System.out.println(" ");
            System.out.println("\t ---Masukkan data Peminjam--- \n");

            System.out.print("\t Jam Mulai Pinjam   \t: ");
            JM = Main.getUserInput().nextLine();

            System.out.print("\t Jam Akhir Pinjam   \t: ");
            JA = Main.getUserInput().nextLine();

            System.out.print("\t Masukkan Nama      \t: ");
            nama = Main.errorhandling(Main.getUserInput().nextLine());

            System.out.print("\t Masukkan NIM       \t: ");
            nim = Main.getUserInput().nextLine();

            System.out.print("\t Keperluan          \t: ");
            keperluan = Main.getUserInput().nextLine();

            new Pinjam(nama, Ruangan.getNama(), JM, JA, nim, keperluan);

            System.out.println("\n\n\tData Berhasil ditambah\n\n");

        Main.SystemPause();
        Main.Home();

            }

    //fungsi lihat data peminjaman
    public static void LihatDataPeminjaman() {
        for (Pinjam listP : listPinjam) {
            System.out.println("\t___________________________________________");
            System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
            System.out.println("\t|_________________________________________|");
            System.out.println("\t|__________________Ruangan________________|");
            System.out.println("\n\t        Informasi Detail:\n");
            System.out.println("\n\t        Ruangan         \t: " + listP.nmRuangan);
            System.out.println("\t        Jam Mulai       \t: " + listP.JamMulai);
            System.out.println("\t        Jam Akhir       \t: " + listP.JamAkhir);
            System.out.println("\t        Nama Peminjam   \t: " + listP.nama);
            System.out.println("\t        NIM Peminjam    \t: " + listP.NIM );
            System.out.println("\t        Keperluan       \t: " + listP.keperluan );
            System.out.println("\t|_________________________________________|");
        }
        Main.getUserInput().nextLine();
        Main.Home();
    }

}
