package Praktikum03;
import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen02[] arrayOfDosen02 = new Dosen02[jumlah];

        for (int i = 0; i < arrayOfDosen02.length; i++) {

            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            arrayOfDosen02[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }

        DataDosen02 data = new DataDosen02();
        System.out.println("\n=== SEMUA DATA DOSEN ===");
        data.dataSemuaDosen(arrayOfDosen02);
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen02);
        System.out.println("=== RATA-RATA USIA DOSEN ===");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen02);
        System.out.println("=== DOSEN PALING TUA ===");
        data.infoDosenPalingTua(arrayOfDosen02);
        System.out.println("=== DOSEN PALING MUDA ===");
        data.infoDosenPalingMuda(arrayOfDosen02);
        sc.close();
    }
}