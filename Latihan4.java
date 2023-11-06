import java.util.Scanner;

public class Latihan4 {

    public static void main(final String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Masukkan kota tujuan");
        String KotaTujuan = Sc.nextLine();
        System.out.Printn("Masukkan jumlah penumpang");
        int jumlahPenumpang = Sc.nextLine();

        int hargaJakarta = jumlahPenumpang * 145000;
        int hargaBogor = jumlahPenumpang * 20000;
        int hargaGarut = jumlahPenumpang * 75000;
        int hargaPurwakarta = jumlahPenumpang * 75000;

        switch (KotaTujuan) {
            case "Jakarta":
                System.out.println(hargaJakarta);
                break;
            case "Bogor":
                if (hargaBogor > 250000) {
                    hargaBogor = hargaBogor - (hargaBogor * 10 / 100);
                    System.out.println(hargaBogor);
                } else {
                    System.out.println(hargaBogor);
                }
                break;
            case "Garut":
                System.out.println(hargaGarut);
                break;
            case "Purwakarta":
                System.out.println(hargaPurwakarta);
                break;

        }
    }
}
