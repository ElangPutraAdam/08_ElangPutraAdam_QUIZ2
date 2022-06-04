package Kuis2;

import java.util.Scanner;

public class KMain_8 {
    static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung total Pendapatan");
        System.out.println("6. Keluar");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DLLPembeli_8 Pembeli = new DLLPembeli_8();
        DLLPesanan_8 Pesanan = new DLLPesanan_8();

        // Input data pembeli by program
        Pembeli.addLast(new Pembeli_8("Mamluatul", "08224500000"));
        Pembeli.addLast(new Pembeli_8("Abyaz A.M", "08224511111"));
        Pembeli.addLast(new Pembeli_8("Yoshinoya2", "08224522222"));

        mainLoop : while (true) {
            System.out.println();
            System.out.println("========= QUIZ 2 PRAKTIKUM ASD TI - 1F =========");
            System.out.println("Dibuat oleh : Elang Putra Adam");
            System.out.println("NIM : 2141720074");
            System.out.println("Absen : 8");
            System.out.println("==================================================");
            System.out.println("Sistem Antrian Resto Royal Delish");
            printMenu();
            System.out.print("Pilih(1-6) : ");
            int pilihan = scan.nextInt(); scan.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nomor Antrian : " + (Pembeli.size + 1));
                    System.out.print("Nama Customer : ");
                    String nama = scan.nextLine();
                    System.out.print("No. HP : ");
                    String noHp = scan.nextLine();
                    Pembeli.addLast(new Pembeli_8(nama, noHp));
                    break;
                case 2:
                    Pembeli.print();
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("----------------------------------------------");
                    Pembeli.removeFirst();
                    System.out.println("Nomor Pesanan : " + (Pesanan.size + 1));
                    System.out.print("Pesanan : ");
                    String pesanan = scan.nextLine();
                    System.out.print("Harga : ");
                    int harga = scan.nextInt(); scan.nextLine();
                    Pesanan.addLast(new Pesanan_8(Pesanan.size + 1, pesanan, harga));
                    Pesanan.print();
                    break;
                case 4:
                    Pesanan.printSortByName();
                    break;
                case 5:
                    Pesanan.printSum();
                    break;
                case 6:
                    break mainLoop;

            }
        }
        scan.close();
    }
}
