package Latihan;
import java.util.Scanner;
public class P6_FORTUNA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Grade A");
        } else if (nilai >= 70) {
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        input.close();
    }
}
