import java.util.Scanner;

public class TugasBioskop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0, jmlTiket, jmlPelanggan;
        int hargaTiket = 50000;
        

        double totalPenjualanHarga = 0; 
        double hargaTotal, totalBayar;

        System.out.print("Masukkan jumlah pelanggan yang datang hari ini: ");
        jmlPelanggan = sc.nextInt();

        for (int i = 1; i <= jmlPelanggan; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang untuk pelanggan ini.");
                i--;
                continue;
            }

            hargaTotal = jmlTiket * hargaTiket;
            

            double diskon = 0; 

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            totalBayar = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jmlTiket;
            totalPenjualanHarga += totalBayar;

            System.out.println("-> Total bayar untuk pelanggan ini: Rp " + (int) totalBayar);
        }

        System.out.println("\n--- REKAP PENJUALAN TIKET HARI INI ---");
        System.out.println("Total seluruh tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan penjualan: Rp " + (int) totalPenjualanHarga);

        sc.close();
    }
}