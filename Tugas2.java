import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan batas awal dan batas akhir
        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();
        
        // Memanggil fungsi untuk menampilkan bilangan prima dan komposit
        tampilkanBilangan(awal, akhir);

        input.close();
    }

    // Fungsi untuk menentukan jenis bilangan: 1 untuk prima, 0 untuk komposit, -1 jika kurang dari 2
    public static int cekJenisBilangan(int angka) {
        if (angka < 2) return -1;
        for (int i = 2; i * i <= angka; i++) { 
            if (angka % i == 0) {
                return 0; // Komposit
            }
        }
        return 1; // Prima
    }

    // Fungsi untuk menampilkan bilangan prima dan komposit dalam rentang tertentu
    public static void tampilkanBilangan(int awal, int akhir) {
        String bilanganPrima = "Bilangan prima dari " + awal + " sampai " + akhir + " adalah: ";
        String bilanganKomposit = "Bilangan komposit dari " + awal + " sampai " + akhir + " adalah: ";

        for (int angka = awal; angka <= akhir; angka++) {
            int jenis = cekJenisBilangan(angka);
            if (jenis == 1) {
                bilanganPrima += angka + " ";
            } else if (jenis == 0) {
                bilanganKomposit += angka + " "; 
            }
        }

        // Menampilkan hasil
        System.out.println(bilanganPrima);
        System.out.println(bilanganKomposit);
    }
}
