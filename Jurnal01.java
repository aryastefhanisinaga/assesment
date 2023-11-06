import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		
		// System.out.println("Masukan bilangan bulat N (1 <= N <= 7)");
		int N = input.nextInt();

		String namaHari = "";

		switch (N) {
			case 1: namaHari = "Senin";
				break;
			case 2: namaHari = "Selasa";
				break;
			case 3: namaHari = "Rabu";
				break;
			case 4: namaHari = "Kamis";
				break;
			case 5: namaHari = "Jumat";
				break;
			case 6: namaHari = "Sabtu";
				break;
			case 7: namaHari = "Minggu";
				break;
			default:
				System.exit(0);

		}

		System.out.println("" + namaHari);

		input.close();
	}
}