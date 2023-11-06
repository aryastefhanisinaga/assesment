import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int angka1 = sc.nextInt();
    int angka2 = sc.nextInt();
    
    int hasil = angka1 + angka2;

    pengambilanDigitAngka(hasil);
    }
    
    private static void pengambilanDigitAngka(int masukan){
        int digit1 = masukan / 100;
        int digit2 = masukan / 10 % 10;
        int digit3 = masukan % 10;

        String stringDigit1 = convert(digit1);
        String stringDigit2 = convert(digit2);
        String stringDigit3 = convert(digit3);
        System.out.printf("%s ratus %s puluh %s", stringDigit1, stringDigit2, stringDigit3);
    }

    private static String convert(int masukan){
        switch (masukan){
            case 2:
                 return "dua";
            case 3:
                return "tiga";
            case 4:
                return "empat";
            case 5:
                return "lima";
            case 6:
                return "enam";
            case 7:
                return "tujuh";
            case 8:
                return "delapan";
            case 9:
                return "sembilan";


        
            

        }
        return null;
    }

}
