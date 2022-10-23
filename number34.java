package javatopic;
import java.util.*;
public class number34 {
    
   public static void main(String[] args) {
    while (true){
        Scanner scanner = new Scanner(System.in);
            System.out.print("輸入一正整數：");
            int str=scanner.nextInt();   
        if (str>=11&&str<=1000) {
            if (str%2==0&&str%11==0&&str%5==0&&str%7!=0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            break;
        }
        else{
            System.out.println("錯誤");
            continue;
        }
    }   
}

}
