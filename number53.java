package javatopic;
import java.util.*;
public class number53 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入n值：");
        int count=scanner.nextInt(); 
        String [] name=new String[count];
        String [] email=new String[count];
        for (int i = 0; i < count; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("請翰入姓名：");
            String number=scanner2.next(); 
            System.out.print("請翰入電子郵件：");
            String number2=scanner2.next(); 
            name[i]=number; 
            email[i]=number2;

             
        } 
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("請翰入要查詢電子郵件的姓名：");
        String a=scanner3.next(); 
        for (int i = 0; i < name.length; i++) {
            if (name[i].contains(a)) {
                System.out.println(email[i]);
                
            }
        }
    

        
    }
}
