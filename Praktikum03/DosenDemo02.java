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

        int no = 1;
        for (Dosen02 dosen : arrayOfDosen02) {

            System.out.println("\nData Dosen ke-" + no++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------------");
        }

        sc.close();
    }
}