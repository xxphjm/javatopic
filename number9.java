package javatopic;
import java.util.Scanner;
public class number9 {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    System.out.print("請輸入兩字串：");
    String a=scanner.next();
    String b=scanner.next();
     if(b.contains(a)){
        System.out.println("yes");
     }
     else{
        System.out.println("no");
     }
  }
}
