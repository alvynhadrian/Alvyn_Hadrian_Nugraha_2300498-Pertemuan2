import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner nikah = new Scanner(System.in);

        // input jumlah tabungan yang sudah di miliki
        System.out.print("Masukan Jumlah Tabungan Anda: ");
        int tabungan = nikah.nextInt();

        // input apakah anda mempunyai pasangan
        System.out.print("Apakah Anda sudah memiliki Pasangan? Type (True or False) : ");
        Boolean pasangan = nikah.nextBoolean();

        //output
        System.out.println( (tabungan > 100 && pasangan) ? "Selamat, Tabungan Anda sudah cukup dan siap menikah." : "Tabungan Anda tidak cukup untuk menikah, silakan kerja dan kumpulkan uang hingga cukup."
);


        // logika pengecekannya
        // if (Tabungan > 100 && pasangan || Tabungan >= 100 && pasangan) {
        //     System.out.println("Selamat Tabungan Anda sudah cukup dan siap menikah");
        // } else {
        //     System.out.println("Tabungan anda tidak cukup untuk menikah, silakan kerja dan kumpulkan uang hingga cukup");
        // }
    }

}
