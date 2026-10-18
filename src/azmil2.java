
import java.util.Scanner;

public class azmil2 {

    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan nilai anda; ");
        Double angka = inputan.nextDouble();
        char grade = 'A';
        if (angka > 80) {
            grade = 'A'; 
        }else if (angka > 70 && angka <= 79) {
            grade = 'B'; 
        }else if (angka > 60 && angka <= 69) {
            grade = 'C'; 
        }else if (angka > 50 && angka <= 59) {
            grade = 'D'; 
        }else if (angka <= 50) {
            grade = 'E';
        }

        System.out.println("grade anda adalah: " + grade);
        inputan.close();
    }
}
