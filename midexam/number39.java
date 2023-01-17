package javatopic;
import java.util.*;
public class number39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入整數n:");
        int n=scanner.nextInt();   
        for (int i=1; i<n/2+1; i++) {
            for (int j=5-i; j>0; j--) {
             System.out.print(" ");
            }
            for (int j=0;j< 2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=n/2+1; i>0;  i--) {
            for (int j=0; j<5-i; j++) {
             System.out.print(" ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
