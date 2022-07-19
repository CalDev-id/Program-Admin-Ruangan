package com.ruangan;

import java.util.ArrayList;

import static com.ruangan.Main.SystemPause;
import static com.ruangan.Main.getUserInput;

class Ruangan {

    private static short pilih;
    private static String tempRuang;
    //string
    public String tipeR;
    public String nama;
    public String status;
    public String gdg;
    //int
    public int kode;
    public int kps;
    public int jKursi;
    public int jMeja;
    public int jKomputer;
    public int luas;
    public int panjang;
    public int lebar;
    //static
    public static String pilGdg;
    public static String namaGdg;
    public static String namaRg;
    public static ArrayList<Ruangan> listRuangan = new ArrayList<Ruangan>();


    //CONSTRUCTOR CLASS RUANGAN
    Ruangan(String nama, int kodeR, int panjang, int lebar, int luas, String tipeRuangan, int kapasitas,int jumlahKomputer, int jumlahKursi, int jumlahMeja, String status) {
        this.nama = nama;
        this.kode = kodeR;
        this.luas = luas;
        this.panjang = panjang;
        this.lebar = lebar;
        this.jKursi = jumlahKursi;
        this.jMeja = jumlahMeja;
        this.tipeR = tipeRuangan;
        this.kps = kapasitas;
        this.status = status;
        this.gdg = pilGdg;
        this.jKomputer = jumlahKomputer;
        listRuangan.add(this);
    }


    //fungsi tambah ruangan
    public static void tambahRuangan() {
        String nama;
        String status;
        String tipeRuangan;
        int kapasitas;
        int jumlahKursi;
        int jumlahKomputer;
        int jumlahMeja;
        int luas;
        int panjang;
        int lebar;
        int kodeR;

            pilGdg = Gedung.PilihGedung();
            System.out.println("\t___________________________________________");
            System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
            System.out.println("\t|_________________________________________|");
            System.out.println("\t|______________INPUT RUANGAN______________|");

            System.out.println("\n\tGedung " + pilGdg );
            //nama ruangan
            System.out.print("\n\tNama Ruangan         \t: ");
            nama = Main.errorhandling(Main.getUserInput().nextLine());
            //Kode Ruangan ex.303
            System.out.print("\tKode Ruangan         \t: ");
            kodeR = Main.getUserInput().nextInt();
            //type ruangan
            tipeRuangan = TipeRuangan();

            //Panjang ruangan
            System.out.print("\tPanjang         \t\t: ");
            panjang = Main.getUserInput().nextInt();
            //Lebar ruangan
            System.out.print("\tLebar           \t\t: ");
            lebar = Main.getUserInput().nextInt();
            //luas ruangan
            System.out.print("\tLuas            \t\t: ");
            luas = panjang*lebar;
            System.out.println(luas + " Meter");


            //Kapasitas ruangan
            System.out.print("\tKapasitas Ruangan     \t: ");
            kapasitas = Main.getUserInput().nextInt();
            //Jumlah Komputer
            System.out.print("\tJumlah Komputer    \t\t: ");
            jumlahKomputer = Main.getUserInput().nextInt();
            //Jumlah Kursi ruangan
            System.out.print("\tJumlah Kursi    \t\t: ");
            jumlahKursi = Main.getUserInput().nextInt();
            //Jumlah Meja ruangan
            System.out.print("\tJumlah Meja     \t\t: ");
            jumlahMeja = Main.getUserInput().nextInt();
            //Status ruangan
            System.out.println("\tStatus Ruangan");
            System.out.print("\t(idle, dipakai, maintenance) : ");

            status = Main.errorhandling(Main.getUserInput().nextLine());

            new Ruangan(nama, kodeR, panjang, lebar, luas, tipeRuangan, kapasitas, jumlahKomputer, jumlahKursi, jumlahMeja, status);
            System.out.println("\n\n\tData berhasil disimpan\n");

        Main.SystemPause();
        Main.Home();
        }

    //fungsi lihat ruangan
    public static void LihatRuangan() {

        //pilih ruang pada gedung
        namaGdg = Gedung.PilihGedung();
        System.out.println("\n\tGedung " + namaGdg + "\n");
        boolean isNotFind = true;

        for (Ruangan ruang : listRuangan) {
            if (ruang.gdg.contains(namaGdg)) {
                isNotFind = false;
                System.out.println("\t___________________________________________");
                System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
                System.out.println("\t|_________________________________________|");
                System.out.println("\t|__________________Ruangan________________|");
                System.out.println("\t     Gedung " + ruang.gdg);
                System.out.println("\n\t     Ruangan " + ruang.nama);
                System.out.println("\t     Kode Ruangan    : " + ruang.kode);
                System.out.println("\t     Tipe Ruangan    : " + ruang.tipeR);
                System.out.println("\t     Panjang Ruangan : " + ruang.panjang + " Meter");
                System.out.println("\t     Lebar Ruangan   : " + ruang.lebar + " Meter");
                System.out.println("\t     Luas Ruangan    : " + ruang.luas + " Meter2");
                System.out.println("\t     Kapasitas       : " + ruang.kps + " Orang");
                System.out.println("\t     Jumlah Komputer : " + ruang.jKomputer + " Buah");
                System.out.println("\t     Jumlah Kursi    : "+ ruang.jKursi+" Kursi");
                System.out.println("\t     Jumlah Meja     : " + ruang.jMeja + " Meja");
                System.out.println("\t     Status Ruangan  : " + ruang.status);
                System.out.println("\t|_________________________________________|\t");
            }
        }
        if (isNotFind) {
            System.out.println("\n\n\tMaaf, Ruangan Yang Kamu Cari Tidak Ditemukan\n\n");
        }
        Main.getUserInput().nextLine();
        LihatRuangan();
    }
    //hapusRuangan
    public static void hapusRuangan() {

            System.out.println("\t___________________________________________");
            System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
            System.out.println("\t|_________________________________________|");
            System.out.println("\t|_______________Hapus Ruangan_____________|");
            Ruangan.inputNamaRuangan();
            boolean isNotFind = true;
            String ru = Ruangan.getNama();
            for (Ruangan ruang : listRuangan) {
                if (ruang.nama.contains(namaRg)) {
                    isNotFind = false;

                    listRuangan.remove(ruang);
                    System.out.println("\n\n\tData Berhasil Dihapus\n\n");
                    break;
                }
            }
            if (isNotFind) {
                System.out.println("\n\n\tData tidak ditemukan, Gagal Dihapus\n\n");
            }
        Main.SystemPause();
        Main.Home();

        }


    //getter
    public static String getRuangan() {
        namaGdg = Gedung.PilihGedung();
        String status = null;
        inputNamaRuangan();
        System.out.println(" ");
        System.out.println("\t___________________________________________");
        System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
        System.out.println("\t|_________________________________________|");
        System.out.println("\t|______________Pinjam Ruangan_____________|");
        System.out.println(" ");
        System.out.println("\t Nama Gedung " + namaGdg);
        System.out.println("\t Nama Ruangan : " + namaRg);
        for (Ruangan rg : listRuangan) {
            if (rg.nama.contains(namaRg) && rg.gdg.contains(namaGdg)) {
                status = rg.status;
                break;
            }
        }

        return status;
    }
    //getter
    public static String getNama() {
        String nama = namaRg;
        return nama;
    }

    //fungsi cari ruangan
    public static void cariRuangan() {

        System.out.println("\t___________________________________________");
        System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
        System.out.println("\t|_________________________________________|");
        System.out.println("\t|_______________Cari Ruangan______________|");
        inputNamaRuangan();
        boolean isFind = false;

        for (Ruangan ruang : listRuangan) {
            if (ruang.gdg.contains(namaGdg) && ruang.nama.contains(namaRg)) {
                isFind = true;
                System.out.println("\t___________________________________________");
                System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
                System.out.println("\t|_________________________________________|");
                System.out.println("\t|__________________Ruangan________________|");
                System.out.println("\t     Gedung " + ruang.gdg);
                System.out.println("\n\t     Ruangan " + ruang.nama);
                System.out.println("\t     Kode Ruangan    : " + ruang.kode);
                System.out.println("\t     Tipe Ruangan    : " + ruang.tipeR);
                System.out.println("\t     Panjang Ruangan : " + ruang.panjang + " Meter");
                System.out.println("\t     Lebar Ruangan   : " + ruang.lebar + " Meter");
                System.out.println("\t     Luas Ruangan    : " + ruang.luas + " Meter2");
                System.out.println("\t     Kapasitas       : " + ruang.kps + " Orang");
                System.out.println("\t     Jumlah Komputer : " + ruang.jKomputer + " Buah");
                System.out.println("\t     Jumlah Kursi    : "+ ruang.jKursi+" Kursi");
                System.out.println("\t     Jumlah Meja     : " + ruang.jMeja + " Meja");
                System.out.println("\t     Status Ruangan  : " + ruang.status);
                System.out.println("\t|_________________________________________|\t");
            }
        }
        if (isFind != true) {
            System.out.println("\n\n\tMaaf, Ruangan Yang Kamu Cari Tidak Ditemukan\n\n");
        }
        Main.getUserInput().nextLine();
        Main.Home();
    }

    //fungsi input nama ruangan
    public static void inputNamaRuangan() {
        System.out.print("\n\t Masukkan Nama Ruangan\t: ");
        namaRg = Main.errorhandling(Main.getUserInput().nextLine());
    }

    // Fungsi edit ruangan
    public static void editRuangan() {

        System.out.println("\t___________________________________________");
        System.out.println("\t| Admin Ruangan Politeknik Negeri Jakarta |");
        System.out.println("\t|_________________________________________|");
        System.out.println("\t|_______________Edit Ruangan______________|");
        inputNamaRuangan();
            boolean isFind = false;
            for (Ruangan ruang : listRuangan) {
                if (ruang.nama.contains(namaRg)) {
                    isFind = true;
                    System.out.println("\n\tGedung " + ruang.gdg);
                    System.out.print("\n\tPanjang\t\t: ");
                    ruang.panjang = Main.getUserInput().nextInt();
                    System.out.print("\tLebar\t\t: ");
                    ruang.lebar = Main.getUserInput().nextInt();
                    System.out.print("\tKapasitas Ruangan\t: ");
                    ruang.kps = Main.getUserInput().nextInt();
                    System.out.print("\tJumlah Komputer\t\t: ");
                    ruang.jKomputer = Main.getUserInput().nextInt();
                    System.out.print("\tJumlah Kursi\t\t: ");
                    ruang.jKursi = Main.getUserInput().nextInt();
                    System.out.print("\tJumlah Meja\t\t: ");
                    ruang.jMeja = Main.getUserInput().nextInt();
                    System.out.print("\tStatus Ruangan\t\t: ");
                    ruang.status = Main.errorhandling(Main.getUserInput().nextLine());
                    System.out.println("\n\n\tData Ruangan Berhasil Diubah\n\n");
                    break;
                }
            }
            if (isFind != true) {
                System.out.println("\n\n\tRuangan Tidak Ditemukan\n\n");
            }

            Main.getUserInput().nextLine();

        Main.Home();
        }

    //fungsi type ruangan
    public static String TipeRuangan() {
        System.out.println("\tType Ruangan");
        System.out.print("\t(1. Indoor 2. Outdoor)  : ");
        pilih = getUserInput().nextShort();
        try {
            switch (pilih) {
                case 1:
                    tempRuang = "Indoor";
                    break;
                case 2:
                    tempRuang = "Outdoor";
                    break;
                default:
                    System.out.println("\n\tInput Anda salah\n");
                    SystemPause();
                    TipeRuangan();
                    break;
            }
        } catch (Exception e) {
            System.out.println("\n\tMohon Masukkan Angka\n");
            SystemPause();
            TipeRuangan();
        }
        return tempRuang;
    }

}