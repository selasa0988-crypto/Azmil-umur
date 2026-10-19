
public class array1 {
    public static void main(String[] args) throws Exception {
        String name[][] = {
            {"kelompok1", "andi", "budi","jaki"},
            {"kelompok2", "caca", "didi",},
        };
        for(int i=0; i<name.length; i++){
            System.out.print("\n"+name[i] [0] + " : ");
            for(int x=1; x<name[i].length; x++){
                System.out.print(name[i] [x]+",");
                
            }
        }
    }
}
