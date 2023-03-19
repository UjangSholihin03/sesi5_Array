import java.util.Scanner;

public class soalNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        String[] nama = new String[jumlah];
        double[] nilai = new double[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("____________");
            System.out.println("Mahasiswa Ke : " + (i+1));
            System.out.print("Nama: ");
            nama[i] = input.next();
            System.out.print("Nilai: ");
            nilai[i] = input.nextDouble();
            if (nilai[i] >= 60) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");
        double totalNilai = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
            totalNilai += nilai[i];
        }
        double rataRata = totalNilai / jumlah;
        System.out.println("================================");
        System.out.println("Jumlah:\t" + totalNilai);
        System.out.println("Nilai Rata-rata:\t" + rataRata);


        
    }

}
