import java.util.Scanner;

public class mudahTiga {
  public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    System.out.println("PERULANGAN");
   
      for (int i = 50; i >= 1; i--) {
        System.out.print(i+ ". ");

        if (i == 1) {
          System.out.println("Saya Senang");
        }else if (i % 3 == 0) {
          System.out.println("Saya Anak Angkatan 33");
          
        }else if (i % 2 == 0) {
          System.out.println("Saya Anak Moklet");
          
        }else {
          System.out.println("Saya Anak Wikusama");
        }
      
    }
    }
  }
  

