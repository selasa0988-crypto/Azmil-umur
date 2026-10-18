
import java.util.Scanner;

public class azmil3 {

    public static void main(String[] args) throws Exception {
        String Lampu;
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan warna lampu:");
        Lampu = scan.nextLine();
        switch (Lampu){
            case "Hijau":
            System.out.print("warna hijau silakah jalan");
            break;
            case "Kuning":
            System.out.print("warna Siap-siap untuk jalan");
            break;
            case "Merah":
            System.out.print("warna merah berhenti");
            break;
            default:
            System.out.print("warna tidak valid");



        }
         

    }
}