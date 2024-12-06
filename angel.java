import java.util.Scanner;
public class angel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Memasukkan elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int mostFrequent = array[0]; // Elemen yang paling sering muncul
        int maxCount = 0;           // Jumlah kemunculan maksimum

        // untuk menghitung frekuensi setiap elemen
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Hitung berapa kali elemen ini muncul
            for (int j = 0; j < n; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }

            // Perbarui elemen
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = array[i];
            }
        }

        
        System.out.println("Elemen yang paling sering muncul adalah " + mostFrequent + " sebanyak " + maxCount + " kali");
    }
}


  

