import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka awal : ");
        int angkaAwal = sc.nextInt();

        System.out.print("Masukan jarak setiap angka : ");
        int jarak = sc.nextInt();

        System.out.print("Diulang berapa kali : ");
        int ulang = sc.nextInt();
    }
    private static int hasil = 0;
    private static int aritmatika (int angkaAwal, int jarak, int ulang){
        if (ulang > 0) {
            ulang = ulang - 1;
            hasil = hasil + angkaAwal;
            angkaAwal = angkaAwal + jarak;
            aritmatika(angkaAwal, jarak, ulang);
        }
        return hasil;
    }
    
}
