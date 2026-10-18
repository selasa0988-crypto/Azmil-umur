
import java.util.Scanner;

public class azmil1 {

    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan nilai anda; ");
        Double angka = inputan.nextDouble();
        if (angka > 60) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }
        System.out.println("nilai anda adalah: " + angka);
        inputan.close();
    }
}
