import java.util.Scanner;

public class TugasMenghitungSuhu {
    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("===KONVERSI SUHU===");
        System.out.println("====================");
        System.out.println();

        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Suhu Celcius");
        double SuhuCelcius = input.nextDouble();
        System.out.println();
        double hasilreamur = SuhuCelcius*(4.0/5.0);
        System.out.println("Hasil Suhu Reamur = "+hasilreamur+" Derajat");
        double hasilfahrenheit = (SuhuCelcius * 9.0/5.0) + 32;
        System.out.println("Hasil Suhu Fahrenheit = "+hasilfahrenheit+" Derajat");


    }
}
