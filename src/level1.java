import java.util.Scanner;
public class level1 {
    public static void main(String[] args) throws Exception {
      Scanner inputan = new Scanner(System.in);
      System .out.print("masukkan N :");
      int N = inputan.nextInt();
      for (int i =1; i <= N; i++){
        System.out.print(i + " ");
      }
      inputan.close();
    }
    
}
