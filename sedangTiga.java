import java.util.Random;

import java.util.Scanner;

public class sedangTiga {
  public static void main(String[] args) {
    Scanner m = new Scanner(System.in);

        Random random = new Random();
        boolean lanjut = true;

        System.out.println("Selamat datang di kuis Matematika!");
        System.out.println("Kuis ini melibatkan perkalian (*), pembagian (/), dan modulus (%).");
        System.out.println("Ketik 'keluar' jika ingin mengakhiri kuis.\n");

        while (lanjut) {
            // Generate bilangan acak dan operator
            int bil1 = random.nextInt(100) + 1; 
            int bil2 = random.nextInt(99) + 1; 
            char operator;
            int hasilBenar = 0;

            switch (random.nextInt(3)) {
                case 0 -> {
                    operator = '*';
                    hasilBenar = bil1 * bil2;
                }
                case 1 -> {
                    operator = '/';
                    bil1 = bil1 * bil2; // Pastikan bil1 kelipatan bil2 untuk hasil pembagian bulat
                    hasilBenar = bil1 / bil2;
                }
                default -> {
                    operator = '%';
                    hasilBenar = bil1 % bil2;
                }
            }

            // Tampilkan soal
            System.out.printf("%d %c %d = ", bil1, operator, bil2);
            String jawaban = m.nextLine();

            if (jawaban.equalsIgnoreCase("keluar")) {
                lanjut = false;
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            // Periksa jawaban
            try {
                int jawabanUser = Integer.parseInt(jawaban);
                if (jawabanUser == hasilBenar) {
                    System.out.println("Benar! Jawabannya adalah " + hasilBenar + ".\n");
                } else {
                    System.out.println("Jawaban Anda Salah. Jawaban yang benar adalah " + hasilBenar + ".\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid atau ketik 'keluar' untuk berhenti.\n");
            }
        }

        m.close();
    }
}
// Penjelasan Program
// Bilangan dan Operator Acak:

// Bilangan pertama (bil1) dan kedua (bil2) dihasilkan secara acak.
// Operator (*, /, %) juga dipilih secara acak.
// Logika Pembagian:

// Untuk menghindari pembagian dengan hasil pecahan, bilangan pertama (bil1) dibuat sebagai kelipatan bilangan kedua (bil2).
// Input User:

// User menjawab soal dengan mengetikkan hasilnya. Program memvalidasi input tersebut.
// Berhenti:

// Jika user mengetikkan keluar, program berhenti.
// Validasi:

// Program menangani kesalahan input jika user tidak memasukkan angka yang valid.

    