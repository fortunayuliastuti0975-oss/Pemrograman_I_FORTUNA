package Latihan;
import java.util.Scanner;

public class P5_FORTUNA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
        
        input.close();
    }
}
