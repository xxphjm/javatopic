package midexam;
import java.util.*;
public class number64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入第一個要判斯的數字：");
        int n1=scanner.nextInt(); 
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("請輸入第二個要判斯的數字：");
        int n2=scanner2.nextInt(); 
        if (n2-n1==2) {
            int n1n=0;
            for (int i = 1; i <=n1; i++) {
                if (n1%i==0) {
           
                    n1n+=1;
                }
            }
            int n2n=0;
            for (int i = 1; i <=n2; i++) {
                if (n2%i==0) {
                    n2n+=1;
                }
            }
       
            if (n1n==2 && n2n==2) {
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
        else {
            System.out.println("N");
        }
    }
}
