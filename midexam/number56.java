package midexam;
import java.util.*;
public class number56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入整數:");
        int n=scanner.nextInt();   
        for (int i = 1; i <=n; i++) {
            for (int j =1;j<=i;j++){
            System.out.print(i*j+" "); 
            }
            System.out.println("");
        }
    }
}
