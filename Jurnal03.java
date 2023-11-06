import java.util.Scanner;


public class Jurnal03 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // System.out.print("kalkulator = ");
        int kalkulator1 = userInput.nextInt();
        char kalkulator2 = userInput.next().charAt(0);
        int kalkulator3 = userInput.nextInt();
        int hasil;

        switch (kalkulator2) {
            case '+':
      
            hasil = kalkulator1 + kalkulator3;
                System.out.println(hasil);
                break;
            case '-':
                hasil = kalkulator1 - kalkulator3;
                System.out.println(hasil);
                break;
            case '*':
                hasil = kalkulator1 * kalkulator3;
                System.out.println(hasil);
                break;
            case '/':
                // hasil = (kalkulator1 / kalkulator3);
                System.out.printf("%.7f", (double)kalkulator1 / kalkulator3);
                break;

            default:
                System.out.println("Masukkan angka yang benar");
                break;
        }
        userInput.close();
    }
}