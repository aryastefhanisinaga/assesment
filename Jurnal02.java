import java.util.Scanner;

public class Jurnal02{
    public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan hari : ");
		String hari = input.nextLine();
		System.out.print("Masukkan bilangan : ");
        int bilangan = input.nextInt();
        int N = 0;
        int hasil =0;
	
        switch (hari) {
            case "Senin": N = 1;
            break;
            case "Selasa": N = 2;
            break;
            case "Rabu": N = 3;
            break;
            case "Kamis": N = 4;
            break;
            case "Jumat": N = 5;
            break;
            case "Sabtu": N = 6;
            break;
            case "Minggu": N = 7;
            break;
        }
        hasil = N + bilangan;
        int hasil1 = 0;
        hasil1 = hasil % 7;

        switch(hasil1) {
            case 0 : hari = "Minggu";
            break;
            case 1 : hari = "Senin";
            break;
            case 2 : hari = "Selasa";
            break;
            case 3 : hari = "Rabu";
            break;
            case 4 : hari = "Kamis";
            break;
            case 5 : hari = "Jumat";
            break;
            case 6 : hari = "Sabtu";
            break;
        } 
        System.out.println(hari);
    }
}
