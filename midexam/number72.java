package midexam;
import java.util.Scanner;
public class number72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入n：");
        int n=scanner.nextInt();  
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("請輸入k：");
        int k=scanner2.nextInt(); 
        System.out.println("Pctcr 可以抽"+(int)(Math.ceil(n/k)+n));
    }
}
