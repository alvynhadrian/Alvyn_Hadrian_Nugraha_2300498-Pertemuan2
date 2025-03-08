import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner angkaInput = new Scanner(System.in);

        System.out.print("Masukan Angka ke-1: ");
        float input1 = angkaInput.nextFloat();

        System.out.print("Masukan Angka ke-2: ");
        float input2 = angkaInput.nextFloat();

        System.out.print("Masukan Angka ke-3: ");
        float input3 = angkaInput.nextFloat();

        float jumlah = input1 + input2 + input3;
        float kali = input1 * input2 * input3;
        float kurang = input1 - input2 - input3;
        float bagi = input1 / input2 / input3;

        System.out.println("\n");
        System.out.println("Result Penjumlah = " + jumlah);
        System.out.println("Result Perkalian = " + kali);
        System.out.println("Result Pengurang = " + kurang);
        System.out.println("Result Pembagian = " + bagi);

        angkaInput.close();

    }
}