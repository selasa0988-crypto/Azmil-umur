import java.util.Scanner;

public class azmil4 {
     public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      System .out.print("masukn nilai :");
      Double nilai = scan.nextDouble();
      System .out.print("masukn kehadiran (%):");
      Double Kehadiran = scan.nextDouble();
       System .out.print("masukn tugas (%):");
      Double Tugas = scan.nextDouble();
      if (nilai < 60) 
        System.out.print("maaf anda tidak lulus");
      if (Kehadiran < 75 )
        System.out.print("maaf anda tidak lulus");
      if (Tugas < 80 )
        System.out.print("maaf anda tidak lulus");
      else if (Tugas >= 80 && Kehadiran >= 75 && nilai >= 60)
        System.out.print("selamat anda lulus");

    scan.close();
    }
}
