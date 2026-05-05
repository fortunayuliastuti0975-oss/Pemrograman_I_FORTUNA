package Tugas;
import java.util.Scanner;

public class P8_FORTUNA {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int pilihan;
        int jumlah = 0;

        String[] nama = new String[100];
        String[] nim = new String[100];
        String[] kehadiran = new String[100];
        double[] nilaiTugas = new double[100];
        double[] nilaiUTS = new double[100];
        double[] nilaiUAS = new double[100];

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input jumlah mahasiswa");
            System.out.println("2. Input data mahasiswa");
            System.out.println("3. Tampilkan hasil");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {

                case 1:
                    System.out.print("Jumlah mahasiswa (max 100): ");
                    jumlah = input.nextInt();
                    input.nextLine();

                    if (jumlah > 100) {
                        System.out.println("Maksimal 100! Di-set ke 100.");
                        jumlah = 100;
                    } else if (jumlah <= 0) {
                        System.out.println("Jumlah harus lebih dari 0!");
                        jumlah = 0;
                    }
                    break;

                case 2:
                    if (jumlah == 0) {
                        System.out.println("Input jumlah dulu!");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("\nMahasiswa ke-" + (i + 1));

                            System.out.print("Nama: ");
                            nama[i] = input.nextLine();

                            System.out.print("NIM: ");
                            nim[i] = input.nextLine();

                            // input kehadiran validasi
                            String status;
                            do {
                                System.out.print("Kehadiran (H/T): ");
                                status = input.next();
                            } while (!status.equalsIgnoreCase("H") && !status.equalsIgnoreCase("T"));
                            kehadiran[i] = status;

                            // input nilai
                            System.out.print("Nilai Tugas: ");
                            nilaiTugas[i] = input.nextDouble();

                            System.out.print("Nilai UTS: ");
                            nilaiUTS[i] = input.nextDouble();

                            System.out.print("Nilai UAS: ");
                            nilaiUAS[i] = input.nextDouble();

                            input.nextLine(); // buang newline
                        }
                    }
                    break;

                case 3:
                    if (jumlah == 0) {
                        System.out.println("Belum ada data!");
                    } else {
                        System.out.println("\n=== HASIL DATA MAHASISWA ===");

                        for (int i = 0; i < jumlah; i++) {

                            double nilaiAkhir = (0.2 * nilaiTugas[i]) +
                                                (0.3 * nilaiUTS[i]) +
                                                (0.4 * nilaiUAS[i]) +
                                                (0.1 * (kehadiran[i].equalsIgnoreCase("H") ? 100 : 0));

                            String grade;
                            if (nilaiAkhir >= 85) grade = "A";
                            else if (nilaiAkhir >= 75) grade = "B";
                            else if (nilaiAkhir >= 65) grade = "C";
                            else if (nilaiAkhir >= 50) grade = "D";
                            else grade = "E";

                            String status = (nilaiAkhir >= 75) ? "LULUS" : "TIDAK LULUS";

                            System.out.println("\nMahasiswa ke-" + (i + 1));
                            System.out.println("Nama        : " + nama[i]);
                            System.out.println("NIM         : " + nim[i]);
                            System.out.println("Kehadiran   : " + kehadiran[i]);
                            System.out.printf("Nilai Akhir : %.2f\n", nilaiAkhir);
                            System.out.println("Grade       : " + grade);
                            System.out.println("Status      : " + status);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}
