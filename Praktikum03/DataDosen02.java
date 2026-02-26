package Praktikum03;

public class DataDosen02 {
    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        int no = 1;
        for (Dosen02 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------------");
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("--------------------------------------");
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jumlahPria));
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jumlahWanita));
        }

        System.out.println("--------------------------------------");
    }
    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 tertua = arrayOfDosen[0];

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + tertua.usia);
        System.out.println("--------------------------------------");
    }
    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 termuda = arrayOfDosen[0];

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + termuda.usia);
        System.out.println("--------------------------------------");
    }
}