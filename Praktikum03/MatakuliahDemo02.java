package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah02[] arrayOfMatakuliah02 = new Matakuliah02[jumlah];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah02.length; i++) {

            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam  : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------------");

            arrayOfMatakuliah02[i] = new Matakuliah02();
            arrayOfMatakuliah02[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== Data Matakuliah ===");
        for (int i = 0; i < arrayOfMatakuliah02.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah02[i].cetakInfo();
        }

        sc.close();
    }
}