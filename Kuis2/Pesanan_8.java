package Kuis2;

public class Pesanan_8 {
    int KodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan_8(int KodePesanan, String namaPesanan, int harga) {
        this.KodePesanan = KodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public String toString() {
        return String.format("|%d\t|%s\t\t|%d", KodePesanan, namaPesanan, harga);
    }
}
