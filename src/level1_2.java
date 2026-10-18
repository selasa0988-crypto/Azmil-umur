import java.util.Scanner;
public class level1_2 {
    public static void main(String[] args) throws Exception {
      Scanner inputan = new Scanner(System.in);
      System .out.print("masukkan N :");
      int N = inputan.nextInt();
      for (int i =N; i >= 1; i--){
        System.out.print(i + " ");
      }
      inputan.close();
    }
}
