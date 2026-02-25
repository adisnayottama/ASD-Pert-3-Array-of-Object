package Praktikum03;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Mahasiswa02[] arrayOfMahasiswa02 = new Mahasiswa02[3];
        arrayOfMahasiswa02 [0] =  new Mahasiswa02();
        arrayOfMahasiswa02 [0].nim = "244107060033";
        arrayOfMahasiswa02 [0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa02 [0].kelas = "SIB-1E";
        arrayOfMahasiswa02 [0].ipk = (float) 3.75;

        arrayOfMahasiswa02 [1] = new Mahasiswa02();
        arrayOfMahasiswa02 [1].nim = "2341720172";
        arrayOfMahasiswa02 [1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa02 [1].kelas = "TI-2A";
        arrayOfMahasiswa02 [1].ipk = (float) 3.36;

        arrayOfMahasiswa02 [2] = new Mahasiswa02();
        arrayOfMahasiswa02 [2].nim = "244107023006";
        arrayOfMahasiswa02 [2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa02 [2].kelas = "TI-2E";
        arrayOfMahasiswa02 [2].ipk = (float) 3.80;

        System.out.println("NIM     : "+ arrayOfMahasiswa02[0].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa02[0].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa02[0].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa02[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa02[1].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa02[1].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa02[1].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa02[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa02[2].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa02[2].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa02[2].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa02[2].ipk);
        System.out.println("---------------------------------------");
        
    }
}
