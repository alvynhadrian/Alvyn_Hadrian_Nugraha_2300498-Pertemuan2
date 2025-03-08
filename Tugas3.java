import java.util.Scanner;

public class Tugas3 {
    public static void bintang(int star) {
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);

        System.out.println("Masukan Angka 1-100: ");
        int btg = star.nextInt();
        bintang(btg);

        star.close();
    }
}
