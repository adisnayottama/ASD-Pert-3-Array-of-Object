package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah02 = new Matakuliah02[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah02[i] = new Matakuliah02(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah02[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah02[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah02[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah02[i].jumlahJam);
            System.out.println("------------------------------------");
        }
    }
}
