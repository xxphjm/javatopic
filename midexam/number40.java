package midexam;
import java.util.*;
public class number40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入整數n:");
        int n=scanner.nextInt();   
        for (int a = 1; a < n;a+=2) {
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println(a);
        }
        for (int i = 1; i < n+2; i+=2){
            System.out.print(i+" ");
        }
        for (int i = n-2; i >0; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (int a = n-2; a > 0; a-=2) {
            for (int j = n; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.println(a);
        }
    }
}
