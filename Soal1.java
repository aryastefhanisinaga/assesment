import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 =sc.nextInt();

        enkripsi(angka1);
        enkripsi(angka2);
        enkripsi(angka3);
    }


    private static void enkripsi(int masukan){
        int digit1 = masukan / 1000;
        int digit2 = masukan / 100 % 10;
        int digit3 = masukan / 10 % 10;
        int digit4 = masukan / 1 % 10;
    
        int enkripsiDigit1 = (digit1 + 5) % 10;
        int enkripsiDigit2 = (digit2 + 5) % 10;
        int enkripsiDigit3 = (digit3 + 5) % 10;
        int enkripsiDigit4 = (digit4 + 5) % 10;


        System.out.printf("%d%d%d%d", enkripsiDigit1, enkripsiDigit4, enkripsiDigit3, enkripsiDigit2);
        System.out.println();
    }  
}
