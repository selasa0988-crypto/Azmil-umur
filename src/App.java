import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan angka anda; ");
        Double angka = inputan.nextDouble();
        if (angka > 0) {
            System.out.println("Angka yang dimasukkan adalah positif");
        } else if (angka < 0) {
            System.out.println("Angka yang dimasukkan adalah negatif");
        }
        System.out.println("Angka yang dimasukkan: " + angka);
        inputan.close();
    }
}
