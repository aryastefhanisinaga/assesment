import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan lirik lagu: ");
        String lirikLagu = input.nextLine();

		//menghitung panjang lirik dan sisa bagi dari panjang lirik dibagi 5
		int panjangLirik = lirikLagu.length();
        int sisaBagi = panjangLirik % 5;

		String hurufPengganti = "";
		switch (sisaBagi) {
            case 0:
                hurufPengganti = "a";
                break;
            case 1:
                hurufPengganti = "e";
                break;
            case 2:
                hurufPengganti = "i";
                break;
            case 3:
                hurufPengganti = "o";
                break;
            case 4:
                hurufPengganti = "u";
                break;
        }
		StringBuilder lirikLaguBaru = new StringBuilder();

        for (int i = 0; i < panjangLirik; i++) {
            char karakter = lirikLagu.charAt(i);
            if (isVokal(karakter)) {
                lirikLaguBaru.append(hurufPengganti);
            } else {
                lirikLaguBaru.append(karakter);
            }
        }
		System.out.println("Lirik lagu baru: " + lirikLaguBaru.toString());
    }
	public static boolean isVokal(char karakter) {
        karakter = Character.toLowerCase(karakter);
        return karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u';
	}
}
