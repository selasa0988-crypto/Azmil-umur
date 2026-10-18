public class level2 {
    public static void main(String[] args) throws Exception {
        int N = 10;
        int total = 0;
        for (int i = 1; i<=N; i++){
            if (i % 2 ==0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
