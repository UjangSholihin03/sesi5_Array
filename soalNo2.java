import java.util.ArrayList;
import java.util.Scanner;

public class soalNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> belanjaan = new ArrayList<String[]>();

        String[][] buah = {
                {"apel", "35000"},
                {"jeruk", "50000"},
                {"mangga", "25000"},
                {"duku", "15000"},
                {"semangka", "20000"}
        };

        String ulang;
        do {
            System.out.print("Pilih Buah (0-4): ");
            int pilihan = input.nextInt();

            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();

            String[] buahTerpilih = buah[pilihan];
            int hargaSatuan = Integer.parseInt(buahTerpilih[1]);
            int subtotal = hargaSatuan * jumlah;

            belanjaan.add(new String[]{buahTerpilih[0], String.valueOf(jumlah), buahTerpilih[1], String.valueOf(subtotal)});

            System.out.print("Input lagi? (y/n): ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Daftar Belanja:");
        System.out.println("========================================");
        System.out.printf("%-4s %-10s %-7s %-7s %n", "No.", "Nama Buah", "Jumlah", "Harga", "Subtotal");

        int total = 0;
        for (int i = 0; i < belanjaan.size(); i++) {
            String[] item = belanjaan.get(i);
            System.out.printf("%-4d %-10s %-7s %-7s %n", i+1, item[0], item[1], item[2], item[3]);
            total += Integer.parseInt(item[3]);
        }

        int diskon = (int) (total * 0.15);
        int totalBayar = total - diskon;

        System.out.println("========================================");
        System.out.printf("%-24s %,d %n", "Total:", total);
        System.out.printf("%-24s %,d %n", "Discount(15%):", diskon);
        System.out.printf("%-24s %,d %n", "Total bayar:", totalBayar);
    }
}
