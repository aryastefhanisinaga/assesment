import java.util.Scanner;

public class latihan1 {

    public static void main(final String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Masukkan huruf:");
        String huruf = Sc.nextLine();

        switch (huruf) {
            case "A":
                System.out.println("Exellent");
                break;

            case "B":
                System.out.println("Good");
                break;

            case "c":
                System.out.println("Average");
                break;

            case "D":
                System.out.println("Fail");
                break;

        }

    }
}