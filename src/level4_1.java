
public class level4_1 {
    public static void main(String[] args) throws Exception {
      
      System.out.print("masukkan N :");
      int N = 5;
      int [][] a = new int[N][N];
        for(int i=0; i<=N; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    
    }

}
