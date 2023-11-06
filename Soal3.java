import java.util.Scanner;

public class Soal3 {
  
    public static void main(String[] args){
        java.util.Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        int bb = sc.nextInt();
        int tb = sc.nextInt();

        bmi(gender,bb,tb);
    }

    public static void bmi(String gender, int bb, int tb){
        double meter = tb / 100.0;
        double bmi = bb / Math.pow(meter,2);

        System.out.printf("%.2f, %s", bmi, gender(gender,bmi));
    }

    public static String gender(String gender, double bmi){
        String kategori = "";
        switch (gender){
            case "Pria":
                if (bmi < 20.50) kategori = "Kurus";
                else if (bmi >= 20.50 && bmi <= 26.99) kategori = "Ideal";
                else if (bmi > 27) kategori = "Gemuk";
                break;
            case "Wanita":
                if (bmi < 18.50) kategori = "Kurus";
                else if (bmi >= 20.50 && bmi <= 24.99) kategori = "Ideal";
                else if (bmi > 25) kategori = "Gemuk";
                break;
        }
        return kategori;
    }
}