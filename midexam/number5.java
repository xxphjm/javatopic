package javatopic;
import java.util.Scanner;
public class number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入m：");
        int m=scanner.nextInt();   
        int s=1;
        int x=1;
        while (s<m) { 
            s*=(x+1);
            x+=1;

        }
        System.err.println(x);
    }
}
