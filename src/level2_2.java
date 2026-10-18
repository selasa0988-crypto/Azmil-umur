public class level2_2 {
    public static void main(String[] args) throws Exception {
        int N = 5;
        int total = 1;
        for (int i = 1; i<=N; i++){
                total *= i;
            
        }
        System.out.println(N + "! = " + total);
    }
}
