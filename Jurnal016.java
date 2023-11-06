import java.util.Scanner;

public class Jurnal01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nama1 = sc.nextLine();
		String nama2 = sc.nextLine();
		int waktu = sc.nextInt();

		sc.close();

		String sapaanNama1 = getSapaan(waktu);
		String sapaanNama2 = getSapaan(waktu);

		System.out.println("Halo, " + nama1 + ". Selamat " + sapaanNama1 + ".");
		System.out.println("Halo, " + nama2 + ". Selamat " + sapaanNama2 + ".");
	}

	public static String getSapaan(int jam) {
		if (jam >= 6 && jam <= 11) {
			return "pagi";
		} else if (jam >= 12 && jam <= 14) {
			return "siang";
		} else if (jam >= 15 && jam <= 17) {
			return "sore";
		} else {
			return "malam";
		}
	}
}