package javatopic;
import java.util.*;
public class number45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入月日：");
        int m=scanner.nextInt();
        int d=scanner.nextInt();
        int s=(m*2+d)%3;
        if (s==0) {
            System.out.println("普通");
        } 
        else if(s==1){
            System.out.println("吉");
        }
        else if(s==2){
            System.out.println("大吉");
        }
    }
}
