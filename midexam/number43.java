package midexam;
import java.util.Scanner;
public class number43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入度數：");
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        System.out.println(a*n+"x**"+(n-1));
    }
}
