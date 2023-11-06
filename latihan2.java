import java.util.Scanner;

public class latihan2 {

    public static void main(final String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Angka:");
        String angka = Sc.nextLine();

        switch (angka) {
            case "1":
                System.out.println("Satu");
                break;
            case "2":
                System.out.println("Dua");
                break;
            case "3":
                System.out.println("Tiga");
                break;
            case "4":
                System.out.println("Empat");
                break;
            case "5":
                System.out.println("Lima");
                break;
            case "6":
                System.out.println("Enam");
                break;
            case "7":
                System.out.println("Tujuh");
                break;
            case "8":
                System.out.println("Delapan");
                break;
            case "9":
                System.out.println("Sembilan");
                break;
            case "10":
                System.out.println("Sepuluh");
                break;
            case "11":
                System.out.println("Ini berapa ya ?");
                break;

        }
    }
}