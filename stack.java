import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class stack {
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner(System.in);
        int balance =2000000;
        Stack <Integer> transactions = new Stack <> ();
        int nav;
        int history = 0;
        System.out.println("\n Pilih menu \n1.Penarikan \n2.Menyimpan \n3.Lihat Saldo \n4.Total Uang Masuk \n5.Total Uang Keluar \n0.exit");
        do { 
            System.out.print("Pilih menu: ");
            nav = inputx.nextInt();
            if ((nav == 1 || nav == 2)&& history == 5){
                 System.out.println("Data Transaksi sudah penuh");
                 continue;
            }
            if(nav == 0 ) break;
            if (nav == 1){
                if (balance == 0){
                     System.out.println("Saldo anda 0");
                     continue;
                }
                 System.out.println("jumlah yang ditarik: ");
                 int amount = inputx.nextInt();
                 if (amount > balance){
                     System.out.println("saldo anda kurang , hanya "+ balance);
                     continue;
                 }
                 transactions.push(-amount);
                 balance -= amount;
            }else if (nav == 2){
                 System.out.println("jumlh yang di simpan : ");
                 int amount = inputx.nextInt();
                 transactions.push(amount);
                 balance += amount;
            }else if (nav == 3){
                 System.out.println("saldo anda : "+ balance);
                
            }else if ( nav== 4){
                int total =0;
                for(int x =0; x<transactions.size(); x++){
                    if(transactions.get(x)> 0){
                        total += transactions.get(x);
                    }
                }
                System.out.println("Total uang masuk : "+ total);
            }else if ( nav== 5){
                int total =0;
                for(int x =0; x <transactions.size(); x++){
                    if(transactions.get(x) < 0){
                        total += transactions.get(x);
                    }
                }
                 System.out.println("Total uang keluar: "+ (total*-1));
            }
               
        } while (true);
        
    }
}
