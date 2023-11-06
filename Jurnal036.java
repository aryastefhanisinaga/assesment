import java.util.Scanner;

public class Jurnal03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double h = sc.nextDouble();

		sc.close();

		double luasKerucut = Math.PI * r * (r + Math.sqrt(r * r + h * h));

		double luasTabung = 2 * Math.PI * r * (r + h);

		System.out.printf("%.3f %.3f\n", luasKerucut, luasTabung);
	}
}