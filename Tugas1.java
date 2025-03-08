import java.util.Scanner;

public class Tugas1 {
    // Prosedur mengecek bilangan ribuan
    public static void cekBil(int tigaBil) {
        if (tigaBil >= 1000 && tigaBil <= 9999) {
            System.out.println("Bilangan " + tigaBil + " adalah bilangan ribuan");
        } else {
            System.out.println("Bilangan " + tigaBil + " bukan merupakan bilangan ribuan");
        }
    }

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        System.out.println("Masukan 3 buah bilangan Integer: ");

        for (int i = 0; i < 3; i++) {
            System.out.print("Bilangan Ke-" + (i + 1) + " : ");
            int tigaBil = bilangan.nextInt();
            cekBil(tigaBil);
        }
        bilangan.close();
    }
}
